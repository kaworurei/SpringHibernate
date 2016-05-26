package com.springhibernate.model.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
@Entity
@Table(name = "Article", schema = "", catalog = "")
public class ArticleVO {
    private int id;
    private String ttile;
    private String updateTime;
    private int authorid;
    private String authorname;
    private String content;
    private String image;
    private String tags;
    private UserVO author;
    private List<String> taglist;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Ttile")
    public String getTtile() {
        return ttile;
    }

    public void setTtile(String ttile) {
        this.ttile = ttile;
    }

    @Basic
    @Column(name = "UpdateTime")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }


    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "Image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "Tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleVO articleVO = (ArticleVO) o;

        if (id != articleVO.id) return false;
        if (authorid != articleVO.authorid) return false;
        if (ttile != null ? !ttile.equals(articleVO.ttile) : articleVO.ttile != null) return false;
        if (updateTime != null ? !updateTime.equals(articleVO.updateTime) : articleVO.updateTime != null) return false;
        if (content != null ? !content.equals(articleVO.content) : articleVO.content != null) return false;
        if (image != null ? !image.equals(articleVO.image) : articleVO.image != null) return false;
        if (tags != null ? !tags.equals(articleVO.tags) : articleVO.tags != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ttile != null ? ttile.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + authorid;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Authorid", referencedColumnName = "id", nullable = false)
    public UserVO getAuthor() {
        return author;
    }

    public void setAuthor(UserVO author) {
        this.author = author;
    }

    public List<String> getTaglist() {
        return taglist;
    }

    public void setTaglist(List<String> taglist) {
        this.taglist = taglist;
    }
}
