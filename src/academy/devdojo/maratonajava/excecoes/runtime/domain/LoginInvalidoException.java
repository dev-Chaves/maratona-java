package academy.devdojo.maratonajava.excecoes.runtime.domain;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(String message){
        super("Login Inválido ");
    }
}
