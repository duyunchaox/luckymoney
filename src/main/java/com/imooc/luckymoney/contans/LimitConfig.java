package com.imooc.luckymoney.contans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @ProjectName: luckymoney
 * @Package: com.imooc.luckymoney.contans
 * assName: LimitConfig
 * @Description:
 * @Author: 杜云超
 * @CreateDate: 2019/7/13 13:27
 */
@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {

	private BigDecimal minMoney;

	private BigDecimal maxMoney;

	private String  desc;


	public BigDecimal getMinMoney() {
		return minMoney;
	}

	public void setMinMoney(BigDecimal minMoney) {
		this.minMoney = minMoney;
	}

	public BigDecimal getMaxMoney() {
		return maxMoney;
	}

	public void setMaxMoney(BigDecimal maxMoney) {
		this.maxMoney = maxMoney;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
