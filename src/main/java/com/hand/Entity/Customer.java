package com.hand.Entity;
// Generated 2015-9-17 13:05:17 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer customerId;
	private Organization organization;
	private String customerCode;
	private String type;
	private String groupCompany;
	private String corporation;
	private String customerName;
	private Set payments = new HashSet(0);
	private Set omSpecialDiscounts = new HashSet(0);
	private Address address;
	private Set priceconfigs = new HashSet(0);
	private Linkman linkman;
	private Set onDiscountAppliedRecordses = new HashSet(0);
	private Set omNormalDiscounts = new HashSet(0);

	public Customer() {
	}

	public Customer(Organization organization, String customerCode, String type, String customerName) {
		this.organization = organization;
		this.customerCode = customerCode;
		this.type = type;
		this.customerName = customerName;
	}

	public Customer(Organization organization, String customerCode, String type, String groupCompany,
			String corporation, String customerName, Set payments, Set omSpecialDiscounts, Address address,
			Set priceconfigs, Linkman linkman, Set onDiscountAppliedRecordses, Set omNormalDiscounts) {
		this.organization = organization;
		this.customerCode = customerCode;
		this.type = type;
		this.groupCompany = groupCompany;
		this.corporation = corporation;
		this.customerName = customerName;
		this.payments = payments;
		this.omSpecialDiscounts = omSpecialDiscounts;
		this.address = address;
		this.priceconfigs = priceconfigs;
		this.linkman = linkman;
		this.onDiscountAppliedRecordses = onDiscountAppliedRecordses;
		this.omNormalDiscounts = omNormalDiscounts;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGroupCompany() {
		return this.groupCompany;
	}

	public void setGroupCompany(String groupCompany) {
		this.groupCompany = groupCompany;
	}

	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

	public Set getOmSpecialDiscounts() {
		return this.omSpecialDiscounts;
	}

	public void setOmSpecialDiscounts(Set omSpecialDiscounts) {
		this.omSpecialDiscounts = omSpecialDiscounts;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set getPriceconfigs() {
		return this.priceconfigs;
	}

	public void setPriceconfigs(Set priceconfigs) {
		this.priceconfigs = priceconfigs;
	}

	public Linkman getLinkman() {
		return this.linkman;
	}

	public void setLinkman(Linkman linkman) {
		this.linkman = linkman;
	}

	public Set getOnDiscountAppliedRecordses() {
		return this.onDiscountAppliedRecordses;
	}

	public void setOnDiscountAppliedRecordses(Set onDiscountAppliedRecordses) {
		this.onDiscountAppliedRecordses = onDiscountAppliedRecordses;
	}

	public Set getOmNormalDiscounts() {
		return this.omNormalDiscounts;
	}

	public void setOmNormalDiscounts(Set omNormalDiscounts) {
		this.omNormalDiscounts = omNormalDiscounts;
	}

}
