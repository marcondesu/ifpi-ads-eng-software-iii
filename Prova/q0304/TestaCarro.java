package q0304;


class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setQuantidadeCombustivel(5); // Se for de 4 pra baixo vai cair na exceção "Não é necessário abastecer"

        carro.reabastecerSeNecessario(4); // OK
        carro.reabastecerSeNecessario(60); // CAPACIDADE MÁXIMA EXCEDIDA
    }

}