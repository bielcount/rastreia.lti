package controller;

import view.MenuView;

public class MenuController {

    public void exibirMenu(int tipoUsuario) {
        MenuView view = new MenuView();

        int opcao = -1;

        while (opcao != 0) {
            opcao = view.menuPrincipal(tipoUsuario);

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
