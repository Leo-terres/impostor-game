import java.util.Random;

public class Aleatorio {
    public int sorteador(int quantidade){
        Random escolhido = new Random();
        int indiceSorteado = escolhido.nextInt(quantidade);
        return indiceSorteado;
    }
}
