package top.sifeizai.pojo;

import java.io.Serializable;
import java.util.List;

public class Navigation implements Serializable {
    private Integer id;
    private Integer ParentId;
    private String navigationTitle;
    private List twoList;

    public List getList() {
        return twoList;
    }

    public void setList(List twoList) {
        this.twoList = twoList;
    }

    public String getNavigationTitle() {
        return navigationTitle;
    }

    public void setNavigationTitle(String navigationTitle) {
        this.navigationTitle = navigationTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return ParentId;
    }

    public void setParentId(Integer parentId) {
        ParentId = parentId;
    }

    @Override
    public String toString() {
        return "Navigation{" +
                "id=" + id +
                ", ParentId=" + ParentId +
                ", navigationTitle='" + navigationTitle + '\'' +
                ", twoList=" + twoList +
                '}';
    }
}
