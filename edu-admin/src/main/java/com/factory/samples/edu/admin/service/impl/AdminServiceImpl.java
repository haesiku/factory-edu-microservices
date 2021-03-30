package com.factory.samples.edu.admin.service.impl;

import org.springframework.stereotype.Service;

import com.factory.samples.edu.admin.domain.admin.entity.Admin;
import com.factory.samples.edu.admin.domain.admin.repository.AdminRepository;
import com.factory.samples.edu.admin.service.AdminService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {
	private final AdminRepository adminRepository;

	@Override
	public Admin selectAdminByEmail(String email) {
		return adminRepository.findAdminByEmail(email);
	}

}
