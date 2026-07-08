public class NestedIfEx1 {
	public static void main(String[] args) {
java.util.Scanner Sc=new java.util.Scanner(System.in);
System.out.println("enter the number");
int n=Sc.nextInt();
if(n>0){
	System.out.println("positive");
	if(n%2==0) {
		System.out.println("Even");
	
}else {
		System.out.println("odd");
}
 }else if(n<0) {
		System.out.println("Negative");
}else {
		System.out.println("Zero");
	}

}
}
