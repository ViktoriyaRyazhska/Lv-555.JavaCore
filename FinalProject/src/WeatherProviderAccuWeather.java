import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Extends Weatherprovider class providing implementation specific for Accu Weather Map cloud weather provider
 */
public class WeatherProviderAccuWeather extends WeatherProvider {
    /**
     * Provider name
     */
    private static final String PROVIDER_NAME = "\"AccuWeather\"";

    /**
     * Weather provider WEB API URL to get location ID for a city
     */
    private static final String LOCATION_API_URL = "http://dataservice.accuweather.com/locations/v1/cities/search";

    /**
     * Provider WEB API URL to get current weather conditions for given location ID
     */
    private static final String WEATHER_API_URL = "http://dataservice.accuweather.com/currentconditions/v1/";

    /**
     * HTTP GET parameter name to specify the user application key used to access provider API
     */
    private static final String API_KEY_NAME = "apikey";

    /**
     * API key value
     */
    private static final String API_KEY_VALUE = "JmwOQR7OZaRYABfIhPFyyqPdv9qL4jFv";

    /**
     * HTTP GET parameter to specify city
     */
    private static final String CITY_KEY_NAME = "q";

    @Override
    protected String getLocationId(String location) throws WeatherProviderException {
        Map<String, String> params = new HashMap<>();
        params.put(CITY_KEY_NAME, location);
        params.put(API_KEY_NAME, API_KEY_VALUE);

        try {
            WeatherHTTPClient client = new WeatherHTTPClient(LOCATION_API_URL, params);
            String response =
                    client.setConnectionTimeout(5000)
                            .setReadTimeout(5000)
                            .getResponse();

            try {
                JSONArray m = new JSONArray(response);
                if (m.isEmpty()) {
                    throw new WeatherProviderException("Location not found");
                }
                return m.getJSONObject(0).getString("Key");
            } catch (JSONException e) {
                throw new WeatherProviderException("Wrong response format: " + e.getMessage());
            }
        } catch (WeatherHTTPClient.WeatherHTTPClientException e) {
            throw new WeatherProviderException("Unable to get location id response: " + e.getMessage());
        }
    }

    @Override
    protected double getTemperature(String locationId) throws WeatherProviderException {
        Map<String, String> params = new HashMap<>();
        params.put(API_KEY_NAME, API_KEY_VALUE);
        double temperature = 0;
        try {
            WeatherHTTPClient client = new WeatherHTTPClient(WEATHER_API_URL + locationId, params);
            String response =
                    client.setConnectionTimeout(5000)
                            .setReadTimeout(5000)
                            .getResponse();

            JSONArray m = new JSONArray(response);
            Object o = m.get(0);
            if (o instanceof JSONObject) {
                Object t = ((JSONObject) o).get("Temperature");
                if (t instanceof JSONObject) {
                    Object metric = ((JSONObject) t).get("Metric");
                    if (metric instanceof JSONObject) {
                        Object value = ((JSONObject) metric).get("Value");
                        if (value instanceof Number) {
                            temperature = ((Number) value).doubleValue();
                        } else {
                            throw new WeatherProviderException("Unable to read temperature value from HTTP response");
                        }
                    } else {
                        throw new WeatherProviderException("Unable to read section Metric from HTTP response");
                    }
                } else {
                    throw new WeatherProviderException("Unable to read section Temperature  from HTTP response");
                }
            } else {
                throw new WeatherProviderException("Unable to parse JSON object from the HTTP response");
            }

        } catch (WeatherHTTPClient.WeatherHTTPClientException e) {
            throw new WeatherProviderException("Network error: " + e.getMessage());
        }
        return temperature;
    }

    @Override
    public String getProviderName() {
        return PROVIDER_NAME;
    }
}
