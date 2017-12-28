package net.wly.pro.blog.manager;

import java.util.List;

import net.wly.pro.common.entity.Page;
import net.wly.pro.common.entity.Query;
import net.wly.pro.blog.entity.BlogCategoryEntity;

/**
 * 分类表
 *
 * @author TL
 * @email 275012086@qq.com
 * @url 
 * @date 2017年12月28日 下午4:44:22
 */
public interface BlogCategoryManager {

	List<BlogCategoryEntity> listBlogCategory(Page<BlogCategoryEntity> page, Query search);
	
	int saveBlogCategory(BlogCategoryEntity blogCategory);
	
	BlogCategoryEntity getBlogCategoryById(Long id);
	
	int updateBlogCategory(BlogCategoryEntity blogCategory);
	
	int batchRemove(Long[] id);
	
}
