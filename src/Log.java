import java.util.Scanner;

public class Log {

    public static int in (){
        Scanner Input = new Scanner(System.in);

        String userAdmin = "klabunde.lti";
        String passwordAdmin = "iffar2025";

        String userCliente = "buntech.tli";
        String passwordCliente = "buntech2025";
        int loginEnd = 0;

                    
        System.out.println("=====================================");
        System.out.println("           RASTREIA.LTI         ");
        System.out.println("=====================================");

        while (loginEnd != 1) {
        
        System.out.print("Usuário: ");
        String usuario = Input.nextLine();

        System.out.print("Senha: ");
        String senha = Input.nextLine();                                                                                                                                                                                                                                                                    
                                                                             


        if (usuario.equals(userAdmin) && senha.equals(passwordAdmin)) {
            loginEnd = 1;
            System.out.println("Usuário logado! Bem vindo"+usuario+"\n                                                                                                                                                                                                                              ");

            return 1;
        } else if (usuario.equals(userCliente) && senha.equals(passwordCliente)) {
            loginEnd = 1;
            return 0;
        } else {
            System.out.println("Falha no login. Tente novamente.");

        }
    }
        return -1;
    }

    public static void out(){
        Limpar.terminal();
        in();
    }
}
