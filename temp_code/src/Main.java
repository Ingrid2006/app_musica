import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Main {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("perl-jam-alive.mp3");
			Player player = new Player(fileInputStream);
			System.out.println("Song is playing...");
			player.play();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
