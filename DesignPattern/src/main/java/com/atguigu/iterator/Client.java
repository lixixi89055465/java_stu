package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiXiang
 * @version 创建时间：Apr 11, 2020 类说明
 */
public class Client {
	public static void main(String[] args) {
		List<Colleage> colleageList = new ArrayList<Colleage>();
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		colleageList.add(computerCollege);
		colleageList.add(infoCollege);

		OutPutImpl outPutImpl = new OutPutImpl(colleageList);
		outPutImpl.printColleage();

	}
}
