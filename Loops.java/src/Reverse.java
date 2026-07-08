public class Reverse {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
	            
				while (num>0) {
				  int a=num%10; 
				System.out.print(a); 
					num=num/10;
				  
				}
				  
				  
	}

}
