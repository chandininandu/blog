package com.ssd.log.projectlog.postDto;

import java.util.List;

import com.ssd.log.projectlog.entity.IplMatches;

public class PaginingAndSortingResponse {
	


	private List<IplMatches> content;
	private int pageNo;
	private int pageSize;
	private long totalElements;
	private int totaPages;
	private boolean last;
	public List<IplMatches> getContent() {
		return content;
	}
	public void setContent(List<IplMatches> content) {
		this.content = content;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotaPages() {
		return totaPages;
	}
	public void setTotaPages(int totaPages) {
		this.totaPages = totaPages;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	public PaginingAndSortingResponse(List<IplMatches> content, int pageNo, int pageSize, long totalElements,
			int totaPages, boolean last) {
		super();
		this.content = content;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalElements = totalElements;
		this.totaPages = totaPages;
		this.last = last;
	}
	public PaginingAndSortingResponse() {
		super();
	}
	

}
