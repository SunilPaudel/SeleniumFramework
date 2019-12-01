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
 * DefectDetectedRelease generated by hbm2java
 */
@Entity
@Table(name = "DEFECT_DETECTED_RELEASE", schema = "QACUBE_IMPORT_STAGE", uniqueConstraints = @UniqueConstraint(columnNames = {
		"RELEASE_ID", "PROJECT_ID", "DEFECT_ID" }))
public class DefectDetectedRelease implements java.io.Serializable {

	private DefectDetectedReleaseId id;
	private Defect defect;
	private Project project;
	private ProjectRelease projectRelease;

	public DefectDetectedRelease() {
	}

	public DefectDetectedRelease(DefectDetectedReleaseId id, Defect defect, ProjectRelease projectRelease) {
		this.id = id;
		this.defect = defect;
		this.projectRelease = projectRelease;
	}

	public DefectDetectedRelease(DefectDetectedReleaseId id, Defect defect, Project project,
			ProjectRelease projectRelease) {
		this.id = id;
		this.defect = defect;
		this.project = project;
		this.projectRelease = projectRelease;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "releaseId", column = @Column(name = "RELEASE_ID", nullable = false, precision = 38, scale = 0)),
			@AttributeOverride(name = "projectId", column = @Column(name = "PROJECT_ID", precision = 38, scale = 0)),
			@AttributeOverride(name = "defectId", column = @Column(name = "DEFECT_ID", nullable = false, precision = 38, scale = 0)) })
	public DefectDetectedReleaseId getId() {
		return this.id;
	}

	public void setId(DefectDetectedReleaseId id) {
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
	@JoinColumn(name = "PROJECT_ID", insertable = false, updatable = false)
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RELEASE_ID", nullable = false, insertable = false, updatable = false)
	public ProjectRelease getProjectRelease() {
		return this.projectRelease;
	}

	public void setProjectRelease(ProjectRelease projectRelease) {
		this.projectRelease = projectRelease;
	}

}
