import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    private static final String DEFAULT_LOCATION = "Kharkiv";

    public static void main(String[] args) {

        String location = DEFAULT_LOCATION;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Please, enter the location to find out the weather forecast [" + location + "]:> ");
            try {
                String userInput = reader.readLine();
                if (!userInput.isEmpty()) {
                    location = userInput;
                }
            } catch (IOException e) {
                System.out.println("Unable to read user input: " + e.getMessage());
            }

            System.out.println("Location set to: " + location);
            List<WeatherProvider> providers = new ArrayList<>();
            providers.add(new WeatherProviderOpenWeatherMap());
            providers.add(new WeatherProviderAccuWeather());

            //Request temperature data from the all  registered providers
            Iterator<WeatherProvider> it = providers.iterator();
            while (it.hasNext()) {
                WeatherProvider provider = it.next();
                try {
                    provider.requestTemperature(location);
                } catch (WeatherProvider.WeatherProviderException e) {
                    System.out.println(provider.getProviderName() + ":\t" + e.getMessage());
                    it.remove();
                }
            }

            // Wait for temperature data from all weather providers
            it = providers.iterator();
            Double sum = (double) 0;
            while (it.hasNext()) {
                WeatherProvider provider = it.next();
                try {
                    double t = provider.waitForTemperature();
                    System.out.println(provider.getProviderName() + ":\ttemperature: " + t);
                    sum += t;
                } catch (WeatherProvider.WeatherProviderException e) {
                    System.out.println(provider.getProviderName() + ":\t" + e.getMessage());
                    it.remove();
                }
            }

            // Calculate average temperature
            if (providers.size() != 0) {
                String result = new DecimalFormat("#.##").format(sum / providers.size());
                System.out.println("\nACCURATE TEMPERATURE in " + location + ": "
                        + result + " Celsius, calculated based on data from "
                        + providers.size() + " provider(s)\n");
            } else {
                System.out.println("\nUnable to get temperature for location '" + location + "' from any provider\n");
            }
        }
    }
}
