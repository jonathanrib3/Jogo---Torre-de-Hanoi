
public class JogoDeHanoi {
	private int numeroDeJogadas;
	private Torre torrePrincipal;
	private Torre torre2;
	private Torre torre3;
	public JogoDeHanoi(int quantidade) {
		numeroDeJogadas = 0;
		this.torrePrincipal  = new Torre(quantidade);
		this.torre2 = new Torre();
		this.torre3 = new Torre();
	}

	public boolean escolhaTorre(int torreFonte, int torreDestino) throws Exception {

		switch(torreFonte){
			case 1:
				if(torreDestino == 2){
					return fazerJogada(torrePrincipal,torre2);
				}else if(torreDestino == 3){
					return fazerJogada(torrePrincipal,torre3);
				}else{
					throw new Exception("Escolha inválida");
				}

			case 2:
				if(torreDestino == 1){
					return fazerJogada(torre2,torrePrincipal);
				}else if(torreDestino == 3){
					return fazerJogada(torre2,torre3);
				}else{
					throw new Exception("Escolha inválida");
				}

			case 3:
				if(torreDestino == 1){
					return fazerJogada(torre3,torrePrincipal);
				}else if(torreDestino == 2){
					return fazerJogada(torre3,torre2);
				}else{
					throw new Exception("Escolha inválida");
				}

		}
		throw new Exception("Algum erro ocorreu, F");
	}
	
	public boolean fazerJogada(Torre torreFonte, Torre torreDestino) throws Exception {
		if(torreFonte.isEmpty()) {
			throw new Exception("Torre fonte vazia!");
		}

		if(torreDestino.isEmpty()) {
			torreDestino.add(torreFonte.pop());
			numeroDeJogadas++;
			return true;
		}

		if(!torreDestino.isEmpty() && torreFonte.peek() > torreDestino.peek() ){
			throw new Exception("Topo da torre fonte maior que o topo da torre destino!");
		}
		torreDestino.add(torreFonte.pop());
		numeroDeJogadas++;
		return true;
	}

	public boolean isTerminado(){
		return ((torrePrincipal.isEmpty() && torre2.isEmpty()) ||
				(torrePrincipal.isEmpty() && torre3.isEmpty()));
	}

	public int getNumeroDeJogadas(){
		return numeroDeJogadas;
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Torre Principal: "+ torrePrincipal.toString() + "\n");
		builder.append("Torre 2:"  +torre2.toString() + "\n");
		builder.append("Torre 3:" +torre3.toString() + "\n");
		return builder.toString();
	}


}
