public class Musica {
    private int id;
    private String Nome;
    private int duracao;
    private Artista artista;

    public Musica() {
    }

    public Artista getArtista() {
        return this.artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Musica(int id, String Nome, int duracao) {
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



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", Nome='" + getNome() + "'" +
            ", duracao='" + getDuracao() + "'" +
            ", artista='" + getArtista().getNome() + "'" +
            "}";
    }

}
