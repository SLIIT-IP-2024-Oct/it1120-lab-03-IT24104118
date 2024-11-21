import java.util.Scanner;

public class IT24104118Lab3Q4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input! Please enter a five-digit number.");
        }

        int digit1 = number / 10000;           
        int digit2 = (number % 10000) / 1000;  
        int digit3 = (number % 1000) / 100;    
        int digit4 = (number % 100) / 10;    
        int digit5 = number % 10;             
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}

