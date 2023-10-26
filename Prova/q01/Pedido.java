package q01;
public class Pedido {
    private double valorTotal;
    private Cliente cliente;

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double calcularDesconto() {
        return this.getValorTotal() * 0.1;
    }

    public double processarPedido (Cliente cliente){
        this.calcularDesconto();
        cliente.setPedido(this);
    }
}
