package PW9;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> text = new ArrayList<>();
        text.add("Погода была прекрасная, ещё прекраснее, чем прежде; \n" +
                "но жара всё не унималась. По ясному небу едва-едва неслись высокие и редкие облака, \n" +
                "изжелта- белые, как весенний запоздалый снег, плоские и продолговатые, \n" +
                "как опустившиеся паруса. Их узорчатые края, пушистые и лёгкие, как хлопчатая бумага, \n" +
                "медленно, но видимо изменялись с каждым мгновением: они таяли, эти облака, и от них не падало \n" +
                "тени");
        String fileName = "mytext.txt";

        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(text));
        bw.close();

        List<String> str = new ArrayList<>();

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String s;
        int count = 0;
        while ((s = br.readLine()) != null) {
            System.out.println("row " + ++count + " read:" + s.length());
            str.add(s);
            if (s.contains("паруса")) System.out.println(s);
        }
        br.close();
        String max = " ";
        String min = " ";
        for (String tmp : str) {
            if (tmp.length() > str.size()) {
                max = tmp;
            }
        }
        for (String nxt : str) {
            if (nxt.length() < str.size()) {
                min = nxt;
                }
            }
            System.out.println(max);
            System.out.println(min);
        }
    }