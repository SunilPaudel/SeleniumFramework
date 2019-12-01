package qacubeHbnFiles;
// Generated Jul 25, 2019 2:13:06 PM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TestcaseDefectId generated by hbm2java
 */
@Embeddable
public class TestcaseDefectId implements java.io.Serializable {

	private BigDecimal testcaseId;
	private BigDecimal defectId;
	private BigDecimal testcaseStatusId;

	public TestcaseDefectId() {
	}

	public TestcaseDefectId(BigDecimal testcaseId, BigDecimal defectId) {
		this.testcaseId = testcaseId;
		this.defectId = defectId;
	}

	public TestcaseDefectId(BigDecimal testcaseId, BigDecimal defectId, BigDecimal testcaseStatusId) {
		this.testcaseId = testcaseId;
		this.defectId = defectId;
		this.testcaseStatusId = testcaseStatusId;
	}

	@Column(name = "TESTCASE_ID", nullable = false, precision = 38, scale = 0)
	public BigDecimal getTestcaseId() {
		return this.testcaseId;
	}

	public void setTestcaseId(BigDecimal testcaseId) {
		this.testcaseId = testcaseId;
	}

	@Column(name = "DEFECT_ID", nullable = false, precision = 38, scale = 0)
	public BigDecimal getDefectId() {
		return this.defectId;
	}

	public void setDefectId(BigDecimal defectId) {
		this.defectId = defectId;
	}

	@Column(name = "TESTCASE_STATUS_ID", precision = 38, scale = 0)
	public BigDecimal getTestcaseStatusId() {
		return this.testcaseStatusId;
	}

	public void setTestcaseStatusId(BigDecimal testcaseStatusId) {
		this.testcaseStatusId = testcaseStatusId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TestcaseDefectId))
			return false;
		TestcaseDefectId castOther = (TestcaseDefectId) other;

		return ((this.getTestcaseId() == castOther.getTestcaseId()) || (this.getTestcaseId() != null
				&& castOther.getTestcaseId() != null && this.getTestcaseId().equals(castOther.getTestcaseId())))
				&& ((this.getDefectId() == castOther.getDefectId()) || (this.getDefectId() != null
						&& castOther.getDefectId() != null && this.getDefectId().equals(castOther.getDefectId())))
				&& ((this.getTestcaseStatusId() == castOther.getTestcaseStatusId())
						|| (this.getTestcaseStatusId() != null && castOther.getTestcaseStatusId() != null
								&& this.getTestcaseStatusId().equals(castOther.getTestcaseStatusId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTestcaseId() == null ? 0 : this.getTestcaseId().hashCode());
		result = 37 * result + (getDefectId() == null ? 0 : this.getDefectId().hashCode());
		result = 37 * result + (getTestcaseStatusId() == null ? 0 : this.getTestcaseStatusId().hashCode());
		return result;
	}

}
