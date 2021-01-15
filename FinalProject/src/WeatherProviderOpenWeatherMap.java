import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

//TODO add documentation

public class WeatherProviderOpenWeatherMap extends WeatherProvider {
    private static final String PROVIDER_NAME = "\"Open Weather Map\"";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";
    private static final String API_KEY_NAME = "appid";
    private static final String API_KEY_VALUE = "f449bcc1a6db1b3bb2d02470295129b1";
    private static final String CITY_KEY_NAME = "q";
    private static final String UNITS_KEY_NAME = "units";
    private static final String UNITS_KEY_VALUE = "metric";

    @Override
    protected String getLocationId(String location) {
        return location;
    }

    @Override
    protected double getTemperature(String locationId) throws WeatherProviderException {
        Map<String, String> params = new HashMap<>();
        params.put(API_KEY_NAME, API_KEY_VALUE);
        params.put(CITY_KEY_NAME, locationId);
        params.put(UNITS_KEY_NAME, UNITS_KEY_VALUE);
        double temperature = 0;
        try {
            WeatherHTTPClient client = new WeatherHTTPClient(API_URL, params);
            String response =
                    client.setConnectionTimeout(5000)
                            .setReadTimeout(5000)
                            .getResponse();
            JSONObject jsresp = new JSONObject(response);
            //System.out.println("RESP " + jsresp);

            Integer error_code = jsresp.getInt("cod");
            if (error_code != 200) {
                String m = (String) jsresp.get("message");
                throw new WeatherProviderException("Error response: " + m);
            }

            temperature = jsresp.getJSONObject("main").getDouble("temp");

        } catch (WeatherHTTPClient.WeatherHTTPClientException e) {
            throw new WeatherProviderException("Network error: " + e.getMessage());
        } catch (JSONException e) {
            e.printStackTrace();
            throw new WeatherProviderException("Wrong response format");

        }
        return temperature;
    }

    @Override
    public String getProviderName() {
        return PROVIDER_NAME;
    }
}
