package q05;

public class Deposito implements ITransacao{
    @Override
    public double calcularTaxa(double valor) {
        return valor * 0.01;
    }
}
