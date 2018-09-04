import java.util.Scanner;

public class TwoIntegersRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int input1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int input2 = scanner.nextInt();
        System.out.println();

        TwoIntegers twoIntegers = new TwoIntegers(input1, input2);
        System.out.println("Input 1: " + twoIntegers.getNumber1() + ", Input 2: " + twoIntegers.getNumber2());
        System.out.println("Arithmetic: " + twoIntegers.arithmetic());
        System.out.println("Largest out of the two inputs: " + twoIntegers.larger());
        System.out.println("Sum is even: " + twoIntegers.isEven());
        System.out.println("First number is multiple of second number: " + twoIntegers.isMultiple());
    }
}
