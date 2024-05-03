package fr.diginamic.banque.entites;

public abstract class Operation {

	private String date;
	protected double result;
	
	
	public Operation(String date, double result) {
		this.date = date;
		this.result = result;
	}

	public abstract void calcul(double op);

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public double getOperation() {
		return result;
	}


	public void setOperation(double result) {
		this.result = result;
	}


	@Override
	public String toString() {
		return "date=" + date + ", operation=" + result;
	}
	
	
}
