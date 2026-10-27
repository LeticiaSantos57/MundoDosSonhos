public class Lugar {

    private String nome;
    private String descricao;

    public Lugar(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void explorar() {
        IO.println("\nVocê chegou a: " + nome);
        IO.println(descricao);
    }
}


