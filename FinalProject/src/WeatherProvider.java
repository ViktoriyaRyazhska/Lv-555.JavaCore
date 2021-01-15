/**
 * Base abstract weather provider class. Implements common logic of getting current weather data
 * from a weather provider in a separate thread.
 *
 * @author Maya Solodovnik
 */
public abstract class WeatherProvider {
    /**
     * Thread object used to request data from weather provider in a separate thread.
     */
    private Thread workThread = null;
    /**
     * Storage for the temperature value obtained form the weather provider
     */
    private Double temperature = null;
    /**
     * Storage for error messages that may occur in the worked thread.
     */
    private String errorMessage = "";

    /**
     * Sends HTTP request to the cloud weather provider to get current temperature.
     * The response shall be obtained via call to {@link #waitForTemperature()}
     * @param location City name to get weather for
     * @throws WeatherProviderException in case the weather cannot be obtained for the given city
     */
    public final void requestTemperature(String location) throws WeatherProviderException {
        if (workThread != null) {
            throw new WeatherProviderException("Already in progress");
        }
        errorMessage = "";
        workThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String locationId = getLocationId(location);
                    try {
                        temperature = getTemperature(locationId);
                    } catch (WeatherProviderException e) {
                        errorMessage = "Unable to get temperature data for location: " + e.getMessage();
                    }

                } catch (WeatherProviderException e) {
                    errorMessage = "Unable to get location ID: " + e.getMessage();
                }
            }
        });
        workThread.start();
    }

    /**
     * Waits until weather data requested via call to {@link #requestTemperature(String)} is received
     * from the cloud weather provider.
     * @return Temperature value
     * @throws WeatherProviderException in case one of the following errors occurs:
     *  <ul>
     *     <li>Weather data has not been requested using  {@link #requestTemperature(String)}</li>
     *     <li>The location is unknown</li>
     *     <li>Temperature value cannot be parsed from the response</li>
     *  </ul>
     */
    public final double waitForTemperature() throws WeatherProviderException {
        if (workThread == null) {
            throw new WeatherProviderException("Temperature was not requested");
        }
        try {
            workThread.join();
            workThread = null;
        } catch (InterruptedException e) {
            throw new WeatherProviderException("InterruptedException: " + e.getMessage());
        }
        if (temperature == null) {
            if (!errorMessage.isEmpty()) {
                throw new WeatherProviderException(errorMessage);
            } else {
                throw new WeatherProviderException("Internal error");
            }
        }
        return temperature;
    }

    /**
     * Weather provider specific method to get provider specific location ID for given location (city).
     * Different weather provider classes shall provide their own implementation
     * @param location City name
     * @return Weather provider specific location ID
     * @throws WeatherProviderException in case location ID cannot be obtained for the given city (unknown city)
     */
    protected abstract String getLocationId(String location) throws WeatherProviderException;

    /**
     * Weather provider specific method to get temperature value for given location ID. See {@link #getLocationId(String)}
     * Different weather provider classes shall provide their own implementation
     * @param locationId Location ID
     * @return Temperature value in degrees Celsius
     * @throws WeatherProviderException in case temperature cannot be obtained
     */
    protected abstract double getTemperature(String locationId) throws WeatherProviderException;

    /**
     * Returns weather provider name
     * @return weather provider name
     */
    public abstract String getProviderName();

    /**
     * Exceptions thrown in case of any error happens in WeatherProvider instance
     */
    static class WeatherProviderException extends Exception {
        public WeatherProviderException(String s) {
            super(s);
        }
    }

}
