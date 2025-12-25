package repository;

import java.util.ArrayList;
import java.util.List;
import model.Carga;

public class CargaRepository {

    private static List<Carga> cargas = new ArrayList<>();

    public static void salvar(Carga carga) {
        cargas.add(carga);
    }

    public static List<Carga> listar() {
        return cargas;
    }

    public static boolean existeInvoice(int invoice) {
        return cargas.stream()
                .anyMatch(c -> c.getInvoice() == invoice);
    }
}
