
public class AbsoluteNum {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    if (a<0) {
    	a=-a;
    }
    System.out.println("Absolute number is: "+a);
}
}
