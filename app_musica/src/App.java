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
        int escolha = 0; 


        
        System.out.println("Informe seu nome para fazer o cadastro:");
        usu.setNome(sc.nextLine());

        sc.nextLine();
        System.out.print("\n Informe sua idade:");
        usu.setIdade(sc.nextInt());

        while (escolha  != 6){
        System.out.print("\n Digite: \n 1 - escutar musica \n 2- criar playlist  \n 3 - Escutar um album    \n 4 - Assinar plano artistista\n 5 - ouvir playlist de generos \n 6 - Sair ");
        escolha= sc.nextInt();

        if (escolha == 1){
        }

        else if (escolha == 2){
        }
        
        else if (escolha == 3){
        }

        else if (escolha == 4){
            System.out.println("Informe sua gravadora:");
            art.setGravadora(sc.nextLine());
            
        } 
        else if (escolha == 5){
            System.out.println("qual genero gostaria de ouvir:");
            while (escolha  != 3){
                System.out.print("\n 1 - Blues \n 2- pop  \n 3 - nenhum");
                escolha= sc.nextInt(); 
                
        if (escolha == 1){ 

        } 
        else if (escolha == 2){
        }
        else if (escolha == 3){
        }
        
           
        }
    


    }

    }
}
}