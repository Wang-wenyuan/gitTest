package top.sifeizai.pojo;

import java.util.Date;

public class Article {
    private Integer id;
    private String img;
    private String describes;
    private String contents;
    private String authors;
    private Date time;
    private Integer count;
    private Character state;
    private Character recommend;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    public Character getRecommend() {
        return recommend;
    }

    public void setRecommend(Character recommend) {
        this.recommend = recommend;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", describes='" + describes + '\'' +
                ", contents='" + contents + '\'' +
                ", authors='" + authors + '\'' +
                ", time=" + time +
                ", count=" + count +
                ", state=" + state +
                ", recommend=" + recommend +
                ", title='" + title + '\'' +
                '}';
    }
}
