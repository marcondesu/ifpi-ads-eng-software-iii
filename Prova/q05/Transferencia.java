package q05;

import java.util.Date;

public class Transferencia extends Transacao{
    public Transferencia(double valor, Date data) {
        super(valor, data, tipo);
    }

    public double calcularTaxa(double valor) {
        return valor * 0.015;
    }
}
