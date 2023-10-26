package q0304;

public class Carro {
    private double quantidadeCombustivel;
    private double capacidadeMaxima = 50; // em litros

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void reabastecerSeNecessario(int quantidade) {
        if (!(this.getQuantidadeCombustivel() < this.getCapacidadeMaxima() * 0.1)) {
            throw new RuntimeException("Não é necessário abastecer.");
        }

        if (!((this.getQuantidadeCombustivel() + quantidade) <= this.capacidadeMaxima)) {
            throw new RuntimeException("Capacidade máxima do tanque ultrapassada.");
        }

        this.quantidadeCombustivel += quantidade;
        System.out.println("Abasteceu");
        }
    }


