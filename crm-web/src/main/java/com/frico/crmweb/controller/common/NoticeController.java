package com.frico.crmweb.controller.common;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcore.model.Notice;
import com.frico.crmcore.service.NoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("common/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * 通知列表
     * @param condition
     * @param pageNum
     * @param pageSize
     * @return
     */
    @PostMapping("list")
    public ResultVO list(String condition,
                        @RequestParam(defaultValue = "1") int pageNum,
                         @RequestParam(defaultValue = "10") int pageSize){
        Notice notice = new Notice();
        notice.setCondition(condition);
        PageHelper.startPage(pageNum,pageSize);
        List<Notice> list =noticeService.findList(notice);
        PageInfo pageInfo = new PageInfo(list);
        return ResultVO.success(pageInfo);
    }

    /**
     * 通知详情
     */
    @GetMapping("detail/{id}")
    public ResultVO detail(@PathVariable("id") Integer id){
        Notice notice =   noticeService.detail(id);
        return ResultVO.success(notice);
    }
}
