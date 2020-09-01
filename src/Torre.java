
public class Torre {
	private int qtd;
	private No topo;
	
	public Torre() {qtd = 0;}
	public Torre(int dado) {
		super();
		for(int index = dado; index != 0; index--) {
			No disco = new No(index);
			disco.prox = topo;
			topo = disco;
			qtd++;
		}
	}
	
	public void add(int dado){
		No novoNo = new No(dado);
		novoNo.prox = topo;
		topo = novoNo;
		qtd++;
	}

	public int pop() throws Exception{
		if(!isEmpty()) {
			int temp = topo.dado;
			topo = topo.prox;
			qtd--;
			return temp;
		}else {
			throw new Exception("Não foi possível remover, torre vazia!");
		}
	}

	public int peek(){
		return topo.dado;
	}

	@Override
	public String toString() {
		No atual = topo;
		StringBuilder builder = new StringBuilder();
		while(atual != null) {
			builder.append(atual.dado + " ");
			atual = atual.prox;
		}
		return builder.toString();
	}
	
	public int quantidade() {
		return qtd;
	}
	public boolean isEmpty() {
		return qtd == 0;
	}
}
