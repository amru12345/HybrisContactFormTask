package org.training.facades.contact;

import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.model.ContactUsModel;
import org.training.core.service.contactservice.ContactUsService;

import javax.annotation.Resource;

public class ContactFacad implements ContactFacadInterface {

    @Resource
    private ModelService modelService;

    @Resource(name = "ContactUsServiceImpl")
    private ContactUsService contactUsService;

    @Override
    public void demo(ContactUsModel contactusmodel) {
      contactUsService.test(contactusmodel);

    }
}

