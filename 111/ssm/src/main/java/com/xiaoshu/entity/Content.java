package com.xiaoshu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Content implements Serializable {
    @Id
    @Column(name = "contenId")
    private Integer contenid;

    @Column(name = "contentCatgoryId")
    private String contentcatgoryid;

    private String contenttitle;

    private String contenturl;

    private String picpath;

    private String price;

    private String status;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String createtime;

    private static final long serialVersionUID = 1L;

    /**
     * @return contenId
     */
    public Integer getContenid() {
        return contenid;
    }

    /**
     * @param contenid
     */
    public void setContenid(Integer contenid) {
        this.contenid = contenid;
    }

    /**
     * @return contentCatgoryId
     */
    public String getContentcatgoryid() {
        return contentcatgoryid;
    }

    /**
     * @param contentcatgoryid
     */
    public void setContentcatgoryid(String contentcatgoryid) {
        this.contentcatgoryid = contentcatgoryid == null ? null : contentcatgoryid.trim();
    }

    /**
     * @return contenttitle
     */
    public String getContenttitle() {
        return contenttitle;
    }

    /**
     * @param contenttitle
     */
    public void setContenttitle(String contenttitle) {
        this.contenttitle = contenttitle == null ? null : contenttitle.trim();
    }

    /**
     * @return contenturl
     */
    public String getContenturl() {
        return contenturl;
    }

    /**
     * @param contenturl
     */
    public void setContenturl(String contenturl) {
        this.contenturl = contenturl == null ? null : contenturl.trim();
    }

    /**
     * @return picpath
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * @param picpath
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    /**
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return createtime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contenid=").append(contenid);
        sb.append(", contentcatgoryid=").append(contentcatgoryid);
        sb.append(", contenttitle=").append(contenttitle);
        sb.append(", contenturl=").append(contenturl);
        sb.append(", picpath=").append(picpath);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}