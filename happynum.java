# Happynum
import java.util.Scanner;
public class HappyNum {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

int input=new Scanner(System.in).nextInt();
int values=0;
while(input>=10){
	values=0;
	while(input!=0){
		int temp=input%10;
		values=values+(temp*temp);
		input=input/10;
	}
	input=values;
}
if(input==1){
	System.out.println("happy");
}
else
	System.out.println("not happy");
	}

}
