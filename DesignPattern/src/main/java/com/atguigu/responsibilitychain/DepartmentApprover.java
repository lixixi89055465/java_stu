package com.atguigu.responsibilitychain;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 */
public class DepartmentApprover extends Approver {

	public DepartmentApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice() <= 5000) {
			System.out.println("请求编号id = " + request.getId() + "被" + this.name + " 处理 ");
		} else {
			approver.processRequest(request);
		}
	}

}
