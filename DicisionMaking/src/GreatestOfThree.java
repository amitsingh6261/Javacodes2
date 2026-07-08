public class GreatestOfThree {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is greatest: " + a);
        } else if (b > c) {
            System.out.println("B is greatest: " + b);
        } else {
            System.out.println("C is greatest: " + c);
        }

        sc.close();
    }
}