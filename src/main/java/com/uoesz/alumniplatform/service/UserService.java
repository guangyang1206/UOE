package com.uoesz.alumniplatform.service;


import com.uoesz.alumniplatform.domain.User;
import com.uoesz.alumniplatform.utils.ResponseResult;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 */
public interface UserService {

    ResponseResult getUserById(Long userId);

    List<User> getAllUsers();

    ResponseResult addNewUser(Map<String, String> paramMap) throws ParseException;
}
