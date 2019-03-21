package com.frico.crmcore.service;

import com.frico.crmcore.model.SoftwareDown;

import java.util.List;

public interface SoftwareDownService {

    List<SoftwareDown> findList(SoftwareDown softwareDown);

    SoftwareDown get(Integer id);
}
