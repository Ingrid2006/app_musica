import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;



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
        int escolha = 0; 


        
        System.out.println("Informe seu nome para fazer o cadastro:");
        usu.setNome(sc.nextLine());

        sc.nextLine();
        System.out.print("\n Informe sua idade:");
        usu.setIdade(sc.nextInt());

        System.out.println(" ---- Musicas Disponiveis ----");

        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("/home/qwerty-note/Documents/tps/app_musica2/app_musica/tocalizando/musicas/");

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        System.out.println("****************************");
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println(pathname);
        }
        System.out.println("****************************");

        while (escolha  != 6){
        System.out.print("\n Escolha Qual musica toca: ");
        System.out.print("\n Escolha Qual musica toca: ");
        escolha= sc.nextInt();

        

        if (escolha == 1){
            try {
                FileInputStream fileInputStream = new FileInputStream("musicas/1-perl-jam-alive.mp3");
                Player player = new Player(fileInputStream);
                System.out.println("Tocando...");
                player.play();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JavaLayerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        else if (escolha == 2){
            try {
                FileInputStream fileInputStream = new FileInputStream("musicas/2-perl-jam-Even Flow.mp3");
                Player player = new Player(fileInputStream);
                System.out.println("Tocando...");
                player.play();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JavaLayerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        else if (escolha == 3){
            try {
                FileInputStream fileInputStream = new FileInputStream("musicas/3-perl-jam-jeremy.mp3");
                Player player = new Player(fileInputStream);
                System.out.println("Tocando...");
                player.play();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JavaLayerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        else if (escolha == 4){
            try {
                FileInputStream fileInputStream = new FileInputStream("musicas/4-perl-jam-black.mp3");
                Player player = new Player(fileInputStream);
                System.out.println("Tocando...");
                player.play();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (JavaLayerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        } 
        else if (escolha == 5){
            System.out.println("Saindo...:");
            break;
            
    


    }

    }
    
    }
}
