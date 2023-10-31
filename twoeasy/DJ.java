package twoeasy;

public class DJ implements Playable{

	public void playSong(Song song) {
		if(song instanceof Playable) {
			play();
		}
	}

	@Override
	public void play() {
		System.out.println("Playing ");
	}
}
