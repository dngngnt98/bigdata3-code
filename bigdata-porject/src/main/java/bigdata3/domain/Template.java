package bigdata3.domain;

import java.sql.Date;

public class Template {
	// 여기에 지점 참조해야함
	private int templateNo;
	private int templateName;
	private String templateContent;
	private Date createDate;
	private String deleteCheck;

	@Override
	public String toString() {
		return "Template [templateNo=" + templateNo + ", templateName=" + templateName + ", templateContent="
				+ templateContent + ", createDate=" + createDate + ", deleteCheck=" + deleteCheck + "]";
	}

	public int getTemplateNo() {
		return templateNo;
	}

	public void setTemplateNo(int templateNo) {
		this.templateNo = templateNo;
	}

	public int getTemplateName() {
		return templateName;
	}

	public void setTemplateName(int templateName) {
		this.templateName = templateName;
	}

	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDeleteCheck() {
		return deleteCheck;
	}

	public void setDeleteCheck(String deleteCheck) {
		this.deleteCheck = deleteCheck;
	}

}
