package net.codejava.oracle.model;
// Generated 2020-3-22 21:34:37 by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SalgradeId generated by hbm2java
 */
@Embeddable
public class SalgradeId implements java.io.Serializable {

	private BigDecimal grade;
	private BigDecimal losal;
	private BigDecimal hisal;

	public SalgradeId() {
	}

	public SalgradeId(BigDecimal grade, BigDecimal losal, BigDecimal hisal) {
		this.grade = grade;
		this.losal = losal;
		this.hisal = hisal;
	}

	@Column(name = "GRADE", precision = 22, scale = 0)
	public BigDecimal getGrade() {
		return this.grade;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}

	@Column(name = "LOSAL", precision = 22, scale = 0)
	public BigDecimal getLosal() {
		return this.losal;
	}

	public void setLosal(BigDecimal losal) {
		this.losal = losal;
	}

	@Column(name = "HISAL", precision = 22, scale = 0)
	public BigDecimal getHisal() {
		return this.hisal;
	}

	public void setHisal(BigDecimal hisal) {
		this.hisal = hisal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SalgradeId))
			return false;
		SalgradeId castOther = (SalgradeId) other;

		return ((this.getGrade() == castOther.getGrade()) || (this.getGrade() != null && castOther.getGrade() != null
				&& this.getGrade().equals(castOther.getGrade())))
				&& ((this.getLosal() == castOther.getLosal()) || (this.getLosal() != null
						&& castOther.getLosal() != null && this.getLosal().equals(castOther.getLosal())))
				&& ((this.getHisal() == castOther.getHisal()) || (this.getHisal() != null
						&& castOther.getHisal() != null && this.getHisal().equals(castOther.getHisal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGrade() == null ? 0 : this.getGrade().hashCode());
		result = 37 * result + (getLosal() == null ? 0 : this.getLosal().hashCode());
		result = 37 * result + (getHisal() == null ? 0 : this.getHisal().hashCode());
		return result;
	}

}
