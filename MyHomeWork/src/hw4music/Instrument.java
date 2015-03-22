package hw4music;

public abstract class Instrument {
	
	public void getFromBox() {
		System.out.println("Get the " +  this.getClass().getSimpleName() + " from box");
	}
	
	public void clean() {
		System.out.println("Remove dust from " + this.getClass().getSimpleName());
	}
	
	public abstract void checkSound();
	

}
