package org.ironrhino.sample.crud;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.ironrhino.common.model.Region;
import org.ironrhino.core.metadata.UiConfig;

@Embeddable
public class CustomerAddress implements Serializable {

	private static final long serialVersionUID = -2175577393105618397L;

	@UiConfig(width = "150px", cssClass = "input-medium decrease")
	@Enumerated
	@Column(nullable = false)
	private AddressType type;

	@UiConfig(width = "150px", template = "<#if value??>${value.fullname}</#if>", description = "region.description")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region")
	private Region region;

	@UiConfig(cssClass = "input-xxlarge")
	private String address;

	public AddressType getType() {
		return type;
	}

	public void setType(AddressType type) {
		this.type = type;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}