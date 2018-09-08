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

    private Integer playAmount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Date getPutTime() {
        return putTime;
    }

    public void setPutTime(Date putTime) {
        this.putTime = putTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getPlayAmount() {
        return playAmount;
    }

    public void setPlayAmount(Integer playAmount) {
        this.playAmount = playAmount;
    }
}