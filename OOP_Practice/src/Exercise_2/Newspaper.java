package Exercise_2;

public class Newspaper extends Document{
	private int numberPublished;
	private int monthPublished;
	
	public Newspaper() {
		super();
	}

	public Newspaper(int idDocument, String namePublish, int numberPublish, int numberPublished, int monthPublished) {
		super(idDocument, namePublish, numberPublish);
		this.numberPublished = numberPublished;
		this.monthPublished = monthPublished;
	}

	public int getNumberPublished() {
		return numberPublished;
	}

	public void setNumberPublished(int numberPublished) {
		this.numberPublished = numberPublished;
	}

	public int getMonthPublished() {
		return monthPublished;
	}

	public void setMonthPublished(int monthPublished) {
		this.monthPublished = monthPublished;
	}

	@Override
	public String toString() {
		return "Newspaper [numberPublished= " + numberPublished + ", monthPublished= " + monthPublished
				+ ", NumberPublished= " + getNumberPublished() + ", MonthPublished= " + getMonthPublished()
				+ "]";
	}
	
	

	
	
	
}
