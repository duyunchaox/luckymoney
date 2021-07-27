package com.imooc.luckymoney;

import java.io.File;

/**
 * @ProjectName: luckymoney
 * @Package: com.imooc.luckymoney
 * @ClassName: FileTest
 * @Description:
 * @Author: 杜云超
 * @CreateDate: 2019/8/1 11:33
 */
public class FileTest {

	public static void main(String[] args) {
		File file = new File("F://a.txt");
		if(!file.exists()){

		}
		System.out.println(file.exists());
	}

}
