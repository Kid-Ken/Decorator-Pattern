
public class StripedShirtDecorator extends ShirtDecorator {
	public StripedShirtDecorator(Shirts decoratedShirt){
		super(decoratedShirt);
	}
	public void style(){
		decoratedShirt.style();
		setStripedShirt(decoratedShirt);
	}
	
	private void setStripedShirt(Shirts decoratedShirt){
		System.out.println("Shirt Design: Striped");
	}
}
