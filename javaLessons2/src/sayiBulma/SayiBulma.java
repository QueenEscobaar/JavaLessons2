package sayiBulma;
//ilk hafta bunu yapmayı unutmuşum ondan şimdi yapıp ekledim.

public class SayiBulma {

	public static void main(String[] args) {
	int[] sayilar = new int[] {1,2,3,4,5,7,9,0};
	int aranacak =6;
	boolean varMi=false;
	
	for (int sayi : sayilar) {
		if(sayi==aranacak) {
			varMi=true;
			break;
		}
	}
	
	if(varMi) {
		System.out.println("Sayı mevcuttur");
	}
	else {
		System.out.println("Sayı mevcut değildir");
	}
	}
	
	

	}


