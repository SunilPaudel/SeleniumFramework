package qacubeHbnFiles;
// Generated Jul 25, 2019 2:13:06 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TestcaseDefect generated by hbm2java
 */
@Entity
@Table(name = "TESTCASE_DEFECT", schema = "QACUBE_IMPORT_STAGE", uniqueConstraints = @UniqueConstraint(columnNames = {
		"TESTCASE_ID", "DEFECT_ID" }))
public class TestcaseDefect implements java.io.Serializable {

	private TestcaseDefectId id;
	private Defect defect;
	private QTestcaseStatus QTestcaseStatus;
	private Testcase testcase;

	public TestcaseDefect() {
	}

	public TestcaseDefect(TestcaseDefectId id, Defect defect, Testcase testcase) {
		this.id = id;
		this.defect = defect;
		this.testcase = testcase;
	}

	public TestcaseDefect(TestcaseDefectId id, Defect defect, QTestcaseStatus QTestcaseStatus, Testcase testcase) {
		this.id = id;
		this.defect = defect;
		this.QTestcaseStatus = QTestcaseStatus;
		this.testcase = testcase;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "testcaseId", column = @Column(name = "TESTCASE_ID", nullable = false, precision = 38, scale = 0)),
			@AttributeOverride(name = "defectId", column = @Column(name = "DEFECT_ID", nullable = false, precision = 38, scale = 0)),
			@AttributeOverride(name = "testcaseStatusId", column = @Column(name = "TESTCASE_STATUS_ID", precision = 38, scale = 0)) })
	public TestcaseDefectId getId() {
		return this.id;
	}

	public void setId(TestcaseDefectId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEFECT_ID", nullable = false, insertable = false, updatable = false)
	public Defect getDefect() {
		return this.defect;
	}

	public void setDefect(Defect defect) {
		this.defect = defect;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TESTCASE_STATUS_ID", insertable = false, updatable = false)
	public QTestcaseStatus getQTestcaseStatus() {
		return this.QTestcaseStatus;
	}

	public void setQTestcaseStatus(QTestcaseStatus QTestcaseStatus) {
		this.QTestcaseStatus = QTestcaseStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TESTCASE_ID", nullable = false, insertable = false, updatable = false)
	public Testcase getTestcase() {
		return this.testcase;
	}

	public void setTestcase(Testcase testcase) {
		this.testcase = testcase;
	}

}