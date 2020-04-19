package com.atguigu.responsibilitychain;
/** 
* @author LiXiang 
* @version 创建时间：Apr 19, 2020
* 类说明 
*/
public class CollegeApprover extends Approver{

	public CollegeApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice() <= 5000 && request.getPrice() <= 10000) {
			System.out.println("请求编号id = " + request.getId() + "被" + this.name + " 处理 ");
		} else {
			approver.processRequest(request);
		}		
	}
	
}
