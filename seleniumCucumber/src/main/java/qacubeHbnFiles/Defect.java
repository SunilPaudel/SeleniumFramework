package qacubeHbnFiles;
// Generated Jul 25, 2019 2:13:06 PM by Hibernate Tools 5.2.3.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Defect generated by hbm2java
 */
@Entity
@Table(name = "DEFECT", schema = "QACUBE_IMPORT_STAGE")
public class Defect implements java.io.Serializable {

	private BigDecimal id;
	private ProjectRelease projectRelease;
	private String name;
	private BigDecimal defectStatusId;
	private String summary;
	private BigDecimal defectPriorityId;
	private Date dueDate;
	private String assignee;
	private String description;
	private String defectComment;
	private Serializable creationTime;
	private Serializable closingDate;
	private BigDecimal defectSeverityId;
	private BigDecimal estimatedFixTime;
	private BigDecimal actualFixTime;
	private String detectedBy;
	private BigDecimal parentId;
	private String testcaseExtId;
	private String sourceOrder;
	private String url;
	private String custom1;
	private String custom2;
	private String custom3;
	private String custom4;
	private BigDecimal environmentId;
	private String externalEntityId;
	private BigDecimal defectWorkstateId;
	private String targetRequirementEntityId;
	private String targetTestcaseEntityId;
	private String custom5;
	private String custom6;
	private String custom7;
	private String custom8;
	private String custom9;
	private String custom10;
	private String domainProject;
	private String detectedRelease;
	private Set defectComponents = new HashSet(0);
	private Set requirementDefects = new HashSet(0);
	private Set defectTargetReleases = new HashSet(0);
	private Set testcaseDefects = new HashSet(0);
	private Set defectDetectedReleases = new HashSet(0);

	public Defect() {
	}

	public Defect(BigDecimal id, String name) {
		this.id = id;
		this.name = name;
	}

	public Defect(BigDecimal id, ProjectRelease projectRelease, String name, BigDecimal defectStatusId, String summary,
			BigDecimal defectPriorityId, Date dueDate, String assignee, String description, String defectComment,
			Serializable creationTime, Serializable closingDate, BigDecimal defectSeverityId,
			BigDecimal estimatedFixTime, BigDecimal actualFixTime, String detectedBy, BigDecimal parentId,
			String testcaseExtId, String sourceOrder, String url, String custom1, String custom2, String custom3,
			String custom4, BigDecimal environmentId, String externalEntityId, BigDecimal defectWorkstateId,
			String targetRequirementEntityId, String targetTestcaseEntityId, String custom5, String custom6,
			String custom7, String custom8, String custom9, String custom10, String domainProject,
			String detectedRelease, Set defectComponents, Set requirementDefects, Set defectTargetReleases,
			Set testcaseDefects, Set defectDetectedReleases) {
		this.id = id;
		this.projectRelease = projectRelease;
		this.name = name;
		this.defectStatusId = defectStatusId;
		this.summary = summary;
		this.defectPriorityId = defectPriorityId;
		this.dueDate = dueDate;
		this.assignee = assignee;
		this.description = description;
		this.defectComment = defectComment;
		this.creationTime = creationTime;
		this.closingDate = closingDate;
		this.defectSeverityId = defectSeverityId;
		this.estimatedFixTime = estimatedFixTime;
		this.actualFixTime = actualFixTime;
		this.detectedBy = detectedBy;
		this.parentId = parentId;
		this.testcaseExtId = testcaseExtId;
		this.sourceOrder = sourceOrder;
		this.url = url;
		this.custom1 = custom1;
		this.custom2 = custom2;
		this.custom3 = custom3;
		this.custom4 = custom4;
		this.environmentId = environmentId;
		this.externalEntityId = externalEntityId;
		this.defectWorkstateId = defectWorkstateId;
		this.targetRequirementEntityId = targetRequirementEntityId;
		this.targetTestcaseEntityId = targetTestcaseEntityId;
		this.custom5 = custom5;
		this.custom6 = custom6;
		this.custom7 = custom7;
		this.custom8 = custom8;
		this.custom9 = custom9;
		this.custom10 = custom10;
		this.domainProject = domainProject;
		this.detectedRelease = detectedRelease;
		this.defectComponents = defectComponents;
		this.requirementDefects = requirementDefects;
		this.defectTargetReleases = defectTargetReleases;
		this.testcaseDefects = testcaseDefects;
		this.defectDetectedReleases = defectDetectedReleases;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 38, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DETECTED_RELEASE_ID")
	public ProjectRelease getProjectRelease() {
		return this.projectRelease;
	}

	public void setProjectRelease(ProjectRelease projectRelease) {
		this.projectRelease = projectRelease;
	}

	@Column(name = "NAME", nullable = false, length = 2000)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DEFECT_STATUS_ID", precision = 38, scale = 0)
	public BigDecimal getDefectStatusId() {
		return this.defectStatusId;
	}

	public void setDefectStatusId(BigDecimal defectStatusId) {
		this.defectStatusId = defectStatusId;
	}

	@Column(name = "SUMMARY", length = 2000)
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "DEFECT_PRIORITY_ID", precision = 38, scale = 0)
	public BigDecimal getDefectPriorityId() {
		return this.defectPriorityId;
	}

