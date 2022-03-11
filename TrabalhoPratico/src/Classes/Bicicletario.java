package Classes;
import java.util.Scanner;
import java.util.Date;

public class Bicicletario {
	//Bicicleta faz parte de bicicletario...bicicleta está agregada a bicicletario.
	//Atributos
	private String endereco;
	private String quadra;
	static Scanner ler = new Scanner(System.in);
	
	//Metodo construtor do Bicicletario
	public Bicicletario(String endereco, String quadra) {
		this.endereco = endereco;
		this.quadra = quadra;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}
	
	//Metodos
	//Verificar se é tudo void mesmo
	public void cadastrarBicicletario() {
		//Cadastrar os locais onde se pode pegar ou deixar bicicletas.
		//Deveremos ter estacoes pre cadastradas.
		
		//Ele vai poder cadastrar onde quer sair ou chegar de acordo com as estacoes pre cadastradas.
		System.out.println("Cadastrar lugar de checkin ");
		setEndereco(ler.next());
		System.out.println("Cadastrar lugar de checkout ");
		setQuadra(ler.next());
	}
	public void editarBicletario() {
		//Editar os locais cadastrados
	}
	public void deletarBicicletario() {
		//Resetar os dados cadastrados
		setEndereco(null); //
		setQuadra(null);
	}
	public void atualizarBicicletario() {
		//Atualizar os bicicletarios que foram editados
	}
	public void verBicicletario() {
		//Ver todos bicicletarios cadastrados.
		
		//Duas estacoes que criei e seus enderecos, pode cadastrar elas e colocar elas para receberem as bicicletas.
		System.out.println("Parque da Cidade Dona Sarah Kubitschek: ");
		System.out.println("Endereço: Srps - Brasilia, DF, 70297-400\n"
				+ "Horarios: Atendimento 24 horas. ");
		System.out.println("\n ");
		System.out.println("\n ");
		System.out.println("Torre de TV: ");
		System.out.println("Endereço:Eixo Monumental S/N, Jardim Burle Marx. Brasilia,DF,70050-901\n"
			+ "Situado no eixo monumental.\n"
			+ "Horarios: Atendimento 24 horas ");
	}
	public void listarBicicletarios() {
		//Listar todos os bicicletrarios cadastrados
	}
	
}
