package day27abstractiondt;

public class Civic extends Honda {

	@Override
	public void engine() {
		System.out.println("1.6 Eco");	
	}

	@Override
	public void ac() {
		System.out.println("Manual Eco AC");
	}

	@Override
	public void leather() {
		// TODO Auto-generated method stub
		super.leather();
	}
}
