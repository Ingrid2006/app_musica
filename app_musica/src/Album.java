public class Album {
    private int id;
    private String nome;
    private int duracao;
    private Artista artista;
    private  Musica musicas;
    private Genero genero;


    public Album() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Artista getArtista() {
        return this.artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Musica getMusicas() {
        return this.musicas;
    }

    public void setMusicas(Musica musicas) {
        this.musicas = musicas;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


}
