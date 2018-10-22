public class randomCode{
	
	public static void main(String[] args){
		/*
		int og = 10;
		int less = 2;
		int repeats = giveMeTimestoRepeat(og, less);
		repeats = repeats +1;
		//int repeats = 6;
		String myName = "eric";
		displayHi(repeats, myName);
		//displayHi();
		
		String nama = "Warren";
		System.out.println("og in main " + nama);
		wOrJ(nama);
		System.out.println("new in main " + nama);
		*/
	}

	public static void displayHi(){
		System.out.println("yo");
		System.out.println("me rob.");
	}

	public static void displayHi(int numTimesSayHi, String s){
		for(int counter=0;counter<numTimesSayHi;counter++){
			System.out.println("yo");
			System.out.println("me " + s +".");
		}
		
	}

	public static int giveMeTimestoRepeat(int ogtimessayhi, int howmanytimeslesstosayhi){
		return ogtimessayhi - howmanytimeslesstosayhi;
	}

	public static void wOrJ(String n){
		System.out.println("og in method " + n);
		n = "Joe";
		System.out.println("new in method " + n);
	}
}