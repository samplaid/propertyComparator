/**
 * 
 */
package com.comparator.property.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.comparator.property.model.CodeLabel;

/**
 * @author xqv66
 *
 */
public interface CodeLabelRepository extends JpaRepository<CodeLabel, Integer> {

	@Query("SELECT c FROM CodeLabel c WHERE LOWER(c.id.code) = LOWER(:code)")
	public List<CodeLabel> findByCode(@Param("code") String code);
}
