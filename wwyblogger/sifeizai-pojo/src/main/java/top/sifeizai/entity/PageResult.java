package top.sifeizai.entity;


import java.util.List;

public class PageResult {
    private Long total;
    private List pageList;
    private Integer pages;

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getPageList() {
        return pageList;
    }

    public void setPageList(List pageList) {
        this.pageList = pageList;
    }

    public PageResult(Long total, List pageList, Integer pages) {
        this.total = total;
        this.pageList = pageList;
        this.pages = pages;
    }

    public PageResult() {
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", pageList=" + pageList +
                ", pages=" + pages +
                '}';
    }
}
