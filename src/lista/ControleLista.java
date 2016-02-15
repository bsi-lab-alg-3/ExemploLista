package lista;

public class ControleLista {
	private Elemento primeiro;
	
	public void adicionar(Elemento elemento){
		if(primeiro==null){
			primeiro = elemento;
		}else{
			Elemento percorer = primeiro;
			while(percorer!=null){
				if(percorer.getProximo()==null){
					percorer.setProximo(elemento);
					break;
				}else{
					percorer = percorer.getProximo();
				}
				
			}
		
		}
	}
}
