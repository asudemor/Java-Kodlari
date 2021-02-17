public class Main {
  public static void main(String[] args) {

		String ogrenciler[] = new String[4];
		ogrenciler[0] = "Asude";
		ogrenciler[1] = "Beyza";
		ogrenciler[2] = "Turkan";
		ogrenciler[3] = "Huseyin";

		for(int i=0; i<ogrenciler.length; i++){
			System.out.println(ogrenciler[i]);	
		}

		System.out.println("---------------------------");	
	

		for(String ogrenci:ogrenciler){
			System.out.println(ogrenci);
		}

		System.out.println("---------------------------");	

		double[] myList = {1.2,1.3,5.7,3.9};
		double total = 0;
		double max = myList[0];

		for (double number : myList){
			if (max < number){
				max = number;
			}

			total += number;
			System.out.println(number);
		}

		System.out.println("Toplam: " + total);
		System.out.println("En büyük sayı: " + max);
		
  }
}