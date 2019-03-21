package com.frico.crmcore.service;

import com.frico.crmcore.model.Notice;

import java.util.List;

public interface NoticeService {

    List<Notice> findList(Notice notice);

    Notice detail(Integer id);

}
