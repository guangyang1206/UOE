package com.uoesz.alumniplatform.repository;

import com.uoesz.alumniplatform.entity.AlumniUser;
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
public interface UserRepository extends JpaRepository<AlumniUser, Long> {

    public AlumniUser findByUserId(Long userId);

}