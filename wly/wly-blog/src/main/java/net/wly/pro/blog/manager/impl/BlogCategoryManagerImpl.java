package net.wly.pro.blog.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.Query;
import net.wly.pro.blog.dao.BlogCategoryMapper;
import net.wly.pro.blog.entity.BlogCategoryEntity;
import net.wly.pro.blog.manager.BlogCategoryManager;

/**
 * 分类表
 *
 * @author TL
 * @email 275012086@qq.com
 * @url 
 * @date 2017年12月28日 下午4:44:22
 */
@Component("blogCategoryManager")
public class BlogCategoryManagerImpl implements BlogCategoryManager {

	@Autowired
	private BlogCategoryMapper blogCategoryMapper;
	

	@Override
	public List<BlogCategoryEntity> listBlogCategory(Page<BlogCategoryEntity> page, Query search) {
		return blogCategoryMapper.listForPage(page, search);
	}

	@Override
	public int saveBlogCategory(BlogCategoryEntity blogCategory) {
		return blogCategoryMapper.save(blogCategory);
	}

	@Override
	public BlogCategoryEntity getBlogCategoryById(Long id) {
		BlogCategoryEntity blogCategory = blogCategoryMapper.getObjectById(id);
		return blogCategory;
	}

	@Override
	public int updateBlogCategory(BlogCategoryEntity blogCategory) {
		return blogCategoryMapper.update(blogCategory);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = blogCategoryMapper.batchRemove(id);
		return count;
	}
	
}
