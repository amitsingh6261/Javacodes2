
public class IfEx1 {
  public static void main(String[] args) {
	java.util.Scanner SC=new java.util.Scanner(System.in);
	System.out.println("Enter your age");
	int age=SC.nextInt();
	if(age<0 || age>120) {
	}else if(age<=4) {
		System.out.println("Your are Infant");
		}else if(age<=19){
	  System.err.println("you are teenager");
	  }else if(age<=50){
		  System.out.println("you are Adult");
	  }else if(age<=80){
		  System.out.println("you are Old");
	  }else{
		  System.out.println("Kabhi bhi jane wala");
	  }
}
}
