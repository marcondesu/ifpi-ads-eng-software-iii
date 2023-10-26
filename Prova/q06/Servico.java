package q06;

public class Servico extends Item {
    private int horas;

    public Servico(String id, String descricao, double valor) {
        super(id, descricao, valor);
    }
    
    public int getHoras() {
        return horas;
    }
}
