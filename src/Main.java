import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M = sc.nextInt();

        System.out.print("Enter the initial temperature in Fahrenehit: ");
        double temp1 = (sc.nextDouble()-32)/1.8;
        //double tem1 = (temp1-32)/1.8;

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double temp2 = (sc.nextDouble()-32)/1.8;
        //double tem2 = (temp2-32)/1.8;

        //double M = m/1000;
        //double T = (temp2-temp1-32)/1.8;
        double Q = (M/1000)*(temp2-temp1)*4184;

        System.out.printf("The energy needed is %.6e",Q);

    }
}