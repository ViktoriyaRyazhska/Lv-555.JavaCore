package HW5_1;

public class EmpArr {
    public static void main(String[] args) {
        int pay=0;
        Employee [] arr = new Employee[4];
        arr[0] = new SalariedEmployee("Katy",1, 2000, 222333);
        arr[1] = new ContractEmployee("Anny",2, 111222, 40, 25);
        arr[2] = new SalariedEmployee("Mane",1, 2000, 333444);
        arr[3] = new ContractEmployee("Donny",2, 555666, 45, 60);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i].calculatePay() > arr[j].calculatePay()){
                    Employee tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
            pay+=arr[i].calculatePay();
        }
        System.out.println(pay);
    }
}
