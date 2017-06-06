import java.util.ArrayList;

public class Archer extends Personnage{
	private ArrayList Sort;
	private Cac cac = new Cac("Coup de poing",1.0,"physique");

	public Archer() {
		super(90, 100, 0.3, 50, 30, 15, 15);
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
