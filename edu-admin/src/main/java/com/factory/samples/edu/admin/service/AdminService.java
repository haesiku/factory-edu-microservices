package com.factory.samples.edu.admin.service;

import com.factory.samples.edu.admin.domain.admin.entity.Admin;

public interface AdminService {
	Admin selectAdminByEmail(String email);
}
