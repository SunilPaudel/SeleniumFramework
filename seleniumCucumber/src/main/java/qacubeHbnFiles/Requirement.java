package qacubeHbnFiles;
// Generated Jul 25, 2019 2:13:06 PM by Hibernate Tools 5.2.3.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Requirement generated by hbm2java
 */
@Entity
@Table(name = "REQUIREMENT", schema = "QACUBE_IMPORT_STAGE")
public class Requirement implements java.io.Serializable {

	private BigDecimal id;
	private String name;
	private Serializable lastmodified;
	private BigDecimal parentId;
	private BigDecimal requirementPriorityId;
	private String productName;
	private String sourceOrder;
	private BigDecimal weight;
	private BigDecimal requirementStatusId;
	private String workstate;
	private String url;
	private String custom1;
	private String custom2;
	private String custom3;
	private String custom4;
	private String externalEntityId;
	private String description;
	private BigDecimal requirementWorkstateId;
	private String targetEntityId;
	private String custom5;
	private String custom6;
	private String custom7;
	private String custom8;
	private String custom9;
	private String custom10;
	private BigDecimal requirementTypeId;
	private BigDecimal requirementReviewStatusId;
	private String requirementKey;
	private BigDecimal requirementWorkflowStatusId;
	private BigDecimal storyPoints;
	private BigDecimal originalEstimate;
	private BigDecimal timeSpent;
	private Set testcaseRequirements = new HashSet(0);
	private Set requirementReleases = new HashSet(0);
	private Set requirementDefects = new HashSet(0);

	public Requirement() {
	}

	public Requirement(BigDecimal id, String name) {
		this.id = id;
		this.name = name;
	}

	public Requirement(BigDecimal id, String name, Serializable lastmodified, BigDecimal parentId,
			BigDecimal requirementPriorityId, String productName, String sourceOrder, BigDecimal weight,
			BigDecimal requirementStatusId, String workstate, String url, String custom1, String custom2,
			String custom3, String custom4, String externalEntityId, String description,
			BigDecimal requirementWorkstateId, String targetEntityId, String custom5, String custom6, String custom7,
			String custom8, String custom9, String custom10, BigDecimal requirementTypeId,
			BigDecimal requirementReviewStatusId, String requirementKey, BigDecimal requirementWorkflowStatusId,
			BigDecimal storyPoints, BigDecimal originalEstimate, BigDecimal timeSpent, Set testcaseRequirements,
			Set requirementReleases, Set requirementDefects) {
		this.id = id;
		this.name = name;
		this.lastmodified = lastmodified;
		this.parentId = parentId;
		this.requirementPriorityId = requirementPriorityId;
		this.productName = productName;
		this.sourceOrder = sourceOrder;
		this.weight = weight;
		this.requirementStatusId = requirementStatusId;
		this.workstate = workstate;
		this.url = url;
		this.custom1 = custom1;
		this.custom2 = custom2;
		this.custom3 = custom3;
		this.custom4 = custom4;
		this.externalEntityId = externalEntityId;
		this.description = description;
		this.requirementWorkstateId = requirementWorkstateId;
		this.targetEntityId = targetEntityId;
		this.custom5 = custom5;
		this.custom6 = custom6;
		this.custom7 = custom7;
		this.custom8 = custom8;
		this.custom9 = custom9;
		this.custom10 = custom10;
		this.requirementTypeId = requirementTypeId;
		this.requirementReviewStatusId = requirementReviewStatusId;
		this.requirementKey = requirementKey;
		this.requirementWorkflowStatusId = requirementWorkflowStatusId;
		this.storyPoints = storyPoints;
		this.originalEstimate = originalEstimate;
		this.timeSpent = timeSpent;
		this.testcaseRequirements = testcaseRequirements;
		this.requirementReleases = requirementReleases;
		this.requirementDefects = requirementDefects;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 38, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 1020)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LASTMODIFIED")
	public Serializable getLastmodified() {
		return this.lastmodified;
	}

	public void setLastmodified(Serializable lastmodified) {
		this.lastmodified = lastmodified;
	}

	@Column(name = "PARENT_ID", precision = 38, scale = 0)
	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	@Column(name = "REQUIREMENT_PRIORITY_ID", precision = 38, scale = 0)
	public BigDecimal getRequirementPriorityId() {
		return this.requirementPriorityId;
	}

	public void setRequirementPriorityId(BigDecimal requirementPriorityId) {
		this.requirementPriorityId = requirementPriorityId;
	}

