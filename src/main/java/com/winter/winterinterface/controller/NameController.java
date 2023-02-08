package com.winter.winterinterface.controller;

import com.winter.winterapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: winter-interface
 * @description: 获取姓名接口
 * @author: Mr.Ye
 * @create: 2022-11-12 17:11
 **/
@RestController
@RequestMapping("/name")
public class NameController {

	@GetMapping("/get")
	public String getNameByGet( String name) {
		return "Get 你的名字是：" + name;
	}

	@PostMapping("/post")
	public String getNameByPost(@RequestParam String name) {
		return "Post 你的名字是：" + name;
	}

	@PostMapping("/user")
	public String getNameByPost(@RequestBody User user, HttpServletRequest request) {
//		String accessKey = request.getHeader("accessKey");
//		// TODO: 2022/11/12 通过accessKey在数据库查询到secretKey
//		String serverSecretKey = "abcdefg";
//		String requestParams = request.getHeader("requestParams");
//		String nonce = request.getHeader("nonce");
//		String timestamp = request.getHeader("timestamp");
//		String clientSign = request.getHeader("sign");
////		if (!"winter".equals(accessKey) && !"abcdefg".equals(secretKey)) {
////			throw new RuntimeException("无权限");
////		}
//		// TODO: 2022/11/12  校验nonce
//
//		//  校验timestamp，在5分钟之内有效
//		if (System.currentTimeMillis() > Long.valueOf(timestamp) + 5*60*1000) {
//			throw  new RuntimeException("无权限");
//		}
//		// 校验sign
//		Map<String, String> headerMap= new HashMap<>();
//		headerMap.put("accessKey", accessKey);
//		headerMap.put("requestParams", requestParams);
//		headerMap.put("nonce", nonce);
//		headerMap.put("timestamp", timestamp);
//		String serverSign = SignUtils.genSign(headerMap, serverSecretKey);
//		if (!serverSign.equals(clientSign)) {
//			throw new RuntimeException("无权限");
//		}
		return "Post 你的用户名是：" + user.getUsername();
	}
}
