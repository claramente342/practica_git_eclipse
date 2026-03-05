package circ;

public class PallassoMalabarista extends Malabarista{
	private String tipusPallaso;

	//constructor amb els atributs de la classe pare i el seu propi
	public PallassoMalabarista(String nom, int edat, TipusActuacio tipusActuacio, int pilotes, String pallasso) {
		super(nom, edat, tipusActuacio, pilotes);
		this.setTipusPallaso(pallasso);
	}
	

	//metode que imprimeix una broma
	public String realitzarBroma() {
		return "Un payaso (pésimo) a otro payaso…" + "\n– Pues el otro dia, en mi actuacion hubieron 77 risas" + "\n– ¿Las cuentas?" + "\n– No, es que había 77 personas y se rieron una vez.";
	}

	//metode per imprimir la seva informacio 
	@Override
	public String toString() {
		return super.toString() + "\nTipus Pallaso: " + tipusPallaso;
	}
	
	
	//	GETTERS - SETTERS
	public String getTipusPallaso() {
		return tipusPallaso;
	}

	public void setTipusPallaso(String tipusPallaso) {
		this.tipusPallaso = tipusPallaso;
	}
}
