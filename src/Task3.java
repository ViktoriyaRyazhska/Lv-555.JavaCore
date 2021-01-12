public class Task3 {
    public final double DOLLAR_RATE = 28.03;
    private double sumGryvna;

    public  void calcSumDollars(double sumGryvna){
        double sumDollar = sumGryvna / DOLLAR_RATE;
        double change = sumDollar % DOLLAR_RATE;
        System.out.println("Sum in dollars is " + Math.round(sumDollar) + " and change is " + change);
    }
}
