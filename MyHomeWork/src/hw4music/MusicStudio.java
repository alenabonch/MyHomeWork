package hw4music;

public class MusicStudio {
	
	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[6];
		
		instruments[0] = new Guitar();
		instruments[1] = new Piano();
		instruments[2] = new Flute();
		instruments[3] = new Horn();
		instruments[4] = new Fortepiano();
		instruments[5] = new Violin();
		
		for (Instrument instrument : instruments) {
			instrument.getFromBox();
			instrument.clean();
			instrument.checkSound();
		}
	}
}
