package com.frico.crmweb.controller.proxy;

import com.frico.crmcommon.VO.ResultVO;
import com.frico.crmcore.model.RebateHis;
import com.frico.crmcore.service.RebateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 返佣管理
 */
@RestController
@RequestMapping("proxy/rebate")
public class PRebateController {

    @Autowired
    private RebateService rebateService;

    /**
     * 查看返佣历史
     * @return
     */
    @PostMapping("list")
    public ResultVO findList(){
        RebateHis rebateHis = new RebateHis();
        List<RebateHis> list = rebateService.findList(rebateHis);
        return ResultVO.success(list);
    }

    /**
     * 返佣详情
     */
    @GetMapping("detail/{id}")
    public ResultVO detail(@PathVariable Integer id){

        return null;
    }
}
