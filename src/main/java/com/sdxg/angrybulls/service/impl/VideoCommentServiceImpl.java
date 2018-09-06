package com.sdxg.angrybulls.service.impl;

import com.sdxg.angrybulls.dao.VideoCommentMapper;
import com.sdxg.angrybulls.model.VideoComment;
import com.sdxg.angrybulls.service.VideoCommentService;
import com.sdxg.angrybulls.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/09/02.
 */
@Service
@Transactional
public class VideoCommentServiceImpl extends AbstractService<VideoComment> implements VideoCommentService {
    @Resource
    private VideoCommentMapper videoCommentMapper;

}
