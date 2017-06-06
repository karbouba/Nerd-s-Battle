import java.util.ArrayList;

public class Guerrier extends Personnage{
	private ArrayList Sort;
	private Cac cac = new Cac("Coup de poing",1.0,"physique");

	public Guerrier() {
		super(100, 80, 0.1, 50, 20, 40, 10);
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
