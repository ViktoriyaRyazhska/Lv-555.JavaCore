import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("To", "Sawyer212"));
        users.add(new User("Huck", "Finn222"));
        users.add(new User("Mark", "Twain123333213123123123123222"));
        users.add(new User("LandoNorris1233324452345", "Norris222"));
        users.add(new User("Tony", "2"));
        arrayNamesValid(users);
        userNameValid("Tomas");
        userNameValid("To");
    }
    //        users.forEach(user -> System.out.println(user.getName().matches("[\\w]{3,15}")));
    public static void arrayNamesValid(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().matches(("[\\w]{3,15}"))) {
                System.out.println("Name: " + "\"" + users.get(i).getName() + "\"" + " is valid");
            } else {
                System.out.println("Name: " + "\"" + users.get(i).getName() + "\"" + " is not valid");
            }
        }
    }
    public static void userNameValid(String name) {
        if (name.matches("[\\w]{3,15}")) {
            System.out.println("Name: " + name +  "is valid");
        } else {
            System.out.println("Name: " + name +  "is valid");
        }
    }
}
