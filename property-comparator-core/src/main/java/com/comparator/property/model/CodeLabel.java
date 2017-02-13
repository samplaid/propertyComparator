/**
 * 
 */
package com.comparator.property.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "code_labels")
public class CodeLabel {

	@EmbeddedId
	private CodeLabelPK id;

	@Column(name = "label")
	private String label;

	public CodeLabelPK getId() {
		return id;
	}

	public void setId(CodeLabelPK id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
