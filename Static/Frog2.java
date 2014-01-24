package estatico;

public class Frog2 extends Frog{
	
	int frogSize = 0;
	
	public int getFrogSize(){
		return frogSize;
	}
	
	private Frog2(int s){
		frogSize = s;
	}
	
	public static void methodStatic2(){
		System.out.println("Acessando o metodo estatico");
	}
	
	public static void main(String[] args) {
		
		System.out.println(c);// imprime null
		System.out.println(Frog.frogCount);//imprime 0
		System.out.println(f);// imprime 0.0
		System.out.println(counter);// imprime 0
		Frog x = new Frog();
		System.out.println(Frog.c);//imprime o valor definido no construtor (teste)
		System.out.println(f);// imprime o valor definido no construtor (1.25)
		System.out.println(x.a);//imprime o valor definido no construtor (25)
		System.out.println(counter);//imprime 0
		System.out.println(x.frogCount);//imprime o valor definido no contrutor(1). acessada por uma variavel de referencia
		System.out.println(Frog.frogCount);//imprime o valor definido no construtor(1). acessada sem uma variavel de referencia
		
		
		Frog y = new Frog();
		x.a = 5;
		x.frogCount = 7;//muda o valor de frogCount
		counter = 8;//muda o valor de counter

		System.out.println(x.a);//imprime o valor definido acima(5)
		System.out.println(x.frogCount);//imprime o valor definido acima(7)
		System.out.println(Frog.frogCount);//imprime o valor definido acima(7)
		System.out.println(x.counter);//imprime 8
		System.out.println(y.a);//imprime 25
		System.out.println(y.frogCount);//imprime 7
		System.out.println(y.counter);// imprime 8
		System.out.println(counter);// imprime 8
		
		Frog2.methodStatic2();
		methodStatic();
		x.method();
		new Frog();
		System.out.println(frogCount);//imprime 1, ja que foi dado um new, e o construtor foi chamado novamente (chamada so funciona se houver herança)
		
		
//		System.out.println(Frog.a);
		
		
		System.out.println("\n----------------------------------------\n");
		
		Frog2 f = new Frog2(25);
		System.out.println(f.getFrogSize());
	}

}