	@Column(name = "PRODUCT_NAME", length = 1020)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "SOURCE_ORDER", length = 1020)
	public String getSourceOrder() {
		return this.sourceOrder;
	}

	public void setSourceOrder(String sourceOrder) {
		this.sourceOrder = sourceOrder;
	}

	@Column(name = "WEIGHT", precision = 38, scale = 0)
	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "REQUIREMENT_STATUS_ID", precision = 38, scale = 0)
	public BigDecimal getRequirementStatusId() {
		return this.requirementStatusId;
	}

	public void setRequirementStatusId(BigDecimal requirementStatusId) {
		this.requirementStatusId = requirementStatusId;
	}

	@Column(name = "WORKSTATE", length = 180)
	public String getWorkstate() {
		return this.workstate;
	}

	public void setWorkstate(String workstate) {
		this.workstate = workstate;
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

	@Column(name = "EXTERNAL_ENTITY_ID", length = 1020)
	public String getExternalEntityId() {
		return this.externalEntityId;
	}

	public void setExternalEntityId(String externalEntityId) {
		this.externalEntityId = externalEntityId;
	}

	@Column(name = "DESCRIPTION", length = 1020)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "REQUIREMENT_WORKSTATE_ID", precision = 38, scale = 0)
	public BigDecimal getRequirementWorkstateId() {
		return this.requirementWorkstateId;
	}

	public void setRequirementWorkstateId(BigDecimal requirementWorkstateId) {
		this.requirementWorkstateId = requirementWorkstateId;
	}

	@Column(name = "TARGET_ENTITY_ID", length = 200)
	public String getTargetEntityId() {
		return this.targetEntityId;
	}

	public void setTargetEntityId(String targetEntityId) {
		this.targetEntityId = targetEntityId;
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

	@Column(name = "REQUIREMENT_TYPE_ID", precision = 38, scale = 0)
	public BigDecimal getRequirementTypeId() {
		return this.requirementTypeId;
	}

	public void setRequirementTypeId(BigDecimal requirementTypeId) {
		this.requirementTypeId = requirementTypeId;
	}

	@Column(name = "REQUIREMENT_REVIEW_STATUS_ID", precision = 38, scale = 0)
	public BigDecimal getRequirementReviewStatusId() {
		return this.requirementReviewStatusId;
	}

	public void setRequirementReviewStatusId(BigDecimal requirementReviewStatusId) {
		this.requirementReviewStatusId = requirementReviewStatusId;
	}

	@Column(name = "REQUIREMENT_KEY", length = 1020)
	public String getRequirementKey() {
		return this.requirementKey;
	}

	public void setRequirementKey(String requirementKey) {
		this.requirementKey = requirementKey;
	}

	@Column(name = "REQUIREMENT_WORKFLOW_STATUS_ID", precision = 38, scale = 0)
	public BigDecimal getRequirementWorkflowStatusId() {
		return this.requirementWorkflowStatusId;
	}

	public void setRequirementWorkflowStatusId(BigDecimal requirementWorkflowStatusId) {
		this.requirementWorkflowStatusId = requirementWorkflowStatusId;
	}

	@Column(name = "STORY_POINTS", precision = 10)
	public BigDecimal getStoryPoints() {
		return this.storyPoints;
	}

	public void setStoryPoints(BigDecimal storyPoints) {
		this.storyPoints = storyPoints;
	}

	@Column(name = "ORIGINAL_ESTIMATE", precision = 38, scale = 0)
	public BigDecimal getOriginalEstimate() {
		return this.originalEstimate;
	}

	public void setOriginalEstimate(BigDecimal originalEstimate) {
		this.originalEstimate = originalEstimate;
	}

	@Column(name = "TIME_SPENT", precision = 38, scale = 0)
	public BigDecimal getTimeSpent() {
		return this.timeSpent;
	}

	public void setTimeSpent(BigDecimal timeSpent) {
		this.timeSpent = timeSpent;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "requirement")
	public Set getTestcaseRequirements() {
		return this.testcaseRequirements;
	}

	public void setTestcaseRequirements(Set testcaseRequirements) {
		this.testcaseRequirements = testcaseRequirements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "requirement")
	public Set getRequirementReleases() {
		return this.requirementReleases;
	}

	public void setRequirementReleases(Set requirementReleases) {
		this.requirementReleases = requirementReleases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "requirement")
	public Set getRequirementDefects() {
		return this.requirementDefects;
	}

	public void setRequirementDefects(Set requirementDefects) {
		this.requirementDefects = requirementDefects;
	}

}
