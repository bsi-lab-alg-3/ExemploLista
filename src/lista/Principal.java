package lista;

public class Principal {

	public static void main(String[] args) {
		Elemento e = new Elemento();
		//sysout
		System.out.println(e.getValor()); //0
		System.out.println(e.getProximo()); //null

		Elemento e1 = new Elemento();
		e1.setValor(30);
		
		Elemento e2 = new Elemento(20);
		System.out.println(e2.getValor());
		
		////----------------
		
		Elemento lista = new Elemento(10);
		lista.setProximo(new Elemento(20));
	}

}
