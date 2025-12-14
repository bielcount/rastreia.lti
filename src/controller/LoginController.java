package controller;

import model.Usuario;
import view.LoginView;

public class LoginController {

    public int fazerLogin() {
        LoginView view = new LoginView();
        view.boasVindas();

        // Usuários do sistema
        Usuario admin = new Usuario("klabunde.lti", "iffar2025", 1);
        Usuario cliente = new Usuario("buntech.tli", "buntech2025", 0);

        while (true) {
            String usuario = view.pedirUsuario();
            String senha = view.pedirSenha();

            if (usuario.equals(admin.getUsername()) && senha.equals(admin.getPassword())) {
                view.sucessoAdmin(usuario);
                return 1;
            } else if (usuario.equals(cliente.getUsername()) && senha.equals(cliente.getPassword())) {
                view.sucessoCliente();
                return 0;
            } else {
                view.erro();
            }
        }
    }
}
