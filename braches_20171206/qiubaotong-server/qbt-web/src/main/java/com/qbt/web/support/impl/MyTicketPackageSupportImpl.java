package com.qbt.web.support.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qbt.persistent.entity.ActivityTicketPackage;
import com.qbt.persistent.entity.UserActivityOrderDetail;
import com.qbt.persistent.entity.UserActivityPackage;
import com.qbt.persistent.entity.UserPackageTicket;
import com.qbt.service.TicketPackageActivityService;
import com.qbt.service.UserActivityOrderDetailService;
import com.qbt.service.UserActivityPackageService;
import com.qbt.web.util.ZxingUtil;
import com.qbt.web.pojo.ticket.UserActivityPackageVo;
import com.qbt.web.pojo.ticket.UserPackageTicketVo;
import com.qbt.web.support.MyTicketPackageSupport;

/**
 *  MyTicketPackage支持
  * @ClassName: MyTicketPackageSupportImpl
  * @Description: TODO
  * @author andy.li
  */
@Service

public class MyTicketPackageSupportImpl implements MyTicketPackageSupport {
	
	@Resource
	private UserActivityOrderDetailService userActivityOrderDetailService;
	
	@Resource
	private UserActivityPackageService userActivityPackageService;
	
	@Resource
	private TicketPackageActivityService ticketPackageActivityService;
	

	@Override
	public List<UserActivityPackageVo> findlistNotActive(int userId) {
		
		List<UserActivityPackage> lists=userActivityOrderDetailService.findlistNotActive(userId);
		List<UserActivityPackageVo> result=new ArrayList<UserActivityPackageVo>();
		UserActivityPackageVo userActivityPackageVo=null;
		
		if(lists!=null){
		for(UserActivityPackage u:lists){
			userActivityPackageVo = new UserActivityPackageVo();
			userActivityPackageVo.setId(u.getId());
			userActivityPackageVo.setUserId(u.getUserId());
			userActivityPackageVo.setOrderId(u.getOrderId());
			userActivityPackageVo.setOrderDetailId(u.getOrderDetailId());
			userActivityPackageVo.setStatus(u.getStatus());
			userActivityPackageVo.setOperatorId(u.getOperatorId());
			userActivityPackageVo.setOperatorName(u.getOperatorName());
			userActivityPackageVo.setExpirationTime(u.getExpirationTime());
			userActivityPackageVo.setActivityName(u.getActivityName());
			userActivityPackageVo.setPrice(u.getPrice());
			userActivityPackageVo.setEffectiveDay(u.getEffectiveDay());
			result.add(userActivityPackageVo);
		   }
		}
	
		return result;
	}

	@Override
	public List<UserActivityPackageVo> findlistUsed(int userId) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<UserActivityPackage> lists=userActivityOrderDetailService.findlistUsed(userId,df.format(new Date()).toString());
		List<UserActivityPackageVo> result=new ArrayList<UserActivityPackageVo>();
		UserActivityPackageVo userActivityPackageVo=null;
		
		if(lists!=null){
		for(UserActivityPackage u:lists){
			userActivityPackageVo = new UserActivityPackageVo();
			userActivityPackageVo.setId(u.getId());
			userActivityPackageVo.setUserId(u.getUserId());
			userActivityPackageVo.setOrderId(u.getOrderId());
			userActivityPackageVo.setOrderDetailId(u.getOrderDetailId());
			userActivityPackageVo.setStatus(u.getStatus());
			userActivityPackageVo.setOperatorId(u.getOperatorId());
			userActivityPackageVo.setOperatorName(u.getOperatorName());
			userActivityPackageVo.setExpirationTime(u.getExpirationTime());
			userActivityPackageVo.setActivityName(u.getActivityName());
			userActivityPackageVo.setPrice(u.getPrice());
			userActivityPackageVo.setEffectiveDay(u.getEffectiveDay());
			result.add(userActivityPackageVo);
		   }
		}
	
