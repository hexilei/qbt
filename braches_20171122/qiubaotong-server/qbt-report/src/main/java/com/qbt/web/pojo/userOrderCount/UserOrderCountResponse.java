package com.qbt.web.pojo.userOrderCount;

public class UserOrderCountResponse{
	
	private int userId;
	
	private String openid;
	
	private int orderCount;
	
	private String nickname;
	
	private String name;
	
	private String mobile;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
}