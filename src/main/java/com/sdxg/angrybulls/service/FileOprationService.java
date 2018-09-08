package com.sdxg.angrybulls.service;

import org.springframework.web.multipart.MultipartFile;


/**
 * @author YangSheng
 * @Package com.sdxg.angrybulls.service
 * @date 2018/9/8 21:55
 */
public interface FileOprationService {

    String upload(MultipartFile file);
}
