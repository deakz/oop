package bean;

import java.util.Date;

public class TesztBean {

	public Integer id;
	private String nev;
	protected Date szuletesiIdo;
	Boolean ferfi;
	private BeosztottEnum beosztas;
	protected Double magassag;
	private static Integer letszam;
	
	public static final String NEV = "nev";
	
	public TesztBean() {
		letszam++;
	}
	
	public TesztBean(Integer id, String nev, Date szuletesiIdo) {
		this();
		this.id = id;
		this.nev = nev;
		this.szuletesiIdo = szuletesiIdo;
		ferfi = null;
		beosztas = BeosztottEnum.BEOSZTOTT;
		magassag = null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public Date getSzuletesiIdo() {
		return szuletesiIdo;
	}

	public void setSzuletesiIdo(Date szuletesiIdo) {
		this.szuletesiIdo = szuletesiIdo;
	}

	public Boolean getFerfi() {
		return ferfi;
	}

	public void setFerfi(Boolean ferfi) {
		this.ferfi = ferfi;
	}

	public BeosztottEnum getBeosztas() {
		return beosztas;
	}

	public void setBeosztas(BeosztottEnum beosztas) {
		this.beosztas = beosztas;
	}

	public Double getMagassag() {
		return magassag;
	}

	public void setMagassag(Double magassag) {
		this.magassag = magassag;
	}

	public static Integer getLetszam() {
		return letszam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((beosztas == null) ? 0 : beosztas.hashCode());
		result = prime * result + ((ferfi == null) ? 0 : ferfi.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((magassag == null) ? 0 : magassag.hashCode());
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		result = prime * result
				+ ((szuletesiIdo == null) ? 0 : szuletesiIdo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TesztBean other = (TesztBean) obj;
		if (beosztas != other.beosztas)
			return false;
		if (ferfi == null) {
			if (other.ferfi != null)
				return false;
		} else if (!ferfi.equals(other.ferfi))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (magassag == null) {
			if (other.magassag != null)
				return false;
		} else if (!magassag.equals(other.magassag))
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		if (szuletesiIdo == null) {
			if (other.szuletesiIdo != null)
				return false;
		} else if (!szuletesiIdo.equals(other.szuletesiIdo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TesztBean [id=");
		builder.append(id);
		builder.append(", nev=");
		builder.append(nev);
		builder.append(", szuletesiIdo=");
		builder.append(szuletesiIdo);
		builder.append(", ferfi=");
		builder.append(ferfi);
		builder.append(", beosztas=");
		builder.append(beosztas);
		builder.append(", magassag=");
		builder.append(magassag);
		builder.append("]");
		return builder.toString();
	}

	
	
}
