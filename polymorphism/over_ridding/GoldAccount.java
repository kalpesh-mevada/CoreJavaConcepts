package over_ridding;

public class GoldAccount extends SilverAccount{
	
	@Override
	public void chqBook(){
		System.out.println("Unlimited Chaque Book");
	}	
	
	public static void main(String[] args) {
		GoldAccount ga = new GoldAccount();
		System.out.println("----Gold Account----");
		ga.chqBook();
		ga.phBooking();
		ga.atmCard();		
		SilverAccount sa = new SilverAccount();
		System.out.println("----Silver Account----");
		sa.chqBook();
		sa.phBooking();
		sa.atmCard();
	}
}
