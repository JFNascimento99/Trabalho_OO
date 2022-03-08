package Classes;

public class Bicicleta {
	//Bicicleta faz parte de bicicletario...agrega��o pois podem viver separadas.
	//Bicicleta faz parte de pedido de forma obrigatoria...composi��o pois sem bicicleta sem pedido.
	//Atributos de bicicleta
	private String tipoBicicleta;
	private boolean disponibilidadeBicicleta;
	
	//Metodo construtor da Bicicleta
	public Bicicleta(String tipoBicicleta, boolean disponibilidadeBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
		this.disponibilidadeBicicleta = disponibilidadeBicicleta;
	}
	
	//Getters & Setters
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
	//Metodos
	public void cadastrarBicicleta() { //Cadastrar as bicicletas que teremos
		
	}
	public void editarBicicletas() { //Editar as bicicletas que teremos
		
	}
	public void deletarBicicletas() { //Resetar as biclcetas cadastradas
		//Zerando todos os dados cadastrados pras bicicletas
		setTipoBicicleta(null); 
		setDisponibilidadeBicicleta(true); //Corrigir esses erros; teoricamente ta certo agora
		
	}
	public void atualizarBicicletas() { //Atualizar as bicicletas que forem editadas
		
	}
	public void verBicicletas() { //Listar/ ver as bicicletas cadastradas
		
	}
	public void buscarBicicletas() { //Encontrar a bicicleta pela disponibilidade dela
		 
	}
}
	
