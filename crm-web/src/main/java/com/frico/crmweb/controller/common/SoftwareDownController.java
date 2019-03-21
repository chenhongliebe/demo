package com.frico.crmweb.controller.common;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcore.model.SoftwareDown;
import com.frico.crmcore.service.SoftwareDownService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("common/software")
public class SoftwareDownController {

    @Autowired
    private SoftwareDownService softwareDownService;

    /**
     * 获取软件下载列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @PostMapping("list")
    public ResultVO list(@RequestParam(defaultValue = "1") int pageNum,
                         @RequestParam(defaultValue = "8") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<SoftwareDown> list = softwareDownService.findList(new SoftwareDown());
        PageInfo pageInfo = new PageInfo(list);
        return ResultVO.success(pageInfo);
    }

    /**
     * 获取软件详情
     */
    @GetMapping("detail/{id}")
    public ResultVO detail(@PathVariable Integer id){
        SoftwareDown softwareDown = softwareDownService.get(id);
        return ResultVO.success(softwareDown);
    }


}
