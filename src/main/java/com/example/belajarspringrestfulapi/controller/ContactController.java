package com.example.belajarspringrestfulapi.controller;

import com.example.belajarspringrestfulapi.entity.User;
import com.example.belajarspringrestfulapi.model.ContactResponse;
import com.example.belajarspringrestfulapi.model.CreateContactRequest;
import com.example.belajarspringrestfulapi.model.WebResponse;
import com.example.belajarspringrestfulapi.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    public WebResponse<ContactResponse> create(User user, @RequestBody CreateContactRequest request) {
        ContactResponse contactResponse = contactService.create(user, request);
        return WebResponse.<ContactResponse>builder().data(contactResponse).build();
    }
}
