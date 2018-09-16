package com.sdxg.angrybulls.web;
import com.sdxg.angrybulls.core.Result;
import com.sdxg.angrybulls.core.ResultGenerator;
import com.sdxg.angrybulls.model.Video;
import com.sdxg.angrybulls.service.FileOprationService;
import com.sdxg.angrybulls.service.VideoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/09/02.
*/
@RestController
@RequestMapping("/video")
public class VideoController {
    @Resource
    private VideoService videoService;

    @Resource
    private FileOprationService fileOprationService;

    @PostMapping("/add")
    public Result add(@RequestParam("file") MultipartFile file, Video video) {
        String[] fileName = fileOprationService.upload(file);
        // 存储video的相对路径
        video.setUrl(fileName[2]);
//        videoService.save(video);
        return ResultGenerator.genSuccessResult(fileName[2]);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        videoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Video video) {
        videoService.update(video);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Video video = videoService.findById(id);
        return ResultGenerator.genSuccessResult(video);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Video> list = videoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
