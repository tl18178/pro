package net.wly.pro.common.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.wly.pro.common.annotation.SysLog;
import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.R;
import net.wly.pro.common.entity.SysLogEntity;
import net.wly.pro.common.service.SysLogService;

/**
 * 系统日志
 *
 */
@RestController
@RequestMapping("/sys/log")
public class SysLogController extends AbstractController {

	@Autowired
	private SysLogService sysLogService;
	
	/**
	 * 日志列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<SysLogEntity> listLog(@RequestBody Map<String, Object> params) {
		return sysLogService.listLog(params);
	}
	
	/**
	 * 删除日志
	 * @param id
	 * @return
	 */
	@SysLog("删除日志")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return sysLogService.batchRemove(id);
	}
	
	/**
	 * 清空日志
	 * @return
	 */
	@SysLog("清空日志")
	@RequestMapping("/clear")
	public R batchRemoveAll() {
		return sysLogService.batchRemoveAll();
	}
	
}
