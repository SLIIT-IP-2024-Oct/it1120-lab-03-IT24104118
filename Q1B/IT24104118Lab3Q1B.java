import java.util.Scanner ;
public class IT24104118Lab3Q1B
{
  public static void main(String[]args)
  { 
    double pricePerKg, quantity, totalAmount;
    Scanner input = new Scanner (System.in);
	System.out.print("Enter the price of 1kg of rice: ");
	pricePerKg = input.nextDouble();
	System.out.print("Enter the number of kilograms you want to buy: ");
	quantity = input.nextDouble();
	totalAmount = pricePerKg * quantity;
	double discount = totalAmount * 0.1 ;
	totalAmount= totalAmount - discount;
	System.out.println();
	System.out.println("The total amount is: " + totalAmount);
	}
}