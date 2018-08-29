package procancha.app.login.dto;

import java.math.BigDecimal;


/**
 * The persistent class for the PARARE database table.
 * 
 */
public class AreaDTO {

	private BigDecimal areCod;
	private String areGlo;

	public AreaDTO(BigDecimal areCod, String areGlo) {
		super();
		this.areCod = areCod;
		this.areGlo =areGlo;
	}

	public BigDecimal getAreCod() {
		return areCod;
	}

	public void setAreCod(BigDecimal areCod) {
		this.areCod = areCod;
	}

	public String getAreGlo() {
		return areGlo;
	}

	public void setAreGlo(String areGlo) {
		this.areGlo = areGlo;
	}

	

}