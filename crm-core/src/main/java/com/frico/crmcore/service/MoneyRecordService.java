package com.frico.crmcore.service;

import com.frico.crmcore.model.MoneyRecord;

import java.util.List;

public interface MoneyRecordService {

    List<MoneyRecord> findList(MoneyRecord moneyRecord);

}
