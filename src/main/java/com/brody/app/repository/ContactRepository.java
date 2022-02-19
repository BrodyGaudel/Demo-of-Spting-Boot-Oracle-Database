package com.brody.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.brody.app.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	List<Contact> findByPublished(boolean published);
	List<Contact> findByTitleContaining(String title);

}
