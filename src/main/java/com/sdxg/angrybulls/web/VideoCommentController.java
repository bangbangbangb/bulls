package com.sdxg.angrybulls.web;
import com.sdxg.angrybulls.core.Result;
import com.sdxg.angrybulls.core.ResultGenerator;
import com.sdxg.angrybulls.model.VideoComment;
import com.sdxg.angrybulls.service.VideoCommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/09/02.
*/
@RestController
@RequestMapping("/video/comment")
public class VideoCommentController {
    @Resource
    private VideoCommentService videoCommentService;

    @PostMapping("/add")
    public Result add(VideoComment videoComment) {
        videoCommentService.save(videoComment);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        videoCommentService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(VideoComment videoComment) {
        videoCommentService.update(videoComment);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        VideoComment videoComment = videoCommentService.findById(id);
        return ResultGenerator.genSuccessResult(videoComment);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<VideoComment> list = videoCommentService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
