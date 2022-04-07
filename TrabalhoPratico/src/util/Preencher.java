package util;

import classes.Dados;
import classes.Usuario;

public class Preencher {
    private Preencher() {
    }

    public static void dados() {
        usuarios();
    }

    private static void usuarios() {
        String nome, telefone, identidade, cpf, idade, email, senha;
        int idx;
        for (int i = 0; i < 10; i++) {
            idx = i + 1;
            nome = "Usuário" + idx;
            telefone = "" + 12345678 * idx;
            identidade = "" + idx * 1000000;
            cpf = "12345678911";
            idade = "" + idx * 10;
            email = "emailNumero" + idx + "@email.com";
            senha = "AB123";

            Dados.getUsuarios().add(new Usuario(nome, telefone, identidade, cpf, idade, email, senha));
            System.out.println(Dados.getUsuarios().get(i).getNome());
        }

    }

    private static void bicicletas() {
    }

    private static void bicicletarios() {
    }

    private static void pedidos() {
    }
}
