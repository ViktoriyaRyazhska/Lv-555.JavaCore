public class Sstask {
    public static void main(String[] args) {
        Employee w1 = new Employee("Tom",10,20);
        Employee w2 = new Employee("Bob",23,25);
        Employee w3 = new Employee();
        System.out.println(w1);
        w1.changeRate(20);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println();
        System.out.println("Total salary is: " + Employee.getTotalSum());
    }
}
    class Employee {
        static double totalSum;
        private String name;
        private double rate;
        private int hours;

        public Employee() {
            name = "None";
            rate = 0;
            hours = 0;
            totalSum += getSalary();
        }
        public Employee(String name, double rate, int hours) {
            this.name = name;
            this.rate = rate;
            this.hours = hours;
            totalSum += getSalary();
        }
            public static double getTotalSum(){
                return totalSum;
            }
        public double getSalary() {
            return rate * hours;
        }
        public String toString() {
            return "Name: " + name + "\n" + "Rate: " + rate + "\n" +
                    "Work hours: " + hours + "\n" + "Salary :" + getSalary();
        }
        public void changeRate(int rate){
            totalSum -= this.getSalary();
            this.rate = rate;
            totalSum += this.getSalary();
        }
        public double getBonuses(){
            return getSalary() * 0.1;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
//        public void setRate(int rate) {
//            totalSum -= this.getSalary();
//            this.rate = rate;
//            totalSum += this.getSalary();
//        }
        public double getRate() {
            return rate;
        }
        public void setHours(int hours) {
            totalSum -= this.getSalary();
            this.hours = hours;
            totalSum += this.getSalary();
        }
        public int getHours() {
            return hours;
        }

    }

