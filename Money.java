
public class Money {
	private int pounds;
	private int pence;
	
	public Money(int po, int pe){
		pounds = po;
		pence  = pe;
	}
	
	public Money(double d){		
		pounds = (int) Math.floor(d);
		d = d - pounds;
		d = d*100;
		pence = (int) Math.round(d);
	}
	
	
	

	public void addMoney(Money otherMoney){	
	
		addPounds(otherMoney.getPounds());
		addPence(otherMoney.getPence());
	}
	
	public void addPounds(int po) {
		setPounds(pounds + po);
	}

	public void addPence(int pe) {
		setPence(pence + pe);
	}
	
	
	public void setPounds(int po) {
		pounds = po;
	}

	public void setPence(int pe) {
		pence = pe;
		while(pence>100){
			pounds++;
			pence -= 100;
		}
		while(pence<0){
			pounds--;
			pence += 100;
		}
	}

	public int getPounds() {
		return pounds;
	}

	public int getPence() {
		return pence;
	}

	public String toString() {
		if(pence < 10){
			return "£" + pounds + ".0" + pence;
		}
		return "£" + pounds + "." + pence;
	}
	
	
	
	

}
