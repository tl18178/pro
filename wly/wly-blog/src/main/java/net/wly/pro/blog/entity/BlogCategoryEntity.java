package net.wly.pro.blog.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 分类表
 *
 * @author TL
 * @email 275012086@qq.com
 * @url 
 * @date 2017年12月28日 下午4:44:22
 */
public class BlogCategoryEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Long id;
	
	/**
	 * 分类名称  唯一
	 */
	private String categoryname;
	
	/**
	 * 图标样式
	 */
	private String iconclass;
	
	/**
	 * 别名  唯一  比如新闻 就用News
	 */
	private String aliasname;
	
	/**
	 * 排序 （0-10）
	 */
	private Integer sort;
	

	public BlogCategoryEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	public String getCategoryname() {
		return categoryname;
	}
	
	public void setIconclass(String iconclass) {
		this.iconclass = iconclass;
	}
	
	public String getIconclass() {
		return iconclass;
	}
	
	public void setAliasname(String aliasname) {
		this.aliasname = aliasname;
	}
	
	public String getAliasname() {
		return aliasname;
	}
	
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	public Integer getSort() {
		return sort;
	}
	
}
