package net.wly.pro.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.wly.pro.common.entity.SysUserEntity;
import net.wly.pro.common.utils.ShiroUtils;

/**
 * Controller公共组件
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月8日 下午2:43:23
 */
public abstract class AbstractController {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
	
}
