package controller;

import model.TipoCarreta;
import repository.MotoristaRepository;
import repository.TipoCarretaRepository;
import view.MenuView;

public class TipoCarretasController {
    private MenuView view;

    public TipoCarretasController(MenuView view) {
        this.view = view;
    }

    public void cadastrar() {
        TipoCarreta tipoCarreta = view.formularioCadastroTipoCarreta();

        if (tipoCarreta == null) {
            return;
        }
        TipoCarretaRepository.salvar(tipoCarreta);

        System.out.println("Tipo de Carreta cadastrado com sucesso!");
        view.aguardarVoltar();
    }
    public void excluir(){
        int id = view.formularioExcluirTipoCarreta();

        boolean excluido = TipoCarretaRepository.excluir(id);

        if(excluido){
            System.out.println("Tipo removido com sucesso!");
        }else{
            System.out.println("Tipo não encontrado");
        }
        view.aguardarVoltar();

    }
}
