package com.kingtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kingtree.entity.House;
import com.kingtree.service.HouseService;

@Controller
public class HouseController {

	@Reference
	private HouseService houseService;

	@ResponseBody
	@RequestMapping("/house/get/{id}")
	public House get(@PathVariable int id) throws Exception {
		return houseService.get(id);
	}

}