		return result;
	}

	@Override
	public List<UserPackageTicketVo> findlistAvailableTicket(int userId) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<UserPackageTicket> lists=ticketPackageActivityService.findAvailableTicketByUserId(userId, df.format(new Date()).toString());
		List<UserPackageTicketVo> result=new ArrayList<UserPackageTicketVo>();
		UserPackageTicketVo userPackageTicketVo=null;
		
		if(lists!=null){
			for(UserPackageTicket u:lists){
				userPackageTicketVo=new UserPackageTicketVo();
				userPackageTicketVo.setId(u.getId());
				userPackageTicketVo.setPackageId(u.getPackageId());
				userPackageTicketVo.setOrderDetailId(u.getOrderDetailId());
				userPackageTicketVo.setTicketPrice(u.getTicketPrice());
				userPackageTicketVo.setTicketName(u.getTicketName());
				userPackageTicketVo.setQuantity(u.getQuantity());
				userPackageTicketVo.setUsedQuantity(u.getUsedQuantity());
				userPackageTicketVo.setUseLimit(u.getUseLimit());
				userPackageTicketVo.setUseStatus(u.getUseStatus());
				userPackageTicketVo.setUserId(u.getUserId());
				userPackageTicketVo.setExpirationTime(u.getExpirationTime());
				result.add(userPackageTicketVo);
			}
		}
		return result;
	}

	@Override
	public List<UserPackageTicketVo> findlistDisableTicket(int userId) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<UserPackageTicket> lists=ticketPackageActivityService.findDisableTicketByUserId(userId, df.format(new Date()).toString());
		List<UserPackageTicketVo> result=new ArrayList<UserPackageTicketVo>();
		UserPackageTicketVo userPackageTicketVo=null;
		
		if(lists!=null){
			for(UserPackageTicket u:lists){
				userPackageTicketVo=new UserPackageTicketVo();
				userPackageTicketVo.setId(u.getId());
				userPackageTicketVo.setPackageId(u.getPackageId());
				userPackageTicketVo.setOrderDetailId(u.getOrderDetailId());
				userPackageTicketVo.setTicketPrice(u.getTicketPrice());
				userPackageTicketVo.setTicketName(u.getTicketName());
				userPackageTicketVo.setQuantity(u.getQuantity());
				userPackageTicketVo.setUsedQuantity(u.getUsedQuantity());
				userPackageTicketVo.setUseLimit(u.getUseLimit());
				userPackageTicketVo.setUseStatus(u.getUseStatus());
				userPackageTicketVo.setUserId(u.getUserId());
				userPackageTicketVo.setExpirationTime(u.getExpirationTime());
				result.add(userPackageTicketVo);
			}
		}
		return result;
	}
	
	@Override
	public String activate(int packageId) {
		String result="";
		Object obj=userActivityPackageService.findOrderDetailIdByPackageId(packageId);
		if(obj!=null){
			int orderDetailId=(Integer) obj;
			//判断券包是否已经激活
			UserActivityOrderDetail userActivityOrderDetail=userActivityOrderDetailService.findById(orderDetailId);
			if(userActivityOrderDetail!=null){
				if(userActivityOrderDetail.getActiveStatus()==1){
					result="亲，你已经激活过了，无需重复激活!";
				}else{
					UserActivityOrderDetail ticket =new UserActivityOrderDetail();
					ticket.setId(orderDetailId);
					ticket.setActiveStatus(1);
					userActivityOrderDetailService.update(ticket);
					UserActivityPackage ticketPackage = new UserActivityPackage();
					ticketPackage.setId(packageId);
					ticketPackage.setStatus(1);
					userActivityPackageService.update(ticketPackage);
					result="激活成功!";
				}
			}
		}
		return result;
	}

	@Override
	public String cancel(int packageId) {
		String result="";
		Object obj=userActivityPackageService.findOrderDetailIdByPackageId(packageId);
		if(obj!=null){
		int orderDetailId=(Integer) obj;
		UserActivityOrderDetail userActivityOrderDetail=userActivityOrderDetailService.findById(orderDetailId);
		if(userActivityOrderDetail!=null){
			//符合券包可撤销赠送的条件
			if(userActivityOrderDetail.getPackageType()==1&&userActivityOrderDetail.getActiveStatus()==0){
				UserActivityOrderDetail ticket =new UserActivityOrderDetail();
				ticket.setId(orderDetailId);
				ticket.setPackageType(0);
				userActivityOrderDetailService.update(ticket);
				result="撤销赠送成功!";
			}else{
				result="当前券包状态不可撤销赠送!";
			}
		}
		}
		return result;
	}

	
	@Override
	public String recieve(int userId,int packageId) {
		
		String result="";
		//1.根据packageId获取赠送方的order details info
		Object obj=userActivityPackageService.findOrderDetailIdByPackageId(packageId);
		if(obj!=null){
			int orderDetailId=(Integer) obj;
			UserActivityOrderDetail userActivityOrderDetail=userActivityOrderDetailService.findById(orderDetailId);
			if(userActivityOrderDetail!=null){
				if(userActivityOrderDetail.getPackageType()==2){
					//券包已经被领取过了,不能重复领取
					result="亲,你来晚了一步喔,券包已经被领取。";
				}else{
					int orderId=userActivityOrderDetail.getOrderId();
					//2.修改user_activity_order_detail的package_type=2
					UserActivityOrderDetail ticket =new UserActivityOrderDetail();
					ticket.setId(orderDetailId);
					ticket.setPackageType(2);
					userActivityOrderDetailService.update(ticket);
					//3.修改赠送方package的状态为inactive
					UserActivityPackage recordSend=new UserActivityPackage();
					recordSend.setId(packageId);
					recordSend.setStatus(0);
					userActivityPackageService.update(recordSend);
					//4.copy赠送方的相关属性,给接收方创建一个新的package
					UserActivityPackage recordRevieve=new UserActivityPackage();
					recordRevieve.setOrderId(orderId);
					recordRevieve.setOrderDetailId(orderDetailId);
					recordRevieve.setUserId(userId);
					recordRevieve.setStatus(0);
					recordRevieve.setOperatorId(userId);
					userActivityPackageService.insert(recordRevieve);
					result="领取成功!";
				}
			}
			
		}
		
		return result;
	}
	
	@Override
	public byte[] qrcode(int packageId,String url,String webpath) {
		
		String qrCodePath=webpath+packageId+"_qrCode"+".png";
		byte[] qrCode_data=null;
		Object obj=userActivityPackageService.findOrderDetailIdByPackageId(packageId);
		if(obj!=null){
			int orderDetailId=(Integer) obj;
			//判断该package是否已激活和已赠送
			UserActivityOrderDetail userActivityOrderDetail=userActivityOrderDetailService.findById(orderDetailId);
			if(userActivityOrderDetail!=null){
				if(userActivityOrderDetail.getPackageType()!=1&&userActivityOrderDetail.getPackageType()!=2&&userActivityOrderDetail.getActiveStatus()==0){
					//根据url产生一个二维码图片
					try{
						ZxingUtil.createQRCode(url, new File(qrCodePath));
						qrCode_data=ZxingUtil.imageTobyte(qrCodePath);
					}catch(Exception e){
						e.printStackTrace();
					}
					//更改状态为赠送中
					UserActivityOrderDetail ticket =new UserActivityOrderDetail();
					ticket.setId(orderDetailId);
					ticket.setQrCode(ZxingUtil.GetQrCode());
					ticket.setPackageType(1);
					userActivityOrderDetailService.update(ticket);
				}
			
			}
		}
		return qrCode_data;
	}
	

	@Override
	public String useTicket(int ticketId) {
		String result="";
		//通过ticketId获取Ticket,判断该券是否已经全部使用完毕
		UserPackageTicket ticket=ticketPackageActivityService.findTicketByTicketId(ticketId);
		if(ticket==null){
			result="该劵不存在!";
		}else{
			if(ticket.getUseStatus()==0){
				ticketPackageActivityService.updateTicketByUsed(ticketId);
				result="使用成功!";
				int used_quantity=ticket.getUsedQuantity()+1;
				if(ticket.getQuantity()==used_quantity){
					//券已经使用完毕,更改券的状态为已使用
					ticketPackageActivityService.updateTicketAsUsed(ticketId);
					result="亲,您的券已经全部使用完毕了喔。";
				  }
				}else if(ticket.getUseStatus()==1){
					result="亲,您的券已经使用过了。";
				}
		}
		return result;
	}
	

	@Override
	public ActivityTicketPackage findPackageById(int packageId) {
		return ticketPackageActivityService.findByPackageId(packageId);
	}

}