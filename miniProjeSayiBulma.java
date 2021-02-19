public class Main {
  public static void main(String[] args) {

		int sayilar[] = new int[]{1,6,3,8,95};
		int aranan = 3;
		boolean varMi = false;

		for (int sayi : sayilar){
			if(sayi == aranan){
				varMi = true;
			}
		}

		if (varMi){System.out.println(aranan + " listede var.");}
		else{System.out.println(aranan + " listede yok.");}

	}
}