package com.sdxg.angrybulls.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer author;

    @Column(name = "put_time")
    private Date putTime;

    private String url;

    private BigDecimal cost;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return author
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(Integer author) {
        this.author = author;
    }

    /**
     * @return put_time
     */
    public Date getPutTime() {
        return putTime;
    }

    /**
     * @param putTime
     */
    public void setPutTime(Date putTime) {
        this.putTime = putTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}