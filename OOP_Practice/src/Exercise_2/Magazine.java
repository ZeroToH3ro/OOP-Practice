package Exercise_2;

public class Magazine extends Document{
	private int dayPublished;

	public Magazine() {
		super();
	}

	public Magazine(int idDocument, String namePublish, int numberPublish, int dayPublished) {
		super(idDocument, namePublish, numberPublish);
		this.dayPublished = dayPublished;
	}

	public int getDayPublished() {
		return dayPublished;
	}

	public void setDayPublished(int dayPublished) {
		this.dayPublished = dayPublished;
	}

	@Override
	public String toString() {
		return "Magazine [dayPublished= " + dayPublished + ", IdDocument= " + getIdDocument() + ", NamePublish= "
				+ getNamePublish() + ", NumberPublish= " + getNumberPublish() + "]";
	}

	
	
	
}
