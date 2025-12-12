import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        
        int resultadoLogin = Log.in();

        if (resultadoLogin == 1) {

            Limpar.terminal();

            System.out.println("Digite uma das opções para continuar no sistema:");
            System.out.println("1 - Verificar motoristas");
            System.out.println("2 - Verificar cargas");
            System.out.println("3 - Verificar tipos de carga");
            System.out.println("4 - Gerar relatórios");
            System.out.println("10 - Sair");
            String resp = Input.nextLine();

            if(resp.equals("10")){
                Log.out();
                
            }
        } else if (resultadoLogin == 0) {
            System.out.println("Usuário CLIENTE logado!");
        }else{
            System.out.println("Erro inesperado.");
        }
    }

    

}
