package com.sdxg.angrybulls.service.impl;

import com.sdxg.angrybulls.core.ServiceException;
import com.sdxg.angrybulls.service.FileOprationService;
import com.sdxg.angrybulls.utils.FileUploadUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * @author YangSheng
 * @Package com.sdxg.angrybulls.service.impl
 * @date 2018/9/8 21:55
 */
@Service
public class FileOprationServiceImpl implements FileOprationService {

    /**
     * 配置文件application.properties中定义的上传路径
     */
    @Value("${file.uploadDir}")
    private String uploadDir;

    /**
     * 配置文件application.properties中定义的映射路径
     */
    @Value("${file.pathMapping}")
    private String pathMapping;

    @Override
    public String[] upload(MultipartFile file) {
        String originName = file.getOriginalFilename();
        String randomName = UUID.randomUUID().toString().replaceAll("-", "")
                + originName.substring(originName.lastIndexOf("."));
        String dstName = uploadDir + randomName;
        boolean isOk = FileUploadUtils.bigFileupload(file, dstName);
        if(!isOk){
            throw new ServiceException("视频上传失败。");
        }
        String[] results = new String[3];
        results[0] = originName;
        results[1] = dstName;
        results[2] = pathMapping.replaceAll("[*]", "") + randomName;
        return results;
    }
}
