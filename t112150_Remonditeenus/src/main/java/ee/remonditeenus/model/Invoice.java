package main.java.ee.remonditeenus.model;

public class Invoice {
	private int id;
//	invoice_status_type_fk
//	service_order_fk
//	customer_fk
	private String invoice_date;
	private String due_date;
	private double price_total;
	private String receiver_name;
	private String reference_number;
	private String receiver_accounts;
	private String payment_date;
	private String description;
}
