package hw4music;

public class Flute extends Winds {

	@Override
	public void checkSound() {
		System.out.println("Right sound for " + 
				this.getClass().getSimpleName() + "is ti-ta-ti-ta");
		
	}
	

}
