package HW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {
    public static void main(String[] args) throws IOException {
        String worlds;
        String bigWorld = " ";
        String secondWorld = " ";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter any 5 words");
        worlds = bf.readLine();
        String [] s = worlds.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (i == 1) secondWorld = s[i];
            if (s[i].length() > bigWorld.length())
                bigWorld = s[i];

            }
        StringBuffer sb = new StringBuffer(secondWorld);
        System.out.println(bigWorld);
        System.out.println(bigWorld.length());
        System.out.println(sb.reverse().toString());
        }
    }