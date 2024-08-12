public class Carro {
    private String tipo;

    public Carro(String tipo) {
        this.tipo = tipo;
    }

    public void exibirInfo() {
        System.out.println("Tipo de carro: " + tipo);
    }
}
