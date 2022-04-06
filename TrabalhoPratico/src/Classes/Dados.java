package Classes;

import java.util.ArrayList;
	//Essa classe armazena dados que coletamos nas telas
public class Dados {
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();
    private static final ArrayList<Bicicleta> Bicicletas = new ArrayList<>();
    private static final ArrayList<Bicicletario> Bicicletarios = new ArrayList<>();
    private static final ArrayList<Pedido> Pedidos = new ArrayList<>();
    private static final ArrayList<FormaDePagamento>Pagamentos = new ArrayList<>();
    private Dados() {

    }
    //Array de usuarios que usamos nas telas relacionadas ao usuario
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    //Array de bicicletas que usamos nas telas relacionadas a bicicletas
    public static ArrayList<Bicicleta> getBicicletas() {
        return Bicicletas;
    }
    //Array de bicicletarios que usamos nas telas relacionadas a bicicletarios
    public static ArrayList<Bicicletario> getBicicletarios() {
        return Bicicletarios;
    }
    //Array de de pedidos que usamos nas telas relacionadas a pedidos
    public static ArrayList<Pedido> getPedidos(){
    	return Pedidos;
    }
    public static ArrayList<FormaDePagamento> getFormaDePagamento(){
    	return Pagamentos;
    }
}