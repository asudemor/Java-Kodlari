import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Adınız: ");

		String isim = scanner.nextLine();

		System.out.println("Merhaba " + isim);

	}
}