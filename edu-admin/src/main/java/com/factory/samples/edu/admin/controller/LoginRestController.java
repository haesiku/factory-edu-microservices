package com.factory.samples.edu.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factory.samples.edu.admin.controller.mapper.AdminMapper;
import com.factory.samples.edu.admin.domain.admin.dto.AdminDto;
import com.factory.samples.edu.admin.domain.admin.dto.LoginDto;
import com.factory.samples.edu.admin.domain.admin.entity.Admin;
import com.factory.samples.edu.admin.service.AdminService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class LoginRestController {
	private final AdminService adminService;
	
	private final AdminMapper adminMapper;
	
	@PostMapping("/login")
    public ResponseEntity<AdminDto> login(@RequestBody LoginDto loginDto){
        Admin admin = adminService.selectAdminByEmail(loginDto.getEmail());
        return ResponseEntity.ok().body(adminMapper.toDto(admin));
    }
}
