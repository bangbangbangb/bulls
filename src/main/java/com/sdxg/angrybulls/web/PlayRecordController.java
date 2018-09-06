package com.sdxg.angrybulls.web;
import com.sdxg.angrybulls.core.Result;
import com.sdxg.angrybulls.core.ResultGenerator;
import com.sdxg.angrybulls.model.PlayRecord;
import com.sdxg.angrybulls.service.PlayRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/09/04.
*/
@RestController
@RequestMapping("/play/record")
public class PlayRecordController {
    @Resource
    private PlayRecordService playRecordService;

    @PostMapping("/add")
    public Result add(PlayRecord playRecord) {
        playRecordService.save(playRecord);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        playRecordService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(PlayRecord playRecord) {
        playRecordService.update(playRecord);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        PlayRecord playRecord = playRecordService.findById(id);
        return ResultGenerator.genSuccessResult(playRecord);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<PlayRecord> list = playRecordService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
