package com.frico.crmcore.service.Impl;

import com.frico.crmcore.mapper.NoticeMapperExt;
import com.frico.crmcore.model.Notice;
import com.frico.crmcore.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapperExt noticeMapperExt;

    @Override
    public List<Notice> findList(Notice notice) {
        return noticeMapperExt.findList(notice);
    }

    @Override
    public Notice detail(Integer id) {
        return noticeMapperExt.selectByPrimaryKey(id);
    }
}
