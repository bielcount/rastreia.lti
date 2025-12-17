package controller;

import util.Limpar;
import view.MenuView;

public class MenuController {

    private MenuView view;

    public MenuController() {
        this.view = new MenuView();
    }

    public void exibirMenu(int tipoUsuario) {
        if (tipoUsuario == 1) {
            menuAdmin();
        } else {
            menuCliente();
        }
    }

    /* =========================
       MENU ADMIN
       ========================= */
    private void menuAdmin() {
        int opcao = -1;

        while (opcao != 0) {
            opcao = view.menuPrincipalAdmin();

            switch (opcao) {
                case 1:
                    Limpar.terminal();
                    submenuCargas();
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                    view.emConstrucao();
                    break;

                case 0:
                    view.sair();
                    break;

                default:
                    view.invalido();
            }
        }
    }

    /* =========================
       SUBMENU CARGAS
       ========================= */
    private void submenuCargas() {
        int opcao = -1;

        while (opcao != 0) {
            opcao = view.menuCargas();

            switch (opcao) {
                case 1:
                    Limpar.terminal();
                    view.listarCargasSimuladas();
                    break;

                case 2:
                case 3:
                case 4:
                    view.emConstrucao();
                    break;

                case 0:
                    Limpar.terminal();
                    break;

                default:
                    view.invalido();
            }
        }
    }

    /* =========================
       MENU CLIENTE
       ========================= */
    private void menuCliente() {
        int opcao = -1;

        while (opcao != 0) {
            opcao = view.menuPrincipalCliente();

            switch (opcao) {
                case 1:
                    view.listarCargasSimuladas();
                    break;

                case 0:
                    view.sair();
                    break;

                default:
                    view.invalido();
            }
        }
    }
}
