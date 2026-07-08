public class CheckAxis{
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point lies at Origin");
        } else if (y == 0) {
            System.out.println("Point lies on X-axis");
        } else if (x == 0) {
            System.out.println("Point lies on Y-axis");
        } else {
            System.out.println("Point does not lie on X-axis, Y-axis, or Origin");
        }

        sc.close();
    }
}