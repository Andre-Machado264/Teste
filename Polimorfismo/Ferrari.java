package polimorfismo;

public class Ferrari extends Carro {
//	int a;
	public Ferrari(){
		this(5);
		System.out.println("Ferrari default");
	}
	public Ferrari(int a){
//		super(5);
//		this();
		System.out.println("Ferrari inteiro");
		this.acelerar();
	}
//	public int getFerrari(){
//		return this.a;
//	}
	
	
	public void acelerar() {
		System.out.println("Ferrari acelerando...");
		super.acelerar();
		
	}
	
	public void acelerar(int velocidade){//metodo acelerar esta sobrecarregado
		System.out.println("Acelerando. Velocidade e: "+ velocidade+"KM/H");
	}


}