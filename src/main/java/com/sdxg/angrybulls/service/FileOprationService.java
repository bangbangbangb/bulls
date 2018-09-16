package com.sdxg.angrybulls.service;

import org.springframework.web.multipart.MultipartFile;


/**
 * @author YangSheng
 * @Package com.sdxg.angrybulls.service
 * @date 2018/9/8 21:55
 */
public interface FileOprationService {

    /**
     * 文件上传业务处理
     *
     * @param file
     * @return java.lang.String[]
     *      返回文件名数组 results[3]，其中：
     *          results[0] = 客户端上传文件的原始名称
     *          results[1] = 上传到服务器后的绝对路径
     *          results[2] = 上传到服务器后的相对路径
     * @author 杨盛
     * @date 2018/9/16 23:33
     */
    String[] upload(MultipartFile file);
}
