import java.io.*;
import java.net.*;
import java.util.Map;

/**
 * The WeatherHTTPClient class implements an HTTP client to obtain weather data
 * from different weather providers via HTTP GET requests using their WEB API
 *
 * @author Maya Solodovnik
 */
public class WeatherHTTPClient {

    /**
     * HTTP connection
     */
    private HttpURLConnection connection;

    /**
     * Creates HTTP Client suitable to get weather data from weather providers using
     * HTTP GET request
     *
     * @param urlStr URL string
     * @param params query parameters
     * @throws WeatherHTTPClientException in case urlString is not a valid URL
     */
    public WeatherHTTPClient(String urlStr, Map<String, String> params) throws WeatherHTTPClientException {

        try {
            String paramsStr = ParameterStringBuilder.getParamsString(params);
            URL url = new URL(urlStr + paramsStr);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
        } catch (MalformedURLException e) {
            throw new WeatherHTTPClientException("Malformed URL: " + e.getMessage());
        } catch (UnsupportedEncodingException e) {
            throw new WeatherHTTPClientException("UnsupportedEncodingException: " + e.getMessage());
        } catch (ProtocolException e) {
            throw new WeatherHTTPClientException("ProtocolException: " + e.getMessage());
        } catch (IOException e) {
            throw new WeatherHTTPClientException("IOException: " + e.getMessage());
        }
    }

    /**
     * Sets connection timeout in milliseconds for given HTTP connection
     *
     * @param milliseconds connection timeout in milliseconds
     * @return Reference to itself
     */
    public WeatherHTTPClient setConnectionTimeout(int milliseconds) {

        connection.setConnectTimeout(milliseconds);
        return this;
    }

    /**
     * Sets read timeout in milliseconds for given HTTP connection
     *
     * @param milliseconds timeout to read data from the server in milliseconds
     * @return Reference to itself
     */
    public WeatherHTTPClient setReadTimeout(int milliseconds) {

        connection.setReadTimeout(milliseconds);
        return this;
    }

    /**
     * Executes HTTP GET request
     *
     * @return Response data as a string
     * @throws WeatherHTTPClientException in case the response is invalid or
     *                                    connection timed out
     */
    public String getResponse() throws WeatherHTTPClientException {

        String ret = "";
        try {
            int status = connection.getResponseCode();
            Reader streamReader;
            if (status > 299) {
                streamReader = new InputStreamReader(connection.getErrorStream());
            } else {
                streamReader = new InputStreamReader(connection.getInputStream());
            }

            BufferedReader in = new BufferedReader(streamReader);
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            ret = content.toString();
            connection.disconnect();
        } catch (UnknownHostException e) {
            throw new WeatherHTTPClientException("Unable to reach server '" + connection.getURL().getHost());
        } catch (IOException e) {
            throw new WeatherHTTPClientException("Unknown exception '" + e.getMessage());
        }
        return ret;
    }

    /**
     * Helper class used to add HTTP request parameters in form '?param1=val1&param2=val2...' to the server URL
     */
    private static class ParameterStringBuilder {
        /**
         * Returns param string built from the given list of parameters
         *
         * @param params list of parameters
         * @return String of parameters in form '?param1=val1&param2=val2...'
         * @throws UnsupportedEncodingException in case any parameter cannot be encoded to UTF-8
         */
        public static String getParamsString(Map<String, String> params)
                throws UnsupportedEncodingException {
            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, String> entry : params.entrySet()) {
                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                result.append("&");
            }

            String resultString = result.toString();
            if (resultString.length() > 0) {
                //remove trailing &, and add leading ? to the paramString
                resultString = "?" + resultString.substring(0, resultString.length() - 1);
            }
            //System.out.println(resultString);
            return resultString;
        }
    }

    /**
     * Exception thrown in case of any error happens in WeatherHTTPClient instance
     */
    static class WeatherHTTPClientException extends Exception {

        public WeatherHTTPClientException(String s) {
            super(s);
        }
    }

}
