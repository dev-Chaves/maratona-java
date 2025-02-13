package academy.devdojo.maratonajava.excecoes.runtime.test;

import academy.devdojo.maratonajava.excecoes.runtime.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTeste {
    public static void main(String[] args) {
        try {
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String userNameDB = "Goku";
        String senhaDB = "Vegeta";

        System.out.println("Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDigitado.equals(userNameDB) || !senhaDigitada.equals(senhaDB)){
            throw new LoginInvalidoException("Usuário ou Senha Inválido");
        }

        System.out.println("Logado com sucesso!");


    }
}
