public class MaxOf3 {

    // Function with return
    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result = max(a, b, c);

        System.out.println("Maximum = " + result);
    }
}



// without return value

//public class MaxOf3 {
//
//   
//    static void max(int a, int b, int c) {
//        if (a >= b && a >= c) {
//            System.out.println("Maximum = " + a);
//        } else if (b >= a && b >= c) {
//            System.out.println("Maximum = " + b);
//        } else {
//            System.out.println("Maximum = " + c);
//        }
//    }
//
//    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//
//        System.out.print("Enter third number: ");
//        int c = sc.nextInt();
//
//        max(a, b, c);
//    }
//}