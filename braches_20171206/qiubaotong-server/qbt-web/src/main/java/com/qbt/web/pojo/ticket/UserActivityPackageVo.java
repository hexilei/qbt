package com.qbt.web.pojo.ticket;

import java.util.Date;
import java.util.List;

public class UserActivityPackageVo {
	int id;
	int userId;
	int orderId;
	int orderDetailId;
	Integer status;//(0 - inactive; 1 - active)
	int operatorId;
	String operatorName;
	List<UserPackageTicketVo> ticketVos;
	Date expirationTime;
	String activityName;
	float price;
	int effectiveDay;
	int packageType;
	Date activateTime;
	
	public List<UserPackageTicketVo> getTicketVos() {
		return ticketVos;
	}
	public void setTicketVos(List<UserPackageTicketVo> ticketVos) {
		this.ticketVos = ticketVos;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getEffectiveDay() {
		return effectiveDay;
	}
	public void setEffectiveDay(int effectiveDay) {
		this.effectiveDay = effectiveDay;
	}
	public int getPackageType() {
		return packageType;
	}
	public void setPackageType(int packageType) {
		this.packageType = packageType;
	}
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	public Date getActivateTime() {
		return activateTime;
	}
	public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}
	
}
