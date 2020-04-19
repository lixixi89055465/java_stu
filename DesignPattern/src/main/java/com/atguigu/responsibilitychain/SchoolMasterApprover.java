package com.atguigu.responsibilitychain;
/** 
* @author LiXiang 
* @version 创建时间：Apr 19, 2020
* 类说明 
*/
public class SchoolMasterApprover extends Approver{

	public SchoolMasterApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getPrice()>30000) {
			System.out.println("请求编号 ID = " + request.getId() + "被" + this.name + " 处理 ");
		}
	}

}
