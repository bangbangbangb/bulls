package com.sdxg.angrybulls.configurer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 上传文件访问路径映射配置
 * @author YangSheng
 * @Package com.sdxg.angrybulls.configurer
 * @date 2018/9/16 23:17
 */
@Configuration
public class FilePathMappingConfigurer extends WebMvcConfigurerAdapter {

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

    /**
     * 追加静态访问资源。（不会覆盖spring boot默认的静态资源mapping）
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(pathMapping).addResourceLocations("file:" + uploadDir);
        super.addResourceHandlers(registry);
    }
}
