package com.frico.crmweb.controller.customer;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcore.model.MoneyRecord;
import com.frico.crmcore.service.MoneyRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class MoneyRecordController {

    @Autowired
    private MoneyRecordService moneyRecordService;

    /**
     * 获取出入金记录 通过类型type 1入金 2出金 3内转
     * @return
     */
    @RequestMapping("list")
    public ResultVO findList(@RequestParam String type,String condition,@RequestParam(defaultValue = "1") int pageNum,
                             @RequestParam(defaultValue = "10") int pageSize){
        MoneyRecord moneyRecord = new MoneyRecord();
        moneyRecord.setCondition(condition);
        moneyRecord.setType(type);
        PageHelper.startPage(pageNum,pageSize);
        List<MoneyRecord> list = moneyRecordService.findList(moneyRecord);
        PageInfo pageInfo =new PageInfo(list);
        return ResultVO.success(pageInfo);
    }


}
