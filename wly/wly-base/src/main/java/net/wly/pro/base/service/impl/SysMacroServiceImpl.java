package net.wly.pro.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wly.pro.base.entity.SysMacroEntity;
import net.wly.pro.base.manager.SysMacroManager;
import net.wly.pro.base.service.SysMacroService;
import net.wly.pro.common.constant.MsgConstant;
import net.wly.pro.common.constant.SystemConstant.MacroType;
import net.wly.pro.common.constant.SystemConstant.StatusType;
import net.wly.pro.common.entity.R;
import net.wly.pro.common.utils.CommonUtils;

/**
 * 通用字典
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月15日 下午12:52:38
 */
@Service("sysMacroService")
public class SysMacroServiceImpl implements SysMacroService {

	@Autowired
	private SysMacroManager sysMacroManager;
	
	@Override
	public List<SysMacroEntity> listMacro() {
		return sysMacroManager.listMacro();
	}

	@Override
	public List<SysMacroEntity> listNotMacro() {
		List<SysMacroEntity> macros = sysMacroManager.listNotMacro();
		SysMacroEntity macro = new SysMacroEntity();
		macro.setMacroId(0L);
		macro.setTypeId(-1L);
		macro.setName("一级目录");
		macro.setOpen(true);
		macros.add(macro);
		return macros;
	}

	@Override
	public R saveMacro(SysMacroEntity macro) {
		int count = sysMacroManager.saveMacro(validateMacro(macro));
		return CommonUtils.msg(count);
	}

	@Override
	public R getObjectById(Long id) {
		SysMacroEntity macro = sysMacroManager.getObjectById(id);
		return CommonUtils.msg(macro);
	}

	@Override
	public R updateMacro(SysMacroEntity macro) {
		int count = sysMacroManager.updateMacro(validateMacro(macro));
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		boolean children = sysMacroManager.hasChildren(id);
		if(children) {
			return R.error(MsgConstant.MSG_HAS_CHILD);
		}
		int count = sysMacroManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}
	
	/**
	 * 当为参数类型时，状态为显示
	 * @param macro
	 * @return
	 */
	public SysMacroEntity validateMacro(SysMacroEntity macro) {
		if(macro.getType() == MacroType.TYPE.getValue()) {
			macro.setStatus(StatusType.SHOW.getValue());
		}
		return macro;
	}

}
