public class Square {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = square(num);

        System.out.println("Square = " + result);
    }
}