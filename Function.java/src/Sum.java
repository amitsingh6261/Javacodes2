public class Sum {

    // Function to calculate sum
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = sum(num1, num2);

        System.out.println("Sum = " + result);
    }
}