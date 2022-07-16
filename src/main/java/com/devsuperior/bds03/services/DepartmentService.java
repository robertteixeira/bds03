package com.devsuperior.bds03.services;

import java.util.List;

import com.devsuperior.bds03.dto.DepartmentDTO;
import com.devsuperior.bds03.entities.Department;
import com.devsuperior.bds03.repositories.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public List<DepartmentDTO> findAll() {
		List<Department> list = repository.findAll(Sort.by("name"));
		return list.stream().map(DepartmentDTO::new).toList();
	}
}
