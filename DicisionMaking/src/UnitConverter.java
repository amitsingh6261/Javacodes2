public class UnitConverter {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("1. KM to M");
        System.out.println("2. M to CM");
        System.out.println("3. CM to MM");
        System.out.println("4. M to KM");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Meters = " + (value * 1000));
                break;

            case 2:
                System.out.println("Centimeters = " + (value * 100));
                break;

            case 3:
                System.out.println("Millimeters = " + (value * 10));
                break;

            case 4:
                System.out.println("Kilometers = " + (value / 1000));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}