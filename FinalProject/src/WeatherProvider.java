public abstract class WeatherProvider {
    private Thread workThread = null;
    private Double temperature = null;
    private String errorMessage = "";

    public final void requestTemperature(String location) throws WeatherProviderException {
        if (workThread != null) {
            throw new WeatherProviderException("Already in progress");
        }
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

    protected abstract String getLocationId(String location) throws WeatherProviderException;

    protected abstract double getTemperature(String locationId) throws WeatherProviderException;

    public abstract String getProviderName();

    /**
     * Exception thrown in case of any error happens in WeatherProvider instance
     */
    static class WeatherProviderException extends Exception {
        public WeatherProviderException(String s) {
            super(s);
        }
    }

}
