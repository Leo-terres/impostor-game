public class Impostor {
    public int definirImpostor(Jogadores[] total){
        Aleatorio indice = new Aleatorio();
        int escolhido = indice.sorteador(total.length);
        total[escolhido].setImpostor(true);
        System.out.println("\nO impostor está definido");
        return escolhido;
    }
}
