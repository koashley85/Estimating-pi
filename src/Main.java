//This program was writtern by Kavion Ashley
public class Main {
    public static void main(String[] args) {
        char pi = 960;
        System.out.println("Estimating Pi " + pi);
        //p1 is used to calculate first number in problem
        //p2 is used to calculate second number in problem
        //multiplier is the amount that is multiplied by the first and second calculations
        double pi1, pi2, firstCalculation, secondCalculation, multiplier = 4.0;
        firstCalculation = (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) );
        secondCalculation = firstCalculation + (1.0/13.0);

        pi1 = multiplier * firstCalculation;
        pi2 = multiplier * secondCalculation;

        System.out.println(pi1);
        System.out.println(pi2);
    }
}