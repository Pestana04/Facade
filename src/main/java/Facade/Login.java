package Facade;

public class Login extends Servico {

    private static Login login = new Login();

    private Login() {}

    public static Login getInstancia() {
        return login;
    }
}