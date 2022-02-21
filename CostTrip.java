import java.util.Scanner;

public class CostTrip {
	public static void main(String[] args) {
		/*We will calculate the cost of the trip by taking the user's distance to go, the cost
		of the gallon and how many miles to go in one gallon.
		Name=Umut     Surname=Bayar   Student Number=150120043 */
		Scanner scan=new Scanner(System.in); 
		double driving_Distance;
		double miles_Per_Gallon;
		double price_Per_Gallon;
		double total_Value;
		System.out.println("Enter the driving distance: ");
		driving_Distance= scan.nextDouble();
		System.out.println("Enter miles per gallon: ");
		miles_Per_Gallon= scan.nextDouble();
		System.out.println("Enter price per gallon: ");
		price_Per_Gallon= scan.nextDouble();
		total_Value=(driving_Distance/miles_Per_Gallon)*price_Per_Gallon;
		System.out.println("The cost of driving is $ "+(int)(total_Value*100)/100.0);
		
	}
}
