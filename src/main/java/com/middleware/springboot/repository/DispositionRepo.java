package com.middleware.springboot.repository;

import com.middleware.springboot.entity.Disposition;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface DispositionRepo extends CrudRepository<Disposition, UUID> {
	List<Disposition> findAll();

}