package estatico;

public class Frog {
	
	public static int counter;
	public static int frogCount ;
	public static String c;
	public static float f;

	public int a;

	public Frog() {
		c = "teste";
		frogCount = 1;
		f = (float) 1.25;
		a = 25;
	}
	
	public void method(){
		System.out.println("Acessando o metodo nao estatico");
	}

	public static void methodStatic(){
		System.out.println("Acessando o metodo estatico 2");
	}
	
	public static void main(String[] args) {
			new Frog();
			new Frog();
			new Frog();
		
		System.out.println("Frog count is now: " + frogCount);
	}
}
