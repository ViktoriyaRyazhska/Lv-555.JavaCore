import java.io.*;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        String fileName = "Mytext.txt";
        File file = new File(fileName);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("The Democratic Party of US President-elect Joe Biden is on the verge of taking control of the Senate as results come in from two elections in Georgia.\n" +
                    "\n" +
                    "Raphael Warnock, a pastor from Atlanta, is projected to have won one of the seats. The other is on a knife-edge.\n" +
                    "\n" +
                    "If the Democrats win both, Mr Biden will have a much better chance of pushing through his legislative agenda.\n" +
                    "\n" +
                    "The election is being rerun because of Georgia's rule that a candidate must take 50% of the vote in order to win.\n" +
                    "\n" +
                    "None of the candidates in November's general election met that threshold.\n" +
                    "\n" +
                    "Follow our live updates\n" +
                    "With 98% of votes counted, US TV networks and the Associated Press news agency called the first of the two races for Mr Warnock.\n" +
                    "\n" +
                    "Control of the Senate in the first two years of Mr Biden's term will be determined by the outcome of the second run-off.\n" +
                    "\n" +
                    "Mr Warnock is set to become the first black senator for the state of Georgia - a slavery state in the US Civil War - and only the 11th black senator in US history.\n" +
                    "\n" +
                    "Claiming victory, he paid tribute to his mother, Verlene, who as a teenager worked as a farm labourer.\n" +
                    "\n" +
                    "\"The other day - because this is America - the 82-year-old hands that used to pick somebody else's cotton went to the polls and picked her youngest son to be a United States senator,\" he said.\n" +
                    "\n" +
                    "Although the Democrats would need to take both seats to gain full control of Congress, the Republican party of outgoing President Donald Trump only needs to win one in order to retain the Senate.\n" +
                    "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        fileStrings(fileName);
        textTasks(fileStrings(fileName));

    }

    public static ArrayList<String> fileStrings(String fileName) {
        ArrayList<String> arr = new ArrayList<>();
        String temp = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((temp = br.readLine()) != null) {
                if (!temp.isEmpty()) {
                    arr.add(temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public static void textTasks(ArrayList<String> arr) {
        String longest = arr.get(0);
        String shortest = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("line " + (i+1) + " Have a " + arr.get(i).length() + " symbols");
            if (arr.get(i).length() > longest.length()) {
                longest = arr.get(i);
            }
            if (arr.get(i).length() < shortest.length()) {
                shortest = arr.get(i);
            }
            if (arr.get(i).contains("Trump")){
                System.out.println("CONTAINS: " + arr.get(i));
            }
        }
        System.out.println("Longest line have:" +longest.length() + " symbols, and here it is: \n" + longest);
        System.out.println("Shortest line have:" +shortest.length() + " symbols, and here it is: \n" +  shortest);
    }
}

