package com.bigxigua.commons.mybatispage;

import java.util.List;

/**
 *  分页基本实现
 *  需要添加其他属性。可以继承进行扩展
 * @author huchun
 * @param <T>
 */
public class Page<T> implements Pagination {

	/** 页码 */
	protected int pageNo;
	/** 每页记录条数 */
	protected int pageCount;
	/** 总页数 */
	protected int totalPage;
	/** 总记录条数 */
	protected int totalCount = -1;

	/** 用于存放查询结果 */
	protected List<T> resultList;

	public Page() {
	}

	public Page(Integer pageNo, int pageCount) {
		if(pageNo==null){
			pageNo=1;
		}
		if (pageNo <= 0) {
			pageNo=1;
			//throw new IllegalArgumentException("pageNo must be greater than 0.");
		}
		if (pageCount<=0 && pageCount>50) {
			pageCount=50;
			//throw new IllegalArgumentException("pageCount must be greater than 0.");
		}
		this.pageNo = pageNo;
		this.pageCount = pageCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getPageCount() {
		return pageCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		if (totalCount < 0) { // 如果总数为负数, 表未设置
			totalPage = 0;
		} else { // 计算总页数
			totalPage = (totalCount / pageCount) + (totalCount % pageCount == 0 ? 0 : 1);
		}
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public int getTotalPage() {
		return totalPage;
	}


}
