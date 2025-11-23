import java.util.*;

// Electricity Bill Calculator 

public class practice1 {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Electricity Units");
        int units= sc.nextInt();

        double bill= 0;

        if (units <= 100){
            bill= units * 5;
        }
        else if(units <= 300){
            bill= (100 * 5) + (units - 100) * 7;
        }
        else {
            bill = (100 * 5) + (200 * 7) + (units - 300) * 10;
        }

        // additional Charges 
        double fixedcharge= 150;             // Constant 
        double fuelcharge= bill * 0.05;     // 5% fuel charge 

        double totalbill = bill + fixedcharge + fuelcharge;

        System.out.println("\n----------------- Electricity Bill Details -----------------");
        System.out.println("Units Consumed :  " + units);
        System.out.println("Energy Charge  : Rs " + bill);
        System.out.println("Fixed Charge   : Rs " + fixedcharge);
        System.out.println("Fuel Charge    : Rs " + fuelcharge);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total Bill : Rs " + totalbill);

        System.out.println("This is G-Pay No. 8010124600 You Can Pay Online ");
        
        

        System.out.println("Thank You ");
    }
}
