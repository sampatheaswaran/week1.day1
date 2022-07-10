package week1.day1;

public class Prime {

	public static void main(String[] args) {
		int n = 12;
		boolean prime = true;
		
		for (int i = 2; i < n; i++) {
			
			if(n%i == 0) {
				prime = false;
				break;
			}
		}
		if (prime)
			System.out.println("Is a prime number");
		else
			System.out.println("Is not a prime number");
	}

}