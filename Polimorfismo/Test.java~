/***************************************************************
Nome: Andre Machado

Programa para teste de funcionamento do polimorfismo em java
***************************************************************/
package polimorfismo;

public class Test {

	public static void main(String[] args) {

		System.out.println("CONVERSAO DE VARIAVEIS:\n");
		//conversao de variaveis
		Ferrari f1 = new Ferrari(5);
		Ferrari f2 = new Ferrari();
		Ferrari f3 = new Ferrari();
		Carro c1 = new Carro();
		Carro c2 = new Ferrari();
		Carro c3 = new Carro();
		Ferrari f4 = new Ferrari();
//		System.out.println(f1.getFerrari());
		
//		f1 = c1; //nao consegue fazer conversao implicita redutora
		c2 = f4;
		//conversao implicita generalizadora
		c1.acelerar();
		f1.acelerar();
		c1 = f1;
		c1.acelerar();
		f1.acelerar();
		System.out.println();
		
		//conversao explicita redutora
		c2.acelerar();
		f2.acelerar();
    	f2 = (Ferrari) c2;//para funcionar, deve ser inicializada como ferrari
		c2.acelerar();
		f2.acelerar();
		System.out.println();
				
		//conversao explicita generalizadora
		c3.acelerar();
		f3.acelerar();
		c3 = (Carro) f3;
		c3.acelerar();
		f3.acelerar();
		System.out.println("\n-------------------------------------\n-------------------------------------\n");

		
//-------------------------------------------------------------------		
		System.out.println("POLIMORFISMO:\n");
		
		Ferrari f5 = new Ferrari();
		Carro c4 = new Carro();
		Carro c5 = new Ferrari();
		Fusca fu = new Fusca();
		
		f5.acelerar();//chama o metodo da ferrari
		c4.acelerar();//chama o metodo do carro
		fu.acelerar();//chama o metodo do fusca
		c5.acelerar();//chama o metodo da classe que instancia (Ferrari)
		f5.acelerar(250);//chama o metodo com parametro, 
//		c5.acelerar(360); //nao funciona
		
		teste(f5);//chama o metodo que tem parametro do tipo ferrari
		teste(c4);//chama o metodo que tem parametro do tipo carro
		teste(fu);//chama o metodo que tem parametro do tipo fusca
		teste(c5);//chama o metodo com o parametro a qual foi declarada(Carro), e depois chama o metodo a qual foi instanciada(Ferrari)
	}
	
	public static void teste(Carro carro){
		System.out.println("\n metodo que recebe carro");
		carro.acelerar();
	}
	
	public static void teste(Ferrari carro){
		System.out.println("\n metodo que recebe ferrari");
		carro.acelerar();
	}
	
	public static void teste(Fusca carro){
		System.out.println("\n metodo que recebe fusca");
		carro.acelerar();
	}
}
