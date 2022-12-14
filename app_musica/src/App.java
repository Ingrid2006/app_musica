public class App {
    public static void main(String[] args) throws Exception {

        Artista artista = new Artista();
        musica musica1 = new musica();

        artista.setNome("Joao");

        musica1.setArtista(artista);

        System.out.println(musica1.toString());

    }
}
