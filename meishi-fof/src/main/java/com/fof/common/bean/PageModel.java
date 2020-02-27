package com.fof.common.bean;

import java.io.Serializable;

/**
 * 分页查询参数配置
 * @param <S>
 */
public class PageModel<S> implements Serializable {
    private static final long serialVersionUID = 5044184237183288463L;

    private Integer page; //页数
    private Integer rows; //每页的行数
    private S search; //查询条件
    private String sort; //排序的方式
    private String order; //排序的列

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public S getSearch() {
        return search;
    }

    public void setSearch(S search) {
        this.search = search;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getStart() {
        return (page - 1) * rows;
    }

    public Integer getEnt() {
        return page * rows;
    }
}
