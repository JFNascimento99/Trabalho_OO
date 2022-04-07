package classes;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

//Essa classe armazena dados que coletamos nas telas
public class Dados {
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();
    private static final ArrayList<Bicicletario> bicicletarios = new ArrayList<>();
    private static final ArrayList<Pedido> pedidos = new ArrayList<>();
    private static final ArrayList<FormaDePagamento> pagamentos = new ArrayList<>();

    private Dados() {

    }

    // Array de usuarios que usamos nas telas relacionadas ao usuario
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static DefaultListModel<String> getUsuariosList() {

        if (Dados.getUsuarios().size() == 0) {
            return null;
        }

        DefaultListModel<String> list = new DefaultListModel<>();
        list.addElement(
                "     NOME                         EMAIL                               CPF                 TELEFONE    ");
        for (Usuario usr : Dados.getUsuarios()) {
            list.addElement(usr.toString());
        }

        return list;
    }

    // Array de bicicletarios que usamos nas telas relacionadas a bicicletarios
    public static ArrayList<Bicicletario> getBicicletarios() {
        return bicicletarios;
    }

    // Array de de pedidos que usamos nas telas relacionadas a pedidos
    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public static ArrayList<FormaDePagamento> getFormaDePagamento() {
        return pagamentos;
    }
}