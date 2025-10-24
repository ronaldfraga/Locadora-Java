package model.entites;

public class InVoice {
	
	private Double BasicPayment;
	private Double tax;
	
	public InVoice() {
		
	}

	public InVoice(Double basicPayment, Double tax) {
		BasicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return BasicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		BasicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() - getTax();
	}
	


	
	
}
