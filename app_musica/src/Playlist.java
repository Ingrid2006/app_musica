public class Playlist {
    private String nome;
    private int tempo;
    private Album album;
    private musica musicas;
    private Usuario usuario;

    public Playlist() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return this.tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Album getAlbum() {
        return this.album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public musica getMusicas() {
        return this.musicas;
    }

    public void setMusicas(musica musicas) {
        this.musicas = musicas;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}