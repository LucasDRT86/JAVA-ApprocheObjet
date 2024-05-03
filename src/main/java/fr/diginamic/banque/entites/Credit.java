package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	

	public Credit(String date, double result) {
		super(date, result);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " CREDIT";
	}
	

	@Override
	public void calcul(double credit) {
		
		super.setOperation(getOperation() + credit);
	}

}
