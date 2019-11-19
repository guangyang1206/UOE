package com.uoesz.alumniplatform.controller;

import com.uoesz.alumniplatform.domain.User;
import com.uoesz.alumniplatform.service.UserService;
import com.uoesz.alumniplatform.utils.ResponseResult;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.*;

@Api(value = "UserController")
@CrossOrigin(origins={ "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	private UserService userService;

	@ApiOperation(value = "获取用户信息", notes = "根据用户id获取用户信息")
	@ApiImplicitParam(name = "id", value = "userId", required = true, dataType = "Long", paramType = "path")
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseResult getVacationItem(@RequestParam(required=true) Long userId) {
		return userService.getUserById(userId);
	}



	@ApiOperation(value = "获取用户列表", notes = "获取用户列表")
	@GetMapping("/list")
	public @ResponseBody
    List<User> getUserList() {
		return userService.getAllUsers();
	}

	@ApiOperation(value = "新增用户", notes = "根据用户实体创建用户")
	@ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
	@PostMapping("/add")
	public @ResponseBody
    ResponseResult addUser(@RequestBody User user) throws ParseException {
        Map<String, String> paramMap = new HashMap<String, String>();
        String firstName = user.getFirstName();
		String lastName = user.getLastName();
        String gender = user.getGender();
        String phone = user.getPhone();
        String email = user.getEmail();
        String location = user.getLocation();
        Date birthday = user.getBirthday();
        String wechatId = user.getWechatId();
        String company = user.getCompany();
        String career = user.getCareer();
        String graduationYear = user.getGraduationYear();
        String degree = user.getDegree();
        String status = user.getStatus();
        String programme = user.getProgramme();
        String speciality = user.getSpeciality();
        String interest = user.getInterest();

        if (!StringUtils.isEmpty(user.getFirstName())) {
            paramMap.put("firstName", firstName);
        } else {
            return new ResponseResult("1", "User firstName could not be empty.");
        }
        if (!StringUtils.isEmpty(lastName)) {
            paramMap.put("lastName", lastName);
        } else {
            return new ResponseResult("1", "User lastName could not be empty.");
        }
        if (!StringUtils.isEmpty(email)) {
            paramMap.put("email", email);
        } else {
            return new ResponseResult("1", "User email could not be empty.");
        }
        if (!StringUtils.isEmpty(phone)) {
            paramMap.put("phone", phone);
        } else {
            return new ResponseResult("1", "User phone could not be empty.");
        }
        if (!StringUtils.isEmpty(gender)) {
            paramMap.put("gender", gender);
        } else {
            return new ResponseResult("1", "User gender Could not be empty.");
        }
        paramMap.put("location", location);
        paramMap.put("birthday", birthday.toString());
        paramMap.put("wechatId", wechatId);
        paramMap.put("company", company);
        paramMap.put("career", career);
        paramMap.put("graduationYear", graduationYear);
        paramMap.put("degree", degree);
        paramMap.put("status", status);
        paramMap.put("programme", programme);
        paramMap.put("speciality", speciality);
        paramMap.put("interest", interest);

		return userService.addNewUser(paramMap);
	}

	@ApiOperation(value = "删除用户", notes = "根据用户id删除用户")
	@ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path")
	@DeleteMapping("/{id}")
	public @ResponseBody
    Map<String, Object> deleteUser(@PathVariable(value = "id") Long id) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", "success");
		return map;
	}

	@ApiOperation(value = "更新用户", notes = "根据用户id更新用户")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User") })
	@PutMapping("/{id}")
	public @ResponseBody
    Map<String, Object> updateUser(@PathVariable(value = "id") Long id, @RequestBody User user) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", "success");
		return map;
	}

}
