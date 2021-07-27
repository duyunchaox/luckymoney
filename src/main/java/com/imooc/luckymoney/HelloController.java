package com.imooc.luckymoney;

import com.imooc.luckymoney.contans.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @ProjectName: luckymoney
 * @Package: com.imooc.luckymoney
 * @ClassName: HelloController
 * @Description:
 * @Author: 杜云超
 * @CreateDate: 2019/7/10 21:35
 *
 *
 *
 *
 *
 *
 */
@RestController
public class HelloController {

	@Value("${minMoney}")
	private BigDecimal minMoney;

	@Autowired
	private LimitConfig limitConzfig;

	@GetMapping("/hello")
	public String say(){
		return "minMoney"+limitConfig.getMinMoney();
	}

	@GetMapping("/getId")
	public String getId(@RequestParam(value = "id",required = false,defaultValue = "0") Integer transId){

		return "id:"+transId;
	}

}
