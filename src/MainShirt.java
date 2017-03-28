
public class MainShirt {

	public static void main(String[] args) {
		Shirts flannel = new Flannel();
		Shirts stripedflannel = new StripedShirtDecorator(new Flannel());
		
		Shirts stripedPolo = new StripedShirtDecorator(new Polo());
		
		//System.out.println("Basic Shirt");
		//flannel.draw();
		
		System.out.println("Type of Shirt?");
		stripedflannel.style();
		
		System.out.println("\nType of Shirt?");
		stripedPolo.style();

		
		Shirts plaidflannel = new PlaidShirtDecorator(new Flannel());
		
		Shirts plaidPolo = new PlaidShirtDecorator(new Polo());
		
		System.out.println("\nType of Shirt?");
		plaidflannel.style();
		
		System.out.println("\nType of Shirt?");
		plaidPolo.style();
		
	}

}
