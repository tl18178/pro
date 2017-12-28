package net.wly.pro.blog.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.Query;
import net.wly.pro.common.entity.R;
import net.wly.pro.common.utils.CommonUtils;
import net.wly.pro.blog.entity.BlogCategoryEntity;
import net.wly.pro.blog.manager.BlogCategoryManager;
import net.wly.pro.blog.service.BlogCategoryService;

/**
 * 分类表
 *
 * @author TL
 * @email 275012086@qq.com
 * @url 
 * @date 2017年12月28日 下午4:44:22
 */
@Service("blogCategoryService")
public class BlogCategoryServiceImpl implements BlogCategoryService {

	@Autowired
	private BlogCategoryManager blogCategoryManager;

	@Override
	public Page<BlogCategoryEntity> listBlogCategory(Map<String, Object> params) {
		Query query = new Query(params);
		Page<BlogCategoryEntity> page = new Page<>(query);
		blogCategoryManager.listBlogCategory(page, query);
		return page;
	}

	@Override
	public R saveBlogCategory(BlogCategoryEntity role) {
		int count = blogCategoryManager.saveBlogCategory(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getBlogCategoryById(Long id) {
		BlogCategoryEntity blogCategory = blogCategoryManager.getBlogCategoryById(id);
		return CommonUtils.msg(blogCategory);
	}

	@Override
	public R updateBlogCategory(BlogCategoryEntity blogCategory) {
		int count = blogCategoryManager.updateBlogCategory(blogCategory);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = blogCategoryManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
