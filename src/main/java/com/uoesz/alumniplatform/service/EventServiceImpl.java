package com.uoesz.alumniplatform.service;

import com.uoesz.alumniplatform.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 */

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;


}
