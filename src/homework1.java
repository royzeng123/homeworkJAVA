import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {
        final double FRIES= 1.09;
        final double BURGERS= 1.69;
        final double SODA= 0.99;
        final double PST=1.08;
        final double GST=1.05;
        double friesCost, burgerCost, sodaCost, totalCost;

        int amountF, amountB, amountS;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of fries:");
        amountF = scan.nextInt();
        firesCost= amountF*FRIES;
        System.out.println("Enter the number of burgers:");
        amountB = scan.nextInt();
        burgerCost= amountB*BURGERS;
        System.out.println("Enter the number of soda:");
        amountS= scan.nextInt();
        sodaCost= amountS*SODA;
        totalCost= (friesCost+burgerCost+sodaCost)*PST*GST;
        Sytem.out.println("The total cost is:" + totalCost);
        return 0;
    }
}