package day1pt2;

public class Program3_NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		char gender = 'F';
		if(age==18)
		{
			if(gender=='F')
				System.out.println("congrats on your first vote girl");
			else
				System.out.println("congrats on your first vote boy");
		}
		if(age>=18)
			System.out.println("you can vote");
		else
			System.out.println("you cannot vote");
	}

}
