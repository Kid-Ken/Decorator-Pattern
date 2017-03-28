
public abstract class ShirtDecorator implements Shirts {
	
	protected Shirts decoratedShirt;
	public ShirtDecorator(Shirts decoratedShirt){
		this.decoratedShirt = decoratedShirt;
	}
	public void style(){
		decoratedShirt.style();
	}

}
