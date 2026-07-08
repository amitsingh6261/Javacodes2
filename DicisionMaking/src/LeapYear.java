
public class LeapYear {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Enter the year: ");
    int year = sc.nextInt();
    
    if (year%4==0) {
    	System.out.println("year is a leap year");
    }else
    	System.out.println("year is not leap year ");
}
}
