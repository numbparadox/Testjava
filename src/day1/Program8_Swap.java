package day1;

public class Program8_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swap by xor operation
		int num1 = 10, num2=7;
		
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		num1 = 10;
		num2 = 7;
		int temp = 0;
		
		temp = num1;
		num1 = num2; //7
		num2 = temp; //10
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		num1 = 10;
		num2 = 7;
		
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		

	}

}
