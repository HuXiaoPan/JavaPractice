package gjp.domain;

public class Zhangwu {
	public Zhangwu() {
	};

	/**
	 * @param zwid
	 * @param flname
	 * @param money
	 * @param account
	 * @param createDate
	 * @param description
	 */
	public Zhangwu(int zwid, String flname, double money, String account, String createDate, String description) {
		this.zwid = zwid;
		this.flname = flname;
		this.money = money;
		this.account = account;
		this.createDate = createDate;
		this.description = description;
	}

	public Zhangwu(int zwid) {
		// TODO Auto-generated constructor stub
		this.zwid = zwid;
	}

	/**
	 * @return the zwid
	 */
	public int getZwid() {
		return zwid;
	}

	/**
	 * @param zwid the zwid to set
	 */
	public void setZwid(int zwid) {
		this.zwid = zwid;
	}

	/**
	 * @return the flname
	 */
	public String getFlname() {
		return flname;
	}

	/**
	 * @param flname the flname to set
	 */
	public void setFlname(String flname) {
		this.flname = flname;
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the createDate
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	private int zwid;
	private String flname;
	private double money;
	private String account;
	private String createDate;
	private String description;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Zhangwu [zwid=" + zwid + ", flname=" + flname + ", money=" + money + ", account=" + account
				+ ", createDate=" + createDate + ", description=" + description + "]";
	}

}
