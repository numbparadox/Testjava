package day1;

public class Program5_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//smaller--->Bigger Implicit
		int num = 10;
		float marks = num;
		System.out.println(marks);
		
		//explicit type casting
		double bankBalance = 98.787867;
		int data =(int)bankBalance;
		System.out.println(data);
	}

}
