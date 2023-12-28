package org.training.core.service.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.model.ContactUsModel;
import org.training.core.service.contactservice.ContactUsService;

import javax.annotation.Resource;

public class ContactUsServiceImpl implements ContactUsService {
    @Resource
    private ModelService modelService;

    public void test(ContactUsModel contactUsModel){
        modelService.save(contactUsModel);


    }
}
