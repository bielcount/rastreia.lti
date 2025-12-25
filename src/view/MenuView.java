package view;

import java.util.List;
import java.util.Scanner;

import model.Carga;
import util.Limpar;

public class MenuView {

    private Scanner input = new Scanner(System.in);

    /* =========================
       MENUS PRINCIPAIS
       ========================= */
    public int menuPrincipalAdmin() {
        System.out.println("\n========== MENU PRINCIPAL (ADMIN) ==========");
        System.out.println("1 - Gerenciar cargas");
        System.out.println("2 - Gerenciar motoristas");
        System.out.println("3 - Gerenciar carretas");
        System.out.println("4 - Gerenciar tipos de carretas");
        System.out.println("5 - Gerar relatórios");
        System.out.println("6 - Gerenciar usuários");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        return lerOpcao();
    }

    public int menuPrincipalCliente() {
        System.out.println("\n========== MENU PRINCIPAL (CLIENTE) ==========");
        System.out.println("1 - Listar cargas");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        return lerOpcao();
    }

    public int menuCargas() {
        System.out.println("\n========== MENU CARGAS ==========");
        System.out.println("1 - Listar cargas");
        System.out.println("2 - Cadastrar carga");
        System.out.println("3 - Alterar status de carga");
        System.out.println("4 - Gerar relatórios");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");

        return lerOpcao();
    }

    public int menuMotoristas() {
        System.out.println("\n========== MENU MOTORISTAS ==========");
        System.out.println("1 - listar motoristas");
        System.out.println("2 - Cadastrar motoristas");
        System.out.println("3 - Alterar cadastro de motoristas");
        System.out.println("4 - Excluir motoristas");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");

        return lerOpcao();
    }

    public int menuCarretas() {
        System.out.println("\n========== MENU CARRETAS ==========");
        System.out.println("1 - listar carretas");
        System.out.println("2 - Cadastrar carretas");
        System.out.println("3 - Alterar cadastro de carretas");
        System.out.println("4 - Excluir carretas");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");

        return lerOpcao();
    }

    public int menuTipoCarretas() {
        System.out.println("\n========== MENU TIPO DE CARRETAS ==========");
        System.out.println("1 - listar tipos de carretas");
        System.out.println("2 - Cadastrar tipos de carretas");
        System.out.println("3 - Alterar cadastro de tipos de carretas");
        System.out.println("4 - Excluir tipos de carretas");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");

        return lerOpcao();
    }
    public int menuCaminhao(){
        
        System.out.println("\n========== MENU CAMINHÕES ==========");
        System.out.println("1 - listar caminhões");
        System.out.println("2 - Cadastrar caminhão");
        System.out.println("3 - Alterar cadastro de caminhão");
        System.out.println("4 - Excluir caminhão");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");
        
        
        return lerOpcao();
    }

    
    /* =========================
       LISTAGENS
       ========================= */
    public void listarCargasSimuladas(List<Carga> cargas) {
        System.out.println("\n========== LISTA DE CARGAS ==========");

    if (cargas.isEmpty()) {
        System.out.println("Nenhuma carga cadastrada.");
        aguardarVoltar();
        return;
    }

    System.out.println(" INVOICE | CAMINHÃO | CARRET. 1 | CARRET. 2 | NOTA FISCAL");
    System.out.println("----------------------------------------------------------");
    for (Carga c : cargas) {
        System.out.printf(
            "%8d | %-8s | %-8s | %8s | %8s%n",
            c.getInvoice(),
            c.getPlacaCaminhao(),
            c.getPlacaCarga1(),
            c.getPlacaCarga2(),
            c.getNotaFiscal()
        );
    }

        aguardarVoltar();
    } 
    
    public void listarMotoristasSimulados() {
        System.out.println("\n========== LISTA DE MOTORISTAS ==========");
        System.out.println("ID   | NOME            | CPF             | STATUS");
        System.out.println("-----------------------------------------------");
        System.out.println("001  | Paulo Lenin     | 97103990042     | Em trânsito");
        System.out.println("002  | Valdemiro Putin | 65056169005     | Ocioso");
        System.out.println("003  | Ronaldo Trump   | 95665017060     | Aguardando coleta");
        System.out.println("-----------------------------------------------");

        aguardarVoltar();
    }   
    public void listarTiposCarretas() {
        System.out.println("\n========== LISTA DE TIPOS DE CARRETA ==========");
        System.out.println("ID   | TIPO                                 | CAPACIDADE MAX  | QUANT. DE PLACAS  |");
        System.out.println("-----------------------------------------------");
        System.out.println("001  | Carreta LS                        | 1300     | 1");
        System.out.println("002  | Carreta Graneleiro 4 eixo         | 2000     | 1");
        System.out.println("003  | Carreta sider                     | 3200     | 1");
        System.out.println("-----------------------------------------------");

        aguardarVoltar();
    }
    public void listarCarretas() {
        System.out.println("\n========== LISTA DE CARRETAS ==========");
        System.out.println("ID   | PLACA 1     | TIPO           | STATUS");
        System.out.println("-----------------------------------------------");
        System.out.println("001  | NAW-3193    | Carreta LS     | Em trânsito");
        System.out.println("002  | HZB-7038    | Carreta LS     | Ocioso");
        System.out.println("003  | JVE-1877    | Carreta LS     | Aguardando coleta");
        System.out.println("-----------------------------------------------");

        aguardarVoltar();
    }    
    public void listarCaminhoes(){
        System.out.println("\n========== LISTA DE CAMINHÕES ==========");
        System.out.println("ID   | PLACA 1     | TIPO           | STATUS");
        System.out.println("-----------------------------------------------");
        System.out.println("001  | NAW-3193    | Carreta LS     | Em trânsito");
        System.out.println("002  | HZB-7038    | Carreta LS     | Ocioso");
        System.out.println("003  | JVE-1877    | Carreta LS     | Aguardando coleta");
        System.out.println("-----------------------------------------------");

        aguardarVoltar();
    }
    
    public Carga formularioCadastroCarga() {
    System.out.println("========== CADASTRO DE CARGA ==========");

    try {
        System.out.print("Invoice (número): ");
        int invoice = Integer.parseInt(input.nextLine());

        System.out.print("Placa do caminhão: ");
        String placaCaminhao = input.nextLine();

        System.out.print("Placa 1 da carga: ");
        String placaCarga1 = input.nextLine();

        System.out.print("Placa 2 da carga: ");
        String placaCarga2 = input.nextLine();

        System.out.print("Nota fiscal: ");
        String notaFiscal = input.nextLine();

        return new Carga(invoice, placaCaminhao, placaCarga1, placaCarga2, notaFiscal);

    } catch (Exception e) {
        System.out.println("Erro no preenchimento dos dados.");
        aguardarVoltar();
        return null;
    }
}

    

    /* =========================
       UTILITÁRIOS DE VIEW
       ========================= */
    public void aguardarVoltar() {
        System.out.println("\n0 - Voltar");
        System.out.print("Escolha: ");

        while (true) {
            try {
                int opcao = Integer.parseInt(input.nextLine());
                if (opcao == 0) {
                    Limpar.terminal();
                    break;
                }
            } catch (Exception e) {}

            System.out.print("Opção inválida. Digite 0 para voltar: ");
        }
    }

    private int lerOpcao() {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }

    public void sair() {
        System.out.println("Encerrando o sistema...");
    }

    public void invalido() {
        System.out.println("Opção inválida! Tente novamente.");
    }

    public void emConstrucao() {
        System.out.println("Funcionalidade em construção.");
        aguardarVoltar();
    }
}
