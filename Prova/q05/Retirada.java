package q05;

public class Retirada implements ITransacao {
    public double calcularTaxa(double valor) {
        return valor * 0.02;
    }
}
