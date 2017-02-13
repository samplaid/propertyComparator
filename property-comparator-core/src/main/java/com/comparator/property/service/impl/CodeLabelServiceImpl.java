/**
 * 
 */
package com.comparator.property.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comparator.property.model.CodeLabel;
import com.comparator.property.repository.CodeLabelRepository;
import com.comparator.property.service.CodeLabelService;

/**
 * @author xqv66
 *
 */
@Component
public class CodeLabelServiceImpl implements CodeLabelService {

	@Autowired
	private CodeLabelRepository codeLabelRepository;

	public List<CodeLabel> retrieveAllCodeLabels() {
		return codeLabelRepository.findAll();
	}
}
