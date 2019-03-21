package com.frico.crmcore.service.Impl;

import com.frico.crmcore.mapper.SoftwareDownMapperExt;
import com.frico.crmcore.model.SoftwareDown;
import com.frico.crmcore.service.SoftwareDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoftwareDownServiceImpl implements SoftwareDownService {

    @Autowired
    private SoftwareDownMapperExt softwareDownMapperExt;

    @Override
    public List<SoftwareDown> findList(SoftwareDown softwareDown) {
        return softwareDownMapperExt.findList(softwareDown);
    }

    @Override
    public SoftwareDown get(Integer id) {
        return softwareDownMapperExt.selectByPrimaryKey(id);
    }
}
