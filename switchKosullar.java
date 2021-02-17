public class Main {
  public static void main(String[] args) {

		char grade = 'D';

		switch(grade){
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Durum: Geçtiniz.");
				break;
			case 'D':
				System.out.println("Durum: Şartlı Geçtiniz.");
				break;
			case 'F':
				System.out.println("Durum: Kaldınız.");
				break;
			default: 
				System.out.println("Geçersiz Not Girişi");
						

		}
  }
}