package org.NextGeTechSchool.NextGen.Tech.School.Service;


import org.NextGeTechSchool.NextGen.Tech.School.Model.Contact;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

/*
@Slf4j, is a Lombok-provided annotation that will automatically generate an SLF4J
Logger static property in the class at compilation time.
* */
@Slf4j
@Service
public class ContactService {
	private static org.slf4j.Logger log =LoggerFactory.getLogger(ContactService.class);

    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }

}
