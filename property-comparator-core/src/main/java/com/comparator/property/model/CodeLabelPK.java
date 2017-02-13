/**
 * 
 */
package com.comparator.property.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author xqv66
 *
 */
@Embeddable
public class CodeLabelPK implements Serializable {

	private static final long serialVersionUID = 3474115123351125238L;

	@Column(name = "code")
	private String code;
	
	@Column(name = "value")
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
