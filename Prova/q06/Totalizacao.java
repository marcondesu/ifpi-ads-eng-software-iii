package q06;

public class Totalizacao extends Item {

    public Totalizacao(String id, String descricao, double valor) {
        super(id, descricao, valor);
    }

    public double totalizarServicos(Servico[] servicos) {
        double total = 0;
        for (Servico servico : servicos) {
            total += servico.getValor() * servico.getHoras();
        }
        return total;
    }

    public double totalizarDoacoes(Doacao[] doacoes) {
        double total = 0;
        for (Doacao doacao : doacoes) {
            total += doacao.getValor() + doacao.getBonus();
        }
        return total;
    }

    public double totalizarProdutos(Produto[] produtos) {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor() * (1 + produto.getTaxa());
        }
        return total;
    }

    public double totalizar(Totalizavel[] itens) {
        double total = 0;
        for (Totalizavel item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }
}
