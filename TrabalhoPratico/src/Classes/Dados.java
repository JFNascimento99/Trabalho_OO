package Classes;

import java.util.ArrayList;

public class Dados {
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();
    private static final ArrayList<Bicicleta> Bicicletas = new ArrayList<>();
    private static final ArrayList<Bicicletario> Bicicletarios = new ArrayList<>();
    private static final ArrayList<Pedido> Pedidos = new ArrayList<>();
    private Dados() {

    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static ArrayList<Bicicleta> getBicicletas() {
        return Bicicletas;
    }

    public static ArrayList<Bicicletario> getBicicletarios() {
        return Bicicletarios;
    }
    public static ArrayList<Pedido> getPedidos(){
    	return Pedidos;
    }
}