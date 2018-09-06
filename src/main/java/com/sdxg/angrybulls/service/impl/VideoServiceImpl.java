package com.sdxg.angrybulls.service.impl;

import com.sdxg.angrybulls.dao.VideoMapper;
import com.sdxg.angrybulls.model.Video;
import com.sdxg.angrybulls.service.VideoService;
import com.sdxg.angrybulls.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;


/**
 * Created by CodeGenerator on 2018/09/02.
 */
@Service
@Transactional
public class VideoServiceImpl extends AbstractService<Video> implements VideoService {
    @Resource
    private VideoMapper videoMapper;

    @Override
    public void save(Video model) {
        model.setPutTime(new Date());
        super.save(model);
    }
}
