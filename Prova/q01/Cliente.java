package q01;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public void setPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

