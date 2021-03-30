package com.factory.samples.edu.admin.controller.mapper;

import org.mapstruct.Mapper;

import com.factory.samples.edu.admin.app.util.mapper.EntityMapper;
import com.factory.samples.edu.admin.domain.admin.dto.AdminDto;
import com.factory.samples.edu.admin.domain.admin.entity.Admin;

@Mapper
public interface AdminMapper extends EntityMapper<AdminDto, Admin> {
}
