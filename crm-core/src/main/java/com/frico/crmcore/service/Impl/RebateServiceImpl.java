package com.frico.crmcore.service.Impl;

import com.frico.crmcore.mapper.RebateHisMapperExt;
import com.frico.crmcore.model.RebateHis;
import com.frico.crmcore.service.RebateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebateServiceImpl implements RebateService {

    @Autowired
    private RebateHisMapperExt rebateHisMapperExt;

    @Override
    public List<RebateHis> findList(RebateHis rebateHis) {
        return rebateHisMapperExt.findList(rebateHis);
    }
}
