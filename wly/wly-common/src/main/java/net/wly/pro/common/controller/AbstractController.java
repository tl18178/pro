package net.wly.pro.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.wly.pro.common.entity.SysUserEntity;
import net.wly.pro.common.utils.ShiroUtils;

/**
 * Controller公共组件
 *
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
