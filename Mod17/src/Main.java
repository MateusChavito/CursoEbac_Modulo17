import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaDeCarros = new ArrayList<>();
        
        listaDeCarros.add(new GM());
        listaDeCarros.add(new Honda());
        listaDeCarros.add(new Ford());

        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
        }
    }
}
