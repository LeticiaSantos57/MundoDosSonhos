public class Personagem {

    private String nome;
    private int vidas;
    private int pontos;
    private int estrelas;

    public Personagem(String nome) {
        this.nome = nome;
        this.vidas = 3;
        this.pontos = 0;
        this.estrelas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVidas() {
        return vidas;
    }

    public int getPontos() {
        return pontos;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void ganharPontos(int quantidade) {
        pontos += quantidade;
    }

    public void ganharEstrela() {
        estrelas++;
    }

    public void perderVida() {
        if (vidas > 0) {
            vidas--;
        }
    }

    public void usarHabilidade() {
        System.out.println(nome + " usou uma habilidade!");
    }

    public void mostrarStatus() {
        IO.println("Nome: " + nome);
        IO.println("Vidas: " + vidas);
        IO.println("Pontos: " + pontos);
        IO.println("Estrelas: " + estrelas);
    }


}

