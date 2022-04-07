package classes;

import java.util.ArrayList;

public class Bicicletario {
	// Bicicleta faz parte de bicicletario...bicicleta est� agregada a bicicletario.
	// Atributos
	private String chegada;
	private String saida;
	public String Bicicletario;

	// Outras variaveis:
	private String respostaChegada;
	private String respostaSaida;
	private Boolean validaChegada = true;
	private Boolean validaSaida = true;
	private final ArrayList<Bicicleta> bicicletas = new ArrayList<>();

	// Metodo construtor do Bicicletario
	public Bicicletario(String chegada, String saida) {
		this.chegada = chegada;
		this.saida = saida;
	}

	// Gets and sets.
	// Ver os retornos para poder testar
	public String getChegada() {
		return chegada;
	}

	public void setChegada(String chegada) {
		this.chegada = chegada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	// Metodos
	// Modificacoes que fizemos para tentar mostrar na tela
	public static Boolean verificaCheckIn(String respostaChegada) {
		return true;
	}

	// Modificacoes que fizemos para tentar mostrar na tela
	public static Boolean verificaCheckOut(String respostaSaida) {
		return true;
	}

	public void editarBicletario() {
		// Editar os locais cadastrados

	}

	public void deletarBicicletario() {
		Dados.getBicicletarios().remove(this);

	}

	public void atualizarBicicletario() {
	}

	public void buscarBicicletario() {

	}

	public void listarBicicletarios() {

	}

}
