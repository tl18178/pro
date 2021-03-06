package net.wly.pro.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wly.pro.common.constant.MsgConstant;
import net.wly.pro.common.entity.R;
import net.wly.pro.common.utils.CommonUtils;
import net.wly.pro.shiro.entity.SysOrgEntity;
import net.wly.pro.shiro.manager.SysOrgManager;
import net.wly.pro.shiro.service.SysOrgService;

/**
 * 组织机构
 *
 */
@Service("sysOrgService")
public class SysOrgServiceImpl implements SysOrgService {

	@Autowired
	private SysOrgManager sysOrgManager;
	
	@Override
	public List<SysOrgEntity> listOrg() {
		return sysOrgManager.listOrg();
	}

	@Override
	public List<SysOrgEntity> listOrgTree() {
		List<SysOrgEntity> orgList = sysOrgManager.listOrg();
		SysOrgEntity org = new SysOrgEntity();
		org.setOrgId(0L);
		org.setName("一级机构");
		org.setParentId(-1L);
		org.setOpen(true);
		orgList.add(org);
		return orgList;
	}

	@Override
	public R saveOrg(SysOrgEntity org) {
		int count = sysOrgManager.saveOrg(org);
		return CommonUtils.msg(count);
	}

	@Override
	public R getOrg(Long orgId) {
		SysOrgEntity org = sysOrgManager.getOrg(orgId);
		return CommonUtils.msg(org);
	}

	@Override
	public R updateOrg(SysOrgEntity org) {
		int count = sysOrgManager.updateOrg(org);
		return CommonUtils.msg(count);
	}

	@Override
	public R bactchRemoveOrg(Long[] id) {
		boolean children = sysOrgManager.hasChildren(id);
		if(children) {
			return R.error(MsgConstant.MSG_HAS_CHILD);
		}
		int count = sysOrgManager.bactchRemoveOrg(id);
		return CommonUtils.msg(id, count);
	}

}
