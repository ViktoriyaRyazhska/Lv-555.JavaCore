import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(30));
            if(myCollection.get(i) > 5){
                newCollection.add(i);
            }
        }
        System.out.println(myCollection);
        System.out.println(newCollection);
        Iterator<Integer> integerIterator = myCollection.iterator();
        while(integerIterator.hasNext()){
            Integer nextInt = integerIterator.next();
            if(nextInt > 20){
                integerIterator.remove();
            }
        }
        System.out.println(myCollection);
        CheckAndAdd(myCollection, 2,-1);
        CheckAndAdd(myCollection,5,-3);
        CheckAndAdd(myCollection,8,-4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i +"," + " value " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println(myCollection);

        //признаюсь, підглянува це рішення. Воно найкомпактніше, мені сподобалось, але я в ньому розібрався, не копіпастнув.
    }public static void CheckAndAdd (List<Integer> integerList, int index, int element) {
        if(integerList.size() >= index){
            integerList.add(index,element);
        }
    }

}



