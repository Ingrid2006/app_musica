public class musica {
    private int id;
    private String Nome;
    private int duracao;


    public musica() {
    }

    public musica(int id, String Nome, int duracao) {
        this.id = id;
        this.Nome = Nome;
        this.duracao = duracao;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

}
