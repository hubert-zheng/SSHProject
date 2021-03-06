package com.hand.Entity;
// Generated 2015-9-20 12:53:22 by Hibernate Tools 3.4.0.CR1

/**
 * Payment generated by hbm2java
 */
public class Payment implements java.io.Serializable {

	private Integer paymentId;
	private Customer customer;
	private String invoiceGroup;
	private String currency;
	private String paymentTerm;
	private String priceIterm1;
	private String priceIterm2;
	private String priceIterm3;
	private String markupName;
	private String discountName;

	public Payment() {
	}

	public Payment(Customer customer, String currency, String paymentTerm, String markupName, String discountName) {
		this.customer = customer;
		this.currency = currency;
		this.paymentTerm = paymentTerm;
		this.markupName = markupName;
		this.discountName = discountName;
	}

	public Payment(Customer customer, String invoiceGroup, String currency, String paymentTerm, String priceIterm1,
			String priceIterm2, String priceIterm3, String markupName, String discountName) {
		this.customer = customer;
		this.invoiceGroup = invoiceGroup;
		this.currency = currency;
		this.paymentTerm = paymentTerm;
		this.priceIterm1 = priceIterm1;
		this.priceIterm2 = priceIterm2;
		this.priceIterm3 = priceIterm3;
		this.markupName = markupName;
		this.discountName = discountName;
	}

	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getInvoiceGroup() {
		return this.invoiceGroup;
	}

	public void setInvoiceGroup(String invoiceGroup) {
		this.invoiceGroup = invoiceGroup;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentTerm() {
		return this.paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getPriceIterm1() {
		return this.priceIterm1;
	}

	public void setPriceIterm1(String priceIterm1) {
		this.priceIterm1 = priceIterm1;
	}

	public String getPriceIterm2() {
		return this.priceIterm2;
	}

	public void setPriceIterm2(String priceIterm2) {
		this.priceIterm2 = priceIterm2;
	}

	public String getPriceIterm3() {
		return this.priceIterm3;
	}

	public void setPriceIterm3(String priceIterm3) {
		this.priceIterm3 = priceIterm3;
	}

	public String getMarkupName() {
		return this.markupName;
	}

	public void setMarkupName(String markupName) {
		this.markupName = markupName;
	}

	public String getDiscountName() {
		return this.discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

}
