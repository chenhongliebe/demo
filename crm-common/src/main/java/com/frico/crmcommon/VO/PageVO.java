package com.frico.crmcommon.VO;

import lombok.Data;

@Data
public class PageVO {
    private Integer pageNum;
    private Integer pageSize;
    private Long total;
    private Object data;

    public PageVO(Integer pageNum, Integer pageSize, Long total, Object data) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.data = data;
    }
}
