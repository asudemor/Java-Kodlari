class Main {
  public static void main(String[] args) {
		
		try{
			int[] sayilar = new int[]{1,2,3};
			System.out.println(sayilar[8]);
		} catch (Exception exception){
			System.out.println("Hata oluştu, hatanız: " + exception);
		} finally{
			System.out.println("Finally bloğu çalıştı.");			
		}
  }
}