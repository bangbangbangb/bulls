package com.sdxg.angrybulls.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "video_comment")
public class VideoComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer author;

    @Column(name = "video_id")
    private Integer videoId;

    @Column(name = "put_time")
    private Date putTime;

    private String content;

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
     * @return video_id
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * @param videoId
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}