package lista;

public class Elemento {

	private int valor; // 0
	private Elemento proximo; //null
	
	//get
	//set
	
	public Elemento() {
		// TODO Auto-generated constructor stub
	}
	
	public Elemento(int valor) {
		this.valor = valor;
	}
		
	public Elemento getProximo() {
		return proximo;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
}
