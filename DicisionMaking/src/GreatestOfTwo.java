
public class GreatestOfTwo {
	public static void main(String[] args) {
		
	java.util.Scanner SC=new java.util.Scanner(System.in);
	System.out.print("Enter first number: ");
    int a = SC.nextInt();

    System.out.print("Enter second number: ");
    int b = SC.nextInt();

	if (a > b) {
	    System.out.println("A is greatest " + a);
	} else if (b > a) {
	    System.out.println("B is greatest " + b);
	} else {
	    System.out.println("Both numbers are equal");
	}
	
	
}
}