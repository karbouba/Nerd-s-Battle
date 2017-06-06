import java.util.ArrayList;

public class Mage extends Personnage{
	private ArrayList Sort;
	private Cac cac = new Cac("Coup de poing",1.0,"physique");

	public Mage() {
		super(90, 90, 0.2, 30, 50, 10, 40);
	}

	public ArrayList getSort() {
		return Sort;
	}

	public void setSort(ArrayList sort) {
		Sort = sort;
	}

	public Cac getCac() {
		return cac;
	}

	public void setCac(Cac cac) {
		this.cac = cac;
	}
	
	
}
