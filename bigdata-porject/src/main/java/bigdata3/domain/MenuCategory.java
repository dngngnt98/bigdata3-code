package bigdata3.domain;

import java.sql.Date;

public class MenuCategory {
	private int mCategoryNo;
	private String category;
	private Date createDate;
	private String deleteCheck;
	private String categoryContent;

	@Override
	public String toString() {
		return "MenuCategory [mCategoryNo=" + mCategoryNo + ", category=" + category + ", createDate=" + createDate
				+ ", deleteCheck=" + deleteCheck + ", categoryContent=" + categoryContent + "]";
	}

	public int getmCategoryNo() {
		return mCategoryNo;
	}

	public void setmCategoryNo(int mCategoryNo) {
		this.mCategoryNo = mCategoryNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getCategoryContent() {
		return categoryContent;
	}

	public void setCategoryContent(String categoryContent) {
		this.categoryContent = categoryContent;
	}

}
