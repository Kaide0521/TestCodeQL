package com.test.model;

import lombok.Data;

import java.util.List;

@Data
public class AdviceVO {
    private String content;
    private Integer id;
    private Integer status;
    private String submiter;
    private String createTime;
    private String remark;

    private List<AttachmentVO> attachementVos;
}
