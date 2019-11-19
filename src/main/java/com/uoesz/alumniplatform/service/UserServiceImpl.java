package com.uoesz.alumniplatform.service;

import com.uoesz.alumniplatform.domain.User;
import com.uoesz.alumniplatform.entity.AlumniUser;
import com.uoesz.alumniplatform.repository.UserRepository;
import com.uoesz.alumniplatform.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public ResponseResult addNewUser(Map<String, String> paramMap) throws ParseException {
        String firstName = paramMap.get("firstName");
        String lastName = paramMap.get("lastName");
        String email = paramMap.get("email");
        String phone = paramMap.get("phone");
        String gender = paramMap.get("gender");
        String birthday = paramMap.get("birthday");
        Date dateBirthday = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(birthday);
        String wechatId = paramMap.get("wechatId");
        String company = paramMap.get("company");
        String location = paramMap.get("location");
        String career = paramMap.get("career");
        String graduationYear = paramMap.get("graduationYear");
        String degree = paramMap.get("degree");
        String status = paramMap.get("status");
        String programme = paramMap.get("programme");
        String speciality = paramMap.get("speciality");
        String interest =  paramMap.get("interest");
        AlumniUser existedUser = userRepository.findByEmailAndPhone(email, phone);
        if (existedUser != null) {
            return new ResponseResult("1","User already registered.");
        } else {
            AlumniUser user = new AlumniUser();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPhone(phone);
            user.setGender(gender);
            user.setBirthday(dateBirthday);
            user.setWechatId(wechatId);
            user.setCompany(company);
            user.setLocation(location);
            user.setCareer(career);
            user.setGraduationYear(graduationYear);
            user.setDegree(degree);
            user.setStatus(status);
            user.setProgramme(programme);
            user.setSpeciality(speciality);
            user.setInterest(interest);
            userRepository.save(user);
        }

        return new ResponseResult("0", "You have registered successfully!");
    }
}
