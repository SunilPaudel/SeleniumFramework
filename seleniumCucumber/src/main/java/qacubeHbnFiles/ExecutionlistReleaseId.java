package qacubeHbnFiles;
// Generated Jul 25, 2019 2:13:06 PM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ExecutionlistReleaseId generated by hbm2java
 */
@Embeddable
public class ExecutionlistReleaseId implements java.io.Serializable {

	private BigDecimal executionlistId;
	private BigDecimal projectId;
	private BigDecimal releaseId;

	public ExecutionlistReleaseId() {
	}

	public ExecutionlistReleaseId(BigDecimal executionlistId) {
		this.executionlistId = executionlistId;
	}

	public ExecutionlistReleaseId(BigDecimal executionlistId, BigDecimal projectId, BigDecimal releaseId) {
		this.executionlistId = executionlistId;
		this.projectId = projectId;
		this.releaseId = releaseId;
	}

	@Column(name = "EXECUTIONLIST_ID", nullable = false, precision = 38, scale = 0)
	public BigDecimal getExecutionlistId() {
		return this.executionlistId;
	}

	public void setExecutionlistId(BigDecimal executionlistId) {
		this.executionlistId = executionlistId;
	}

	@Column(name = "PROJECT_ID", precision = 38, scale = 0)
	public BigDecimal getProjectId() {
		return this.projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	@Column(name = "RELEASE_ID", precision = 38, scale = 0)
	public BigDecimal getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(BigDecimal releaseId) {
		this.releaseId = releaseId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExecutionlistReleaseId))
			return false;
		ExecutionlistReleaseId castOther = (ExecutionlistReleaseId) other;

		return ((this.getExecutionlistId() == castOther.getExecutionlistId())
				|| (this.getExecutionlistId() != null && castOther.getExecutionlistId() != null
						&& this.getExecutionlistId().equals(castOther.getExecutionlistId())))
				&& ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
						&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getReleaseId() == castOther.getReleaseId()) || (this.getReleaseId() != null
						&& castOther.getReleaseId() != null && this.getReleaseId().equals(castOther.getReleaseId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getExecutionlistId() == null ? 0 : this.getExecutionlistId().hashCode());
		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getReleaseId() == null ? 0 : this.getReleaseId().hashCode());
		return result;
	}

}
