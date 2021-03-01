import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Koleksiyonlar dizilerin geliştirilmiş halidir.");

		ArrayList liste = new ArrayList();

		liste.add(1);
		liste.add(10);
		liste.add("Ankara");

		System.out.println(liste.size());

		liste.set(2,100);
		liste.remove(0);
		//liste.clear();

		System.out.println(liste.get(0));

		for (Object i:liste){
			System.out.println(i);
		}
  }
}