	public void setDefectPriorityId(BigDecimal defectPriorityId) {
		this.defectPriorityId = defectPriorityId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DUE_DATE", length = 7)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Column(name = "ASSIGNEE", length = 2000)
	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Column(name = "DESCRIPTION", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "DEFECT_COMMENT", length = 4000)
	public String getDefectComment() {
		return this.defectComment;
	}

	public void setDefectComment(String defectComment) {
		this.defectComment = defectComment;
	}

	@Column(name = "CREATION_TIME")
	public Serializable getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Serializable creationTime) {
		this.creationTime = creationTime;
	}

	@Column(name = "CLOSING_DATE")
	public Serializable getClosingDate() {
		return this.closingDate;
	}

	public void setClosingDate(Serializable closingDate) {
		this.closingDate = closingDate;
	}

	@Column(name = "DEFECT_SEVERITY_ID", precision = 38, scale = 0)
	public BigDecimal getDefectSeverityId() {
		return this.defectSeverityId;
	}

	public void setDefectSeverityId(BigDecimal defectSeverityId) {
		this.defectSeverityId = defectSeverityId;
	}

	@Column(name = "ESTIMATED_FIX_TIME", precision = 22, scale = 0)
	public BigDecimal getEstimatedFixTime() {
		return this.estimatedFixTime;
	}

	public void setEstimatedFixTime(BigDecimal estimatedFixTime) {
		this.estimatedFixTime = estimatedFixTime;
	}

	@Column(name = "ACTUAL_FIX_TIME", precision = 22, scale = 0)
	public BigDecimal getActualFixTime() {
		return this.actualFixTime;
	}

	public void setActualFixTime(BigDecimal actualFixTime) {
		this.actualFixTime = actualFixTime;
	}

	@Column(name = "DETECTED_BY", length = 1020)
	public String getDetectedBy() {
		return this.detectedBy;
	}

	public void setDetectedBy(String detectedBy) {
		this.detectedBy = detectedBy;
	}

	@Column(name = "PARENT_ID", precision = 38, scale = 0)
	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	@Column(name = "TESTCASE_EXT_ID", length = 1020)
	public String getTestcaseExtId() {
		return this.testcaseExtId;
	}

	public void setTestcaseExtId(String testcaseExtId) {
		this.testcaseExtId = testcaseExtId;
	}

	@Column(name = "SOURCE_ORDER", length = 1020)
	public String getSourceOrder() {
		return this.sourceOrder;
	}

	public void setSourceOrder(String sourceOrder) {
		this.sourceOrder = sourceOrder;
	}

