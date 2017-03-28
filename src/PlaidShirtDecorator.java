
public class PlaidShirtDecorator extends ShirtDecorator {
	public PlaidShirtDecorator(Shirts decoratedShirt){
		super(decoratedShirt);
	}
	public void style(){
		decoratedShirt.style();
		setPlaidShirt(decoratedShirt);
	}
	
	private void setPlaidShirt(Shirts decoratedShirt){
		System.out.println("Shirt Design: Plaid");
	}
}
