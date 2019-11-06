package com.uoesz.alumniplatform.repository;

import com.uoesz.alumniplatform.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 */

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}