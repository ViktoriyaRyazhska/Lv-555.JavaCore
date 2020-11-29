public class Sstask2 {
    public static void main(String[] args) {
        Student st1 = new Student("Sawyer",20);
        Student st2 = new Student("Tom", 30);
        Student st3 = new Student();
        st3.setRating(10);
        st1.setRating(40);
        System.out.println(st3);
        Student.displayAverage();
        Student.displaySumm();
        System.out.println(st2.betterStudent(st3));
    }
}
    class Student {
        private String name;
        private double rating;
        public static int stCount = 0;
        public static double sumRating = 0;

        public Student() {
            this.name = "None";
            this.rating = 0;
            this.stCount++;
            this.sumRating += rating;
        }

        public Student(String name, int rating) {
            this.name = name;
            this.rating = rating;
            this.stCount++;
            this.sumRating += rating;
        }
        public boolean betterStudent(Student st) {
                return st.getRating() < this.rating;
        }
        public void allInfo() {
            System.out.printf(name + "," + rating + ",");
        }
        static void displayAverage() {
            System.out.println("Average rating is: " + (sumRating / stCount));
        }
        static void displaySumm() {
            System.out.println("Sum of ratings is: " + sumRating);
        }
        @Override
        public String toString() {
            return "Name: " + name + "\n" + "Rating: " + rating + "\n" +
                    "Student number: " + stCount;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setRating(int rating) {
            sumRating -= this.rating;
            this.rating = rating;
            sumRating += rating;

        }
        public double getRating() {
            return rating;
        }
    }

