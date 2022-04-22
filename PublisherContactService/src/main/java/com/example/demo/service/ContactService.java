package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
@Service
public class ContactService {


	@Autowired
	ContactRepository contactRepo;
	
	public Contact getContactByPublisherId(Long pub_id) {
		Contact publisher = contactRepo.findById(pub_id).get();
		return publisher;
	}

}
