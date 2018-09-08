package com.sdxg.angrybulls.service.impl;

import com.sdxg.angrybulls.service.FileOprationService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author YangSheng
 * @Package com.sdxg.angrybulls.service.impl
 * @date 2018/9/8 21:55
 */
@Service
public class FileOprationServiceImpl implements FileOprationService {

    @Override
    public String upload(MultipartFile file) {
        Path path = Paths.get("E:\\", file.getOriginalFilename());
        try {
            Files.write(path, file.getBytes());
            return path.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
