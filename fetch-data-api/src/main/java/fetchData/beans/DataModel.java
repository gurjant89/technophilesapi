package fetchData.beans;

import com.opencsv.bean.CsvBindByName;

public class DataModel {
	
	@CsvBindByName(column = "ID")
	private String id;
	
	@CsvBindByName(column = "ID_status")
	private String IdStatus;
	
	@CsvBindByName(column = "active")
	private String active;
	
	@CsvBindByName(column = "count_reassign")
	private int countReassign;
	
	@CsvBindByName(column = "count_opening")
	private int countOpening;
	
	@CsvBindByName(column = "count_updated")
	private int countUpdated;
	
	@CsvBindByName(column = "ID_caller")
	private String idCaller;
	
	@CsvBindByName(column = "opened_by")
	private String openedBy;
	
	@CsvBindByName(column = "opened_time")
	private String openedTime;
	
	@CsvBindByName(column = "Created_by")
	private String createdBy;
	
	@CsvBindByName(column = "created_at")
	private String createdAt;
	
	@CsvBindByName(column = "updated_by")
	private String updatedBy;
	
	@CsvBindByName(column = "updated_at")
	private String updatedAt;
	
	@CsvBindByName(column = "type_contact")
	private String typeContact;
	
	@CsvBindByName(column = "location")
	private String location;
	
	@CsvBindByName(column = "category_ID")
	private String categoryId;
	
	@CsvBindByName(column = "user_symptom")
	private String userSymptom;
	
	@CsvBindByName(column = "Support_group")
	private String supportGroup;
	
	@CsvBindByName(column = "support_incharge")
	private String supportIncharge;
	
	@CsvBindByName(column = "Doc_knowledge")
	private String docKnowledge;
	
	@CsvBindByName(column = "confirmation_check")
	private String confirmationCheck;
	
	@CsvBindByName(column = "impact")
	private String impact;
	
	@CsvBindByName(column = "notify")
	private String notify;
	
	@CsvBindByName(column = "problem_ID")
	private String problemId;
	
	@CsvBindByName(column = "change_request")
	private String changeRequest;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdStatus() {
		return IdStatus;
	}

	public void setIdStatus(String idStatus) {
		IdStatus = idStatus;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getCountReassign() {
		return countReassign;
	}

	public void setCountReassign(int countReassign) {
		this.countReassign = countReassign;
	}

	public int getCountOpening() {
		return countOpening;
	}

	public void setCountOpening(int countOpening) {
		this.countOpening = countOpening;
	}

	public int getCountUpdated() {
		return countUpdated;
	}

	public void setCountUpdated(int countUpdated) {
		this.countUpdated = countUpdated;
	}

	public String getIdCaller() {
		return idCaller;
	}

	public void setIdCaller(String idCaller) {
		this.idCaller = idCaller;
	}

	public String getOpenedBy() {
		return openedBy;
	}

	public void setOpenedBy(String openedBy) {
		this.openedBy = openedBy;
	}

	public String getOpenedTime() {
		return openedTime;
	}

	public void setOpenedTime(String openedTime) {
		this.openedTime = openedTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getTypeContact() {
		return typeContact;
	}

	public void setTypeContact(String typeContact) {
		this.typeContact = typeContact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getUserSymptom() {
		return userSymptom;
	}

	public void setUserSymptom(String userSymptom) {
		this.userSymptom = userSymptom;
	}

	public String getSupportGroup() {
		return supportGroup;
	}

	public void setSupportGroup(String supportGroup) {
		this.supportGroup = supportGroup;
	}

	public String getSupportIncharge() {
		return supportIncharge;
	}

	public void setSupportIncharge(String supportIncharge) {
		this.supportIncharge = supportIncharge;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getDocKnowledge() {
		return docKnowledge;
	}

	public void setDocKnowledge(String docKnowledge) {
		this.docKnowledge = docKnowledge;
	}

	public String getConfirmationCheck() {
		return confirmationCheck;
	}

	public void setConfirmationCheck(String confirmationCheck) {
		this.confirmationCheck = confirmationCheck;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public String getProblemId() {
		return problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}

	public String getChangeRequest() {
		return changeRequest;
	}

	public void setChangeRequest(String changeRequest) {
		this.changeRequest = changeRequest;
	}
	
}
