import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"A");
        employeeMap.put(2,"B");
        employeeMap.put(3,"C");
        employeeMap.put(4,"D");
        employeeMap.put(5,"E");
        employeeMap.put(6,"F");
        employeeMap.put(7,"G");
        System.out.println(employeeMap);
        findValue(1,employeeMap);
        findID("C",employeeMap);
    }public static void findValue(int id, Map<Integer, String> map){
        if(map.containsKey(id)){
            System.out.println(map.get(id));
        }else{
            System.out.println("There is no " + id);
        }
    }public static void findID(String value, Map<Integer, String> map){
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            if(map.containsValue(value)){
                if(entry.getValue().equals(value)){
                    System.out.println(entry.getKey());
                }

            }else {
                System.out.println("There is no " + value);
                break;
            }
        }
    }
}

