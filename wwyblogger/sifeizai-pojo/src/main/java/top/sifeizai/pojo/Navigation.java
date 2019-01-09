package top.sifeizai.pojo;

import java.io.Serializable;

public class Navigation implements Serializable {
    private Integer id;
    private String ParentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }

    @Override
    public String toString() {
        return "Navigation{" +
                "id=" + id +
                ", ParentId='" + ParentId + '\'' +
                '}';
    }
}
