import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Carro("Sedan"));
        listaDeCarros.add(new Carro("SUV"));
        listaDeCarros.add(new Carro("Hatchback"));

        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
        }
    }
}
