import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//menu
       // System.out.println("Defina a categoria:\ncomida\nprofissão\nTecnologia e Ciências\nNatureza e Animais\nConceitos Abstratos e Emoções");
        
//configurações
        System.out.println("Quantos jogadores vão participar?");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        Jogadores[] listaJogadores = new Jogadores[quantidade];
        

        for(int i = 0 ; i < quantidade; i++){
            System.out.println("Diga o nome "+(i+1));
            String nome = entrada.nextLine();
            listaJogadores[i] = new Jogadores(nome);
        }

        System.out.print("Jogadores: ");
        for(Jogadores j : listaJogadores) {
            System.out.print(j.getNome() + " ");
        }

//inicio de jogo
        Impostor inicio = new Impostor();
        int escolhido = inicio.definirImpostor(listaJogadores);
        
//definir a palavra
        BancoPalavras banco = new BancoPalavras();
        BancoPalavras.Palavra sorteada = banco.sortear();
        String codigo = sorteada.getSegredo();
        String dica = sorteada.getDica();

//revelar palavras
        for(int i = 0; i < listaJogadores.length; i++){
            System.out.println(listaJogadores[i].getNome()+" clique enter para revelar");
            entrada.nextLine();
            String confirmacao;
            if (listaJogadores[i].isImpostor()) {
                confirmacao = "Impostor";
                JOptionPane.showMessageDialog(null, confirmacao + "\n dica: "+dica, listaJogadores[i].getNome(), JOptionPane.QUESTION_MESSAGE);
            }
            else{
                confirmacao = "normal";
                JOptionPane.showMessageDialog(null, confirmacao + "\n palavra: "+codigo, listaJogadores[i].getNome(), JOptionPane.QUESTION_MESSAGE);
            }
        }

//inicio rodada
        Aleatorio comeca = new Aleatorio();
        int indice = comeca.sorteador(listaJogadores.length);
        JOptionPane.showMessageDialog(null, listaJogadores[indice].getNome()+" comeca", "Inicio de jogo", JOptionPane.WARNING_MESSAGE);
        
//final de jogo
        System.out.println("\nAperte enter para revelar o impostor");
        entrada.nextLine();
        System.out.println(listaJogadores[escolhido].getNome() + " era o impostor e a palavra era "+ codigo);
        entrada.close();
    }
}