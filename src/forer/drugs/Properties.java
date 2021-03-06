package forer.drugs;

public class Properties {

	private int aromatic_rings;
	private String full_molformula;
	private String full_mwt;
	private String molecular_species;

	public final int getRings() {
		return aromatic_rings;
	}

	public final String getFormula() {
		return full_molformula;
	}

	public final String getWeight() {
		return full_mwt;
	}

	public final String getSpecies() {
		return molecular_species;
	}

}
