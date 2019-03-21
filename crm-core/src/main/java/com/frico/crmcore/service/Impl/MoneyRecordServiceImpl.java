package com.frico.crmcore.service.Impl;

import com.frico.crmcore.mapper.MoneyRecordMapperExt;
import com.frico.crmcore.model.MoneyRecord;
import com.frico.crmcore.service.MoneyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MoneyRecordServiceImpl implements MoneyRecordService{

    @Autowired
    private MoneyRecordMapperExt moneyRecordMapperExt;

    @Override
    public List<MoneyRecord> findList(MoneyRecord moneyRecord) {
        return moneyRecordMapperExt.findList(moneyRecord);
    }
}
