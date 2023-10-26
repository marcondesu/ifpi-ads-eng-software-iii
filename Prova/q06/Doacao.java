package q06;

public class Doacao extends Item {
    private double bonus;

    public Doacao(String id, String descricao, double valor) {
        super(id, descricao, valor);
    }

    public double getBonus() {
        return bonus;
    }
}