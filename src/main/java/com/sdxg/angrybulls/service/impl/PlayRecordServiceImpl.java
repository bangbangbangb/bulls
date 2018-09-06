package com.sdxg.angrybulls.service.impl;

import com.sdxg.angrybulls.dao.PlayRecordMapper;
import com.sdxg.angrybulls.model.PlayRecord;
import com.sdxg.angrybulls.service.PlayRecordService;
import com.sdxg.angrybulls.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/09/04.
 */
@Service
@Transactional
public class PlayRecordServiceImpl extends AbstractService<PlayRecord> implements PlayRecordService {
    @Resource
    private PlayRecordMapper playRecordMapper;

}
