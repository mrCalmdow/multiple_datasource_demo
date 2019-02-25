package com.flchen.multiple_datasource_demo.commom.mo;

import com.flchen.multiple_datasource_demo.commom.constants.CommonConstants;
import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.util.StringUtils;

@Data
public  class PageableMO implements Pageable {
	private int pageNumber = CommonConstants.DEFAULT_PAGE_NUMBER;
	private int pageSize = CommonConstants.DEFAULT_PAGE_SIZE;
	private String direction;
	private String property;
	private int totalPages;
	private long total;

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	@Override
	public int getPageNumber() {
		return this.pageNumber;
	}

	@Override
	public int getPageSize() {
		return this.pageSize;
	}

	@Override
	public long getOffset() {
		return this.pageNumber * this.pageSize;
	}

	@Override
	public Sort getSort() {
		if (StringUtils.hasText(direction) && StringUtils.hasText(property)) {
			return new Sort(Direction.fromString(this.direction), property);
		}
		return null;
	}
	@Override
	public boolean hasPrevious() {
		return (this.pageNumber > 0);
	}

	@Override
	public Pageable next() {
		return new PageRequest(this.pageNumber + 1, this.pageSize, getSort());
	}

	@Override
	public Pageable previousOrFirst() {
		return ((hasPrevious()) ? new PageRequest(this.pageNumber - 1, this.pageSize, getSort()) : this);
	}

	@Override
	public Pageable first() {
		return new PageRequest(0, this.pageSize, getSort());
	}
}
