import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        Usuario usu = new Usuario(); 
        Artista art = new Artista();
        Playlist pla = new Playlist();
        Categoria cat = new Categoria();
        Musica mus = new Musica();
        Genero gen = new Genero();
        Album alb = new Album(); 


        
        System.out.println("Informe seu nome para fazer o cadastro:");
        usu.setNome(sc.nextLine());

        System.out.print("\n Informe sua idade:");
        usu.setIdade(sc.nextInt());

        



        


    }
}
