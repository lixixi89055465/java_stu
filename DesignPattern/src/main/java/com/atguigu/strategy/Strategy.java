package com.atguigu.strategy;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.velocity.app.event.ReferenceInsertionEventHandler.referenceInsertExecutor;

/**
 * @author LiXiang
 * @version 创建时间：Apr 19, 2020 类说明
 */
public class Strategy {

	public static void main(String[] args) {
		Integer[] data = { 9, 1, 2, 8, 4, 3 };
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				} else {
					return -1;
				}
			}

		};
		Arrays.parallelSort(data, comparator);
		System.out.println(Arrays.toString(data));
		Integer[] data2 = { 19, 11, 12, 18, 14, 13 };
		Arrays.parallelSort(data2, (var1, var2) -> {
			if (var1.compareTo(var2) > 0) {
				return 1;
			} else {
				return -1;
			}
		});
		
		System.out.println(Arrays.toString(data2) );
	}
}
