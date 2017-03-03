package com.search.engine.property.core.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.engine.property.core.persistence.entity.SomethingEntity;

@Repository
public interface SomethingRepository extends JpaRepository<SomethingEntity, String> {

	public List<SomethingEntity> findByName(String name);

}