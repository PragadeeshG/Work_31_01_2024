package com.test1;

public class DomainUserToGroupRelaton {
	private Integer domainUserGrpId;
	private String domainUserId;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DomainUserToGroupRelaton() {

	}

	public DomainUserToGroupRelaton(Integer domainUserGrpId, String domainUserId, boolean isActive, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.domainUserGrpId = domainUserGrpId;
		this.domainUserId = domainUserId;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getDomainUserGrpId() {
		return domainUserGrpId;
	}

	public void setDomainUserGrpId(Integer domainUserGrpId) {
		this.domainUserGrpId = domainUserGrpId;
	}

	public String getDomainUserId() {
		return domainUserId;
	}

	public void setDomainUserId(String domainUserId) {
		this.domainUserId = domainUserId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
