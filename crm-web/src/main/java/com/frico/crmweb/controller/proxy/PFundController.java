package com.frico.crmweb.controller.proxy;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcore.model.MoneyRecord;
import com.frico.crmcore.service.MoneyRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("proxy/funds")
public class PFundController {

    @Autowired
    private MoneyRecordService moneyRecordService;

    /**
     * 代理资金管理 通过参数类型type 2为出金 3为内转查找出金与内转记录
     * @param type
     * @param condition
     * @param pageNum
     * @param pageSize
     * @return
     */
    @PostMapping("list")
    public ResultVO list(@RequestParam String type,String condition,@RequestParam(defaultValue = "1") int pageNum,
                         @RequestParam(defaultValue = "10") int pageSize){
        MoneyRecord moneyRecord = new MoneyRecord();
        moneyRecord.setType(type);
        moneyRecord.setCondition(condition);
        PageHelper.startPage(pageNum,pageSize);
        List<MoneyRecord> list =  moneyRecordService.findList(moneyRecord);
        PageInfo pageInfo = new PageInfo(list);
        return ResultVO.success(pageInfo);
    }


}
