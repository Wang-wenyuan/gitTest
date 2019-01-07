package top.sifeizai.pojo;

import java.io.Serializable;

public class Viewpager implements Serializable {
    private Integer id;
    private String img;
    private String defaultImg;

    public String getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(String defaultImg) {
        this.defaultImg = defaultImg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Viewpager{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", defaultImg='" + defaultImg + '\'' +
                '}';
    }
}
