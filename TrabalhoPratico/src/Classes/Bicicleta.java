package classes;

public class Bicicleta {
	// Bicicleta faz parte de bicicletario...agrega��o pois podem viver separadas.
	// Bicicleta faz parte de pedido de forma obrigatoria...composi��o pois sem
	// bicicleta sem pedido.
	// Atributos de bicicleta

	private String tipoBicicleta;
	private String nomeBicicleta;
	private boolean disponibilidadeBicicleta;

	// Variaveis extra:
	String respostaTipo;
	String respostaId;
	Boolean validaTipo = true;
	Boolean validaId = true;

	// Metodo construtor da Bicicleta
	public Bicicleta(String nomeBicicleta, String tipoBicicleta, boolean disponibilidadeBicicleta) {
		this.nomeBicicleta = nomeBicicleta;
		this.tipoBicicleta = tipoBicicleta;
		this.disponibilidadeBicicleta = disponibilidadeBicicleta;
	}

	// Getters & Setters
	// Ver os retornos para podermos ir testando
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	public boolean isDisponibilidadeBicicleta() {
		return disponibilidadeBicicleta;
	}

	public void setDisponibilidadeBicicleta(boolean disponibilidadeBicicleta) {
		this.disponibilidadeBicicleta = disponibilidadeBicicleta;
	}

	public String getNomeBicicleta() {
		return nomeBicicleta;
	}

	public void setNomeBicicleta(String nomeBicicleta) {
		this.nomeBicicleta = nomeBicicleta;
	}

	// Metodos
	public void cadastrarBicicleta() { // Cadastrar as bicicletas que teremos

	}

	public void editarBicicletas() { // Editar as bicicletas que teremos

	}

	public void deletarBicicletas() { // Resetar as biclcetas escolhidas pelo usuario
		// Zerando todos os dados cadastrados pras bicicletas
		this.setTipoBicicleta(null);
		this.setDisponibilidadeBicicleta(false); // Corrigir esses erros; teoricamente ta certo agora

	}

	public void atualizarBicicletas() { // Atualizar as bicicletas que forem editadas e cadastradas

	}

	public void buscarBicicletas() {
		// buscar todas bicicletas cadastradas...talvez fosse mais interessante o
		// usuario digitar, agt comparar texto e mostrar se achar.
		// Precisamos que cada bicicleta seja armazenado em uma posicao do vetor(por
		// isso que vai ta dando esse erro ali embaixo por enquanto)

	}

	public void listarBicicletas() {

	}

}