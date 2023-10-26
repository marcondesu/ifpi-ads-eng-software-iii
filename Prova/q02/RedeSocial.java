package q02;

public class RedeSocial {
    public void postarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().equals("")) {
            throw new RuntimeException("A mensagem não pode ser vazia...");
        }

        System.out.println("Mensagem postada: " + mensagem);
    }
}


