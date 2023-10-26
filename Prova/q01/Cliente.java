package q01;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void comprar(Pedido pedido) {
        pedidos.add(pedido);
    }
}

