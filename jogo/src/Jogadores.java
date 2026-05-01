public class Jogadores {
    private String nome;
    private boolean impostor;


    public Jogadores(String nome){
        this.nome = nome;
        this.impostor = false;
    }

    public String getNome(){
        return nome;
    }

    public boolean isImpostor(){
        return impostor;
    }

    public void setImpostor(boolean impostor) {
        this.impostor = impostor;
    }

    @Override
    public String toString() {
        return "Jogador: " + nome + " | Impostor: " + (impostor ? "Sim" : "Não");
    }
}
