package org.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.servicelayer.model.MockModelService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.model.ContactUsModel;
import org.training.facades.contact.ContactFacadInterface;
import org.training.storefront.form.ContactUs;
import javax.annotation.Resource;


import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/form")
public class ContactUsController extends AbstractPageController {
    private static final String CONTACT_US_PAGE="contactuspage";

    @Resource
    private ModelService modelService;


    @Resource(name = "ContactFacad")
    private ContactFacadInterface contactfacad;

    @RequestMapping(value = "/saveContactDetails",method = RequestMethod.POST)
    public String displaycontactdetails(@ModelAttribute("registerForm") final RegisterForm registerForm, final BindingResult bindingResult, final Model model){
        //ContactUs contact=new ContactUs();
        final ContactUsModel contact=modelService.create(ContactUsModel.class);
        contact.setFirstName(registerForm.getFirstName());
        contact.setLastName(registerForm.getLastName());
        contact.setUid(registerForm.getFirstName()+registerForm.getLastName());
        System.out.println("Data saved");
        contactfacad.demo(contact);
        return "pages/contactdetails";

    }
}
