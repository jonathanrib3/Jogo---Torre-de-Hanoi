
public class TorrePrincipal {
	int qtd;
	No topo;
	
	public TorrePrincipal() {qtd = 0;}
	public TorrePrincipal(int dado) {
		super();
		qtd = 0;
		for(int index = dado; index != 0; index--) {
			No disco = new No(index);
			disco.prox = topo;
			topo = disco;
		}
	}
	
	
	public int pop() {
		if(!isEmpty()) {
			int temp = topo.dado;
			topo = topo.prox;
			return temp;
		}else {
			return -1;
		}
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
