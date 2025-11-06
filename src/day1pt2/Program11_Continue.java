package day1pt2;

public class Program11_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int num = 0;
		while(num<=9) 
		{
			++num;
			if(num==5)
				continue;
			System.out.print(num+" ");
			
		}
		System.out.println("\nBye");
	}

}
