package sayibulma;

public class main {

	public static void main(String[] args) {
		int [] sayilar=new int [] {1,2,5,7,9,0};
		int aranacak=5;
		boolean varmi=false;
		
		for(int i=0;i<sayilar.length-1;i++) 
		{
			varmi=true;
			break;
		}
		
		
		if(varmi) {
			System.out.println("Sayı Mevcuttur");
		}
		else {
			System.out.println("Sayı Mevcut Değildir");
		}
	}

}
