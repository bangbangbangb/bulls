package com.sdxg.angrybulls.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "play_record")
public class PlayRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "play_time")
    private Date playTime;

    @Column(name = "last_pos")
    private String lastPos;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return play_time
     */
    public Date getPlayTime() {
        return playTime;
    }

    /**
     * @param playTime
     */
    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    /**
     * @return last_pos
     */
    public String getLastPos() {
        return lastPos;
    }

    /**
     * @param lastPos
     */
    public void setLastPos(String lastPos) {
        this.lastPos = lastPos;
    }
}