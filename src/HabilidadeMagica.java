public class HabilidadeMagica {

    private String nome;
    private String descricao;
    private int poder;

    public HabilidadeMagica(String nome, String descricao, int poder) {
        this.nome = nome;
        this.descricao = descricao;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPoder() {
        return poder;
    }

    public void usar() {
        IO.println("Você usou a habilidade mágica: " + nome + "!");
    }
}
