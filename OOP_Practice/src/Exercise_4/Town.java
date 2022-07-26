package Exercise_4;

import java.util.ArrayList;
import java.util.List;

public class Town {
	private List<Family> listFamily;
	
	public Town() {
		this.listFamily = new ArrayList<Family>();
	}

	public List<Family> getListFamily() {
		return listFamily;
	}

	public void setListFamily(List<Family> listFamily) {
		this.listFamily = listFamily;
	}
	
	public void addFamily(Family family) {
		this.listFamily.add(family);
	}

}
