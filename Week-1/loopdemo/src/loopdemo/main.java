package loopdemo;

public class main {

	public static void main(String[] args) {

		
		//For
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("For Döngüsü Bitti");

		int i=2;
		
		//While
		while(i<10) 
		{
			System.out.println(i);
			
			i+=2;
		}
		
		System.out.println("While Döngüsü Bitti");
		
		
		int j=100;
		
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10);
		
		System.out.println("Do While Döngüsü Bitti");
			
	}

}
