import java.util.Scanner;

public class Calculator_Demo {
    public static void main(String[] args) {
        char operator;
        Double num1,num2,result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose operator +, -, * or /");
        operator = input.next().charAt(0);

        System.out.println("Enter First Number");
        num1= input.nextDouble();

        System.out.println("Enter Second Number");
        num2 = input.nextDouble();
}
