package com.uoesz.alumniplatform.service;

import com.uoesz.alumniplatform.repository.UserRepository;
import com.uoesz.alumniplatform.utils.ResponseResult;
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
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseResult getUserById(Long userId) {
        return new ResponseResult("0", "Success", userRepository.findByUserId(userId));
    }
}
