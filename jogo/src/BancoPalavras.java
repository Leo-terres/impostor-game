import java.util.ArrayList;
import java.util.Random;

public class BancoPalavras {

    public static class Palavra{
        private String segredo;
        private String dica;
    
        public Palavra(String segredo, String dica){
            this.segredo = segredo;
            this.dica = dica;
        }
        public String getSegredo(){
            return segredo; 
        }
        
        public String getDica(){
            return dica;
        }
    }

    private ArrayList<Palavra> palavras;

    public BancoPalavras() {
        this.palavras = new ArrayList<>();
        this.secreto();
    }

    private void secreto(){
        palavras.add(new Palavra("Espelho", "Narciso"));
        palavras.add(new Palavra("Relógio", "Cronos"));
        palavras.add(new Palavra("Sal", "Retenção"));
        palavras.add(new Palavra("Vento", "Invisível"));
        palavras.add(new Palavra("Bússola", "Norte"));
        palavras.add(new Palavra("Vidro", "Fragilidade"));
        palavras.add(new Palavra("Xadrez", "Estratégia"));
        palavras.add(new Palavra("Piano", "Marfim"));
        palavras.add(new Palavra("Tatuagem", "Permanência"));
        palavras.add(new Palavra("Sombra", "Ausência"));
        palavras.add(new Palavra("Nuvens", "Vapor"));
        palavras.add(new Palavra("Livro", "Portal"));
        palavras.add(new Palavra("Lágrima", "Salina"));
        palavras.add(new Palavra("Ponte", "Vínculo"));
        palavras.add(new Palavra("Vela", "Sacrifício"));
        palavras.add(new Palavra("Âncora", "Estabilidade"));
        palavras.add(new Palavra("Máscara", "Persona"));
        palavras.add(new Palavra("Bateria", "Ritmo"));
        palavras.add(new Palavra("Cactus", "Resiliência"));
        palavras.add(new Palavra("Sino", "Ressonância"));
        palavras.add(new Palavra("Mapa", "Orientação"));
        palavras.add(new Palavra("Chave", "Acesso"));
        palavras.add(new Palavra("Farol", "Guia"));
        palavras.add(new Palavra("Fotografia", "Estática"));
        palavras.add(new Palavra("Escada", "Ascensão"));
        palavras.add(new Palavra("Lupa", "Magnitude"));
        palavras.add(new Palavra("Papel", "Suporte"));
        palavras.add(new Palavra("Vinho", "Fermentação"));
        palavras.add(new Palavra("Labirinto", "Perdição"));
        palavras.add(new Palavra("Vulcão", "Magma"));
        palavras.add(new Palavra("Paraquedas", "Gravidade"));
        palavras.add(new Palavra("Teia", "Armadilha"));
        palavras.add(new Palavra("Diamante", "Pressão"));
        palavras.add(new Palavra("Pena", "Leveza"));
        palavras.add(new Palavra("Cofre", "Sigilo"));
        palavras.add(new Palavra("Cinema", "Projeção"));
        palavras.add(new Palavra("Mel", "Néctar"));
        palavras.add(new Palavra("Teatro", "Drama"));
        palavras.add(new Palavra("Sapatos", "Passos"));
        palavras.add(new Palavra("Borracha", "Apagamento"));
        palavras.add(new Palavra("Sabonete", "Atrito"));
        palavras.add(new Palavra("Raio", "Eletricidade"));
        palavras.add(new Palavra("Janela", "Perspectiva"));
        palavras.add(new Palavra("Estátua", "Imobilidade"));
        palavras.add(new Palavra("Perfume", "Fragrância"));
        palavras.add(new Palavra("Moeda", "Valor"));
        palavras.add(new Palavra("Guarda-chuva", "Proteção"));
        palavras.add(new Palavra("Gelo", "Sólido"));
        palavras.add(new Palavra("Cachimbo", "Fumaça"));
        palavras.add(new Palavra("Rádio", "Frequência"));
        palavras.add(new Palavra("Dinheiro", "Troca"));
        palavras.add(new Palavra("Deserto", "Aridez"));
        palavras.add(new Palavra("Câmera", "Lente"));
        palavras.add(new Palavra("Bicicleta", "Equilíbrio"));
        palavras.add(new Palavra("Astronauta", "Vácuo"));
        palavras.add(new Palavra("Ouro", "Maleabilidade"));
        palavras.add(new Palavra("Silêncio", "Vazio"));
        palavras.add(new Palavra("Pimenta", "Ardor"));
        palavras.add(new Palavra("Navio", "Flutuação"));
        palavras.add(new Palavra("Mesa", "Apoio"));
        palavras.add(new Palavra("Lápis", "Grafite"));
        palavras.add(new Palavra("Inverno", "Hibernação"));
        palavras.add(new Palavra("Horizonte", "Infinito"));
        palavras.add(new Palavra("Guitarra", "Acorde"));
        palavras.add(new Palavra("Grão", "Origem"));
        palavras.add(new Palavra("Ferro", "Minério"));
        palavras.add(new Palavra("Esmalte", "Estética"));
        palavras.add(new Palavra("Dicionário", "Léxico"));
        palavras.add(new Palavra("Corpo", "Templo"));
        palavras.add(new Palavra("Coração", "Pulsar"));
        palavras.add(new Palavra("Chuva", "Precipitação"));
        palavras.add(new Palavra("Café", "Energia"));
        palavras.add(new Palavra("Cadeado", "Segurança"));
        palavras.add(new Palavra("Borboleta", "Metamorfose"));
        palavras.add(new Palavra("Boca", "Articulação"));
        palavras.add(new Palavra("Batom", "Maquiagem"));
        palavras.add(new Palavra("Balão", "Hélio"));
        palavras.add(new Palavra("Azeite", "Lípido"));
        palavras.add(new Palavra("Avião", "Turbina"));
        palavras.add(new Palavra("Arco-íris", "Espectro"));
        palavras.add(new Palavra("Anel", "Elo"));
        palavras.add(new Palavra("Algemas", "Restrição"));
        palavras.add(new Palavra("Álcool", "Solvente"));
        palavras.add(new Palavra("Abelha", "Polinização"));
        palavras.add(new Palavra("Árvore", "Raiz"));
        palavras.add(new Palavra("Sapo", "Anfíbio"));
        palavras.add(new Palavra("Mão", "Preensão"));
        palavras.add(new Palavra("Luz", "Fóton"));
        palavras.add(new Palavra("Lua", "Satélite"));
        palavras.add(new Palavra("Lixo", "Resíduo"));
        palavras.add(new Palavra("Fogo", "Combustão"));
        palavras.add(new Palavra("Dente", "Esmalte"));
        palavras.add(new Palavra("Corda", "Tensão"));
        palavras.add(new Palavra("Cama", "Repouso"));
        palavras.add(new Palavra("Cabelo", "Queratina"));
        palavras.add(new Palavra("Agulha", "Costura"));
        palavras.add(new Palavra("Bússola", "Magnetismo"));
        palavras.add(new Palavra("Escola", "Aprendizado"));
        palavras.add(new Palavra("Caminho", "Destino"));
        palavras.add(new Palavra("Porta", "Umbral"));
//Cotidiano e Objetos
        palavras.add(new Palavra("Garfo", "Utensílio"));
        palavras.add(new Palavra("Colher", "Côncavo"));
        palavras.add(new Palavra("Faca", "Corte"));
        palavras.add(new Palavra("Panela", "Cozimento"));
        palavras.add(new Palavra("Prato", "Recipiente"));
        palavras.add(new Palavra("Copo", "Líquido"));
        palavras.add(new Palavra("Toalha", "Absorção"));
        palavras.add(new Palavra("Travesseiro", "Maciez"));
        palavras.add(new Palavra("Cobertor", "Aquecimento"));
        palavras.add(new Palavra("Cortina", "Privacidade"));
        palavras.add(new Palavra("Tapete", "Piso"));
        palavras.add(new Palavra("Lâmpada", "Iluminação"));
        palavras.add(new Palavra("Interruptor", "Corrente"));
        palavras.add(new Palavra("Tomada", "Energia"));
        palavras.add(new Palavra("Vassoura", "Varredura"));
        palavras.add(new Palavra("Rodo", "Escoamento"));
        palavras.add(new Palavra("Balde", "Armazenamento"));
        palavras.add(new Palavra("Pregador", "Fixação"));
        palavras.add(new Palavra("Ferro", "Vapor"));
        palavras.add(new Palavra("Cabide", "Suporte"));
        palavras.add(new Palavra("Escova", "Cerdas"));
        palavras.add(new Palavra("Pente", "Desembaraço"));
        palavras.add(new Palavra("Espelho", "Reflexo"));
        palavras.add(new Palavra("Relógio", "Tempo"));
        palavras.add(new Palavra("Carteira", "Cédulas"));
        palavras.add(new Palavra("Bolsa", "Acessório"));
        palavras.add(new Palavra("Mochila", "Carga"));
        palavras.add(new Palavra("Chaveiro", "Argola"));
        palavras.add(new Palavra("Isqueiro", "Chama"));
        palavras.add(new Palavra("Cinzeiro", "Resíduo"));
//tec e ciencia
        palavras.add(new Palavra("Mouse", "Cursor"));
        palavras.add(new Palavra("Teclado", "Digitação"));
        palavras.add(new Palavra("Monitor", "Imagem"));
        palavras.add(new Palavra("Processador", "Cálculo"));
        palavras.add(new Palavra("Memória", "Armazenamento"));
        palavras.add(new Palavra("Internet", "Rede"));
        palavras.add(new Palavra("Roteador", "Sinal"));
        palavras.add(new Palavra("Satélite", "Órbita"));
        palavras.add(new Palavra("Telescópio", "Astronomia"));
        palavras.add(new Palavra("Microscópio", "Lente"));
        palavras.add(new Palavra("Átomo", "Partícula"));
        palavras.add(new Palavra("Molécula", "Ligação"));
        palavras.add(new Palavra("Célula", "Vida"));
        palavras.add(new Palavra("DNA", "Genética"));
        palavras.add(new Palavra("Bactéria", "Micro-organismo"));
        palavras.add(new Palavra("Vírus", "Infecção"));
        palavras.add(new Palavra("Vacinna", "Imunidade"));
        palavras.add(new Palavra("Antibiótico", "Tratamento"));
        palavras.add(new Palavra("Robô", "Automação"));
        palavras.add(new Palavra("Algoritmo", "Lógica"));
        palavras.add(new Palavra("Software", "Programa"));
        palavras.add(new Palavra("Hardware", "Físico"));
        palavras.add(new Palavra("Drone", "Remoto"));
        palavras.add(new Palavra("Laser", "Feixe"));
        palavras.add(new Palavra("Gravidade", "Atração"));
        palavras.add(new Palavra("Magnetismo", "Campo"));
        palavras.add(new Palavra("Eletricidade", "Elétrons"));
        palavras.add(new Palavra("Fóton", "Luz"));
        palavras.add(new Palavra("Quântica", "Física"));
        palavras.add(new Palavra("Espaço", "Vácuo"));
//Natureza e Animais
        palavras.add(new Palavra("Leão", "Felino"));
        palavras.add(new Palavra("Tubarão", "Predador"));
        palavras.add(new Palavra("Águia", "Visão"));
        palavras.add(new Palavra("Cobra", "Veneno"));
        palavras.add(new Palavra("Elefante", "Memória"));
        palavras.add(new Palavra("Girafa", "Pescoço"));
        palavras.add(new Palavra("Baleia", "Mamífero"));
        palavras.add(new Palavra("Golfinho", "Inteligência"));
        palavras.add(new Palavra("Formiga", "Colônia"));
        palavras.add(new Palavra("Abelha", "Colmeia"));
        palavras.add(new Palavra("Aranha", "Teia"));
        palavras.add(new Palavra("Morcego", "Sonar"));
        palavras.add(new Palavra("Coruja", "Noturno"));
        palavras.add(new Palavra("Lobo", "Alcateia"));
        palavras.add(new Palavra("Urso", "Hibernação"));
        palavras.add(new Palavra("Tartaruga", "Casco"));
        palavras.add(new Palavra("Jacaré", "Réptil"));
        palavras.add(new Palavra("Pinguim", "Antártida"));
        palavras.add(new Palavra("Canguru", "Marsupial"));
        palavras.add(new Palavra("Camelo", "Corcova"));
        palavras.add(new Palavra("Polvo", "Tentáculos"));
        palavras.add(new Palavra("Medusa", "Gelatina"));
        palavras.add(new Palavra("Coral", "Arrecife"));
        palavras.add(new Palavra("Floresta", "Biodiversidade"));
        palavras.add(new Palavra("Deserto", "Secura"));
        palavras.add(new Palavra("Oceano", "Abismo"));
        palavras.add(new Palavra("Montanha", "Altitude"));
        palavras.add(new Palavra("Rio", "Correnteza"));
        palavras.add(new Palavra("Cachoeira", "Queda"));
        palavras.add(new Palavra("Pântano", "Lama"));
//Conceitos Abstratos e Emoções
        palavras.add(new Palavra("Amor", "Sentimento"));
        palavras.add(new Palavra("Ódio", "Rancor"));
        palavras.add(new Palavra("Medo", "Fobia"));
        palavras.add(new Palavra("Alegria", "Euforia"));
        palavras.add(new Palavra("Tristeza", "Melancolia"));
        palavras.add(new Palavra("Coragem", "Bravura"));
        palavras.add(new Palavra("Justiça", "Equidade"));
        palavras.add(new Palavra("Liberdade", "Autonomia"));
        palavras.add(new Palavra("Paz", "Sossego"));
        palavras.add(new Palavra("Guerra", "Conflito"));
        palavras.add(new Palavra("Tempo", "Eternidade"));
        palavras.add(new Palavra("Destino", "Fado"));
        palavras.add(new Palavra("Sorte", "Acaso"));
        palavras.add(new Palavra("Azar", "Infortúnio"));
        palavras.add(new Palavra("Sonho", "Onírico"));
        palavras.add(new Palavra("Pesadelo", "Terror"));
        palavras.add(new Palavra("Memória", "Lembrança"));
        palavras.add(new Palavra("Esquecimento", "Amnésia"));
        palavras.add(new Palavra("Verdade", "Fato"));
        palavras.add(new Palavra("Mentira", "Engano"));
        palavras.add(new Palavra("Poder", "Autoridade"));
        palavras.add(new Palavra("Glória", "Triunfo"));
        palavras.add(new Palavra("Honra", "Dignidade"));
        palavras.add(new Palavra("Caos", "Desordem"));
        palavras.add(new Palavra("Ordem", "Estrutura"));
        palavras.add(new Palavra("Beleza", "Estética"));
        palavras.add(new Palavra("Sabedoria", "Conhecimento"));
        palavras.add(new Palavra("Ignorância", "Escuridão"));
        palavras.add(new Palavra("Esperança", "Expectativa"));
        palavras.add(new Palavra("Fé", "Crença"));
    }

    public Palavra sortear(){
        Random escolha = new Random();
        return palavras.get(escolha.nextInt(palavras.size()));
    }
}


