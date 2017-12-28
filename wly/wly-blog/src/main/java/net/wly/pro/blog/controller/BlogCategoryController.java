package net.wly.pro.blog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.wly.pro.common.annotation.SysLog;
import net.wly.pro.common.controller.AbstractController;
import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.R;
import net.wly.pro.blog.entity.BlogCategoryEntity;
import net.wly.pro.blog.service.BlogCategoryService;

/**
 * 分类表
 *
 * @author TL
 * @email 275012086@qq.com
 * @url 
 * @date 2017年12月28日 下午4:44:22
 */
@RestController
@RequestMapping("/blog/category")
public class BlogCategoryController extends AbstractController {
	
	@Autowired
	private BlogCategoryService blogCategoryService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<BlogCategoryEntity> list(@RequestBody Map<String, Object> params) {
		return blogCategoryService.listBlogCategory(params);
	}
		
	/**
	 * 新增
	 * @param blogCategory
	 * @return
	 */
	@SysLog("新增分类表")
	@RequestMapping("/save")
	public R save(@RequestBody BlogCategoryEntity blogCategory) {
		return blogCategoryService.saveBlogCategory(blogCategory);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return blogCategoryService.getBlogCategoryById(id);
	}
	
	/**
	 * 修改
	 * @param blogCategory
	 * @return
	 */
	@SysLog("修改分类表")
	@RequestMapping("/update")
	public R update(@RequestBody BlogCategoryEntity blogCategory) {
		return blogCategoryService.updateBlogCategory(blogCategory);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除分类表")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return blogCategoryService.batchRemove(id);
	}
	
}