	@Column(name = "URL", length = 4000)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "CUSTOM1", length = 4000)
	public String getCustom1() {
		return this.custom1;
	}

	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}

	@Column(name = "CUSTOM2", length = 4000)
	public String getCustom2() {
		return this.custom2;
	}

	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}

	@Column(name = "CUSTOM3", length = 4000)
	public String getCustom3() {
		return this.custom3;
	}

	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}

	@Column(name = "CUSTOM4", length = 4000)
	public String getCustom4() {
		return this.custom4;
	}

	public void setCustom4(String custom4) {
		this.custom4 = custom4;
	}

	@Column(name = "ENVIRONMENT_ID", precision = 38, scale = 0)
	public BigDecimal getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(BigDecimal environmentId) {
		this.environmentId = environmentId;
	}

	@Column(name = "EXTERNAL_ENTITY_ID", length = 1020)
	public String getExternalEntityId() {
		return this.externalEntityId;
	}

	public void setExternalEntityId(String externalEntityId) {
		this.externalEntityId = externalEntityId;
	}

	@Column(name = "DEFECT_WORKSTATE_ID", precision = 22, scale = 0)
	public BigDecimal getDefectWorkstateId() {
		return this.defectWorkstateId;
	}

	public void setDefectWorkstateId(BigDecimal defectWorkstateId) {
		this.defectWorkstateId = defectWorkstateId;
	}

	@Column(name = "TARGET_REQUIREMENT_ENTITY_ID", length = 200)
	public String getTargetRequirementEntityId() {
		return this.targetRequirementEntityId;
	}

	public void setTargetRequirementEntityId(String targetRequirementEntityId) {
		this.targetRequirementEntityId = targetRequirementEntityId;
	}

	@Column(name = "TARGET_TESTCASE_ENTITY_ID", length = 200)
	public String getTargetTestcaseEntityId() {
		return this.targetTestcaseEntityId;
	}

	public void setTargetTestcaseEntityId(String targetTestcaseEntityId) {
		this.targetTestcaseEntityId = targetTestcaseEntityId;
	}

	@Column(name = "CUSTOM5", length = 4000)
	public String getCustom5() {
		return this.custom5;
	}

	public void setCustom5(String custom5) {
		this.custom5 = custom5;
	}

	@Column(name = "CUSTOM6", length = 4000)
	public String getCustom6() {
		return this.custom6;
	}

	public void setCustom6(String custom6) {
		this.custom6 = custom6;
	}

	@Column(name = "CUSTOM7", length = 4000)
	public String getCustom7() {
		return this.custom7;
	}

	public void setCustom7(String custom7) {
		this.custom7 = custom7;
	}

	@Column(name = "CUSTOM8", length = 4000)
	public String getCustom8() {
		return this.custom8;
	}

	public void setCustom8(String custom8) {
		this.custom8 = custom8;
	}

	@Column(name = "CUSTOM9", length = 4000)
	public String getCustom9() {
		return this.custom9;
	}

	public void setCustom9(String custom9) {
		this.custom9 = custom9;
	}

	@Column(name = "CUSTOM10", length = 4000)
	public String getCustom10() {
		return this.custom10;
	}

	public void setCustom10(String custom10) {
		this.custom10 = custom10;
	}

	@Column(name = "DOMAIN_PROJECT", length = 1020)
	public String getDomainProject() {
		return this.domainProject;
	}

	public void setDomainProject(String domainProject) {
		this.domainProject = domainProject;
	}

	@Column(name = "DETECTED_RELEASE", length = 4000)
	public String getDetectedRelease() {
		return this.detectedRelease;
	}

	public void setDetectedRelease(String detectedRelease) {
		this.detectedRelease = detectedRelease;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "defect")
	public Set getDefectComponents() {
		return this.defectComponents;
	}

	public void setDefectComponents(Set defectComponents) {
		this.defectComponents = defectComponents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "defect")
	public Set getRequirementDefects() {
		return this.requirementDefects;
	}

	public void setRequirementDefects(Set requirementDefects) {
		this.requirementDefects = requirementDefects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "defect")
	public Set getDefectTargetReleases() {
		return this.defectTargetReleases;
	}

	public void setDefectTargetReleases(Set defectTargetReleases) {
		this.defectTargetReleases = defectTargetReleases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "defect")
	public Set getTestcaseDefects() {
		return this.testcaseDefects;
	}

	public void setTestcaseDefects(Set testcaseDefects) {
		this.testcaseDefects = testcaseDefects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "defect")
	public Set getDefectDetectedReleases() {
		return this.defectDetectedReleases;
	}

	public void setDefectDetectedReleases(Set defectDetectedReleases) {
		this.defectDetectedReleases = defectDetectedReleases;
	}

}
