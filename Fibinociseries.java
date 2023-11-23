import java.util.Scanner;
class Fibinociseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int first=0,second=1,next = 1,i,number;
	System.out.println("Enter a number");
	Scanner s1=new Scanner(System.in);
	number=s1.nextInt();
	for( i=0;i<number;i++) {
		if(i<=1) {
			next=i;
		}
		else {
			next=first+second;
			first=second;
			second=next;
		}
	}
	System.out.print(" "+next);	
	}

}
