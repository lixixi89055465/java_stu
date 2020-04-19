package com.atguigu.responsibilitychain;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 2000, 1);
		// 创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任 ");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover(" 佟校长");
		// 需要将各个审批级别的下一个设置好，处理人构成环形 ：
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);

//		departmentApprover.processRequest(purchaseRequest);
		collegeApprover.processRequest(purchaseRequest);

	}
}
