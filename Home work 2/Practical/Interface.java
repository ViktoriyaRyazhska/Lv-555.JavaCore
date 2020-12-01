public class Interface {
    public static void main(String[] args) {

        Emplotee e1 = new Emplotee();
        e1.setName("Igor");
        e1.setRate(150);
        e1.setHours(30);
        System.out.println(e1);
        System.out.println(e1.getSalary());
        System.out.println(e1.getBonuses());

        Emplotee e2 = new Emplotee("Anna", 200);
        e2.setHours(30);
        e2.changeRate(170);
        System.out.println(e2);
        System.out.println(e2.getSalary());

        Emplotee e3 = new Emplotee("Oleg", 200, 30);
        System.out.println(e3);
        System.out.println(e3.getSalary());
        System.out.println(e3.getBonuses());

        System.out.println(Emplotee.getTotalSum());
    }
}
