package fr.diginamic.banque.entites;

public class Debit extends Operation {

	double debit;
	
	public Debit(String date, double result) {
		super(date, result);
	}

	@Override
	public String toString() {
		return super.toString() + " DEBIT";
	}

	@Override
	public void calcul(double debit) {
		
		super.setOperation(getOperation() - debit);
	}
	
	

}
