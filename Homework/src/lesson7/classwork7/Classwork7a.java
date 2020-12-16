package lesson7.classwork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Classwork7a {
    public static void main(String[] args) throws IOException {

        List<Integer> myCollection = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            myCollection.add(Integer.parseInt(reader.readLine()));
        }


        //Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
        System.out.println("\n\t-----Task 1-----");
        List<Integer> newCollection = new ArrayList<>();
        for(Integer n: myCollection){
            if(n > 5){
                newCollection.add(n);
            }
        }
        printArray(newCollection);


        //Remove from collection myCollection elements, which are greater then 20. Print result
        System.out.println("\n\t-----Task 2-----");
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) > 20){
                myCollection.remove(myCollection.get(i));
                i--;
            }
        }
        printArray(myCollection);


        //Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
        System.out.println("\n\t-----Task 3-----");
        checkSizeAddElement(myCollection, 2, 1);
        checkSizeAddElement(myCollection, 8, -3);
        checkSizeAddElement(myCollection, 5, -4);
        for (int i = 0; i < myCollection.size(); i++){
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }


        //Sort and print collection
        System.out.println("\n\t-----Task 4-----");
        Collections.sort(myCollection);
        printArray(myCollection);
        Collections.sort(newCollection);
        printArray(newCollection);

    }

    public static void printArray(List<Integer> list){
        for (Integer n: list){
            System.out.println(n);
        }
    }

    public static void checkSizeAddElement(List<Integer> list, int index, int element){
        if(list.size() >= index){
            list.add(index, element);
        }
    }
}
