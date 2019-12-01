package qacubeHbnFiles;
// Generated Jul 25, 2019 2:13:06 PM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DefectComponentId generated by hbm2java
 */
@Embeddable
public class DefectComponentId implements java.io.Serializable {

	private BigDecimal defectId;
	private BigDecimal componentId;

	public DefectComponentId() {
	}

	public DefectComponentId(BigDecimal defectId, BigDecimal componentId) {
		this.defectId = defectId;
		this.componentId = componentId;
	}

	@Column(name = "DEFECT_ID", nullable = false, precision = 38, scale = 0)
	public BigDecimal getDefectId() {
		return this.defectId;
	}

	public void setDefectId(BigDecimal defectId) {
		this.defectId = defectId;
	}

	@Column(name = "COMPONENT_ID", nullable = false, precision = 38, scale = 0)
	public BigDecimal getComponentId() {
		return this.componentId;
	}

	public void setComponentId(BigDecimal componentId) {
		this.componentId = componentId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DefectComponentId))
			return false;
		DefectComponentId castOther = (DefectComponentId) other;

		return ((this.getDefectId() == castOther.getDefectId()) || (this.getDefectId() != null
				&& castOther.getDefectId() != null && this.getDefectId().equals(castOther.getDefectId())))
				&& ((this.getComponentId() == castOther.getComponentId())
						|| (this.getComponentId() != null && castOther.getComponentId() != null
								&& this.getComponentId().equals(castOther.getComponentId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDefectId() == null ? 0 : this.getDefectId().hashCode());
		result = 37 * result + (getComponentId() == null ? 0 : this.getComponentId().hashCode());
		return result;
	}

}