public class EvenOddBitwise {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = ((num & 1) == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}