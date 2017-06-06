import java.util.ArrayList;

public class Poutch extends Personnage{
	private ArrayList Sort;
	private Cac cac = new Cac("Trempette",0.0,"physique");

	public Poutch() {
		super(100, 0, 0, 0, 0, 0, 0);
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
