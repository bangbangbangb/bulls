-- 视频资源表
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
    `id`          INT(11)      NOT NULL AUTO_INCREMENT
    COMMENT '视频编号',
    `author`      INT(11)      NOT NULL
    COMMENT '（上传）用户编号',
    `put_time`    DATETIME     NOT NULL
    COMMENT '上传时间',
    `url`         VARCHAR(500) NOT NULL
    COMMENT '视频资源地址',
    `cost`        DECIMAL               DEFAULT 0
    COMMENT '观看费用（非空，默认0，0代表打赏，大于0代表收费）',
    `play_amount` INT(11)               DEFAULT 0
    COMMENT '视频总播放量',

    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 2
    DEFAULT CHARSET = utf8
    COMMENT ='视频资源表';

-- 视频评论表
DROP TABLE IF EXISTS `video_comment`;
CREATE TABLE `video_comment` (
    `id`       INT(11)  NOT NULL AUTO_INCREMENT
    COMMENT '评论编号',
    `author`   INT(11)  NOT NULL
    COMMENT '评论人编号',
    `video_id` INT(11)  NOT NULL
    COMMENT '被评论视频编号',
    `put_time` DATETIME NOT NULL
    COMMENT '评论时间',
    `content`  VARCHAR(200)      DEFAULT NULL
    COMMENT '评论内容',
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 2
    DEFAULT CHARSET = utf8
    COMMENT ='视频评论表';

-- 播放记录表
DROP TABLE IF EXISTS `play_record`;
CREATE TABLE `play_record` (
    `id`        INT(11)     NOT NULL AUTO_INCREMENT
    COMMENT '播放记录编号',
    `user_id`   INT(11)     NOT NULL
    COMMENT '播放用户的编号',
    `play_time` DATETIME    NOT NULL
    COMMENT '播放时间',
    `last_pos`  VARCHAR(20) NOT NULL
    COMMENT '本次播放退出位置',
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 2
    DEFAULT CHARSET = utf8
    COMMENT ='播放记录表';

-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id`           INT(11)     NOT NULL AUTO_INCREMENT
    COMMENT '用户编号',
    `user_name`    INT(11)     NOT NULL
    COMMENT '用户名',
    `ext_id`       VARCHAR(32) NOT NULL
    COMMENT '第三方ID（微信等）',
    `ext_nickname` VARCHAR(32) NOT NULL
    COMMENT '第三方昵称',
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 2
    DEFAULT CHARSET = utf8
    COMMENT ='用户信息表';