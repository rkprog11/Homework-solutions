package exercise3;

public class Mail {
	private String sender, subjekt, message, datetime;
	private boolean isRead;
	
	public Mail(String sender, String subjekt, String message, String datetime) {
		super();
		this.sender = sender;
		this.subjekt = subjekt;
		this.message = message;
		this.datetime = datetime;
		this.isRead = false; 			//default: set a new mail to unread
	}
	
	public String format() {
		return subjekt + " from " + sender + " on " + datetime + ": " + message;
	}
	
	public String display() {
		return isRead + " | " + subjekt + " | " + sender + " | " + datetime;
	}
	
	public void markAsRead() {
		this.isRead = true;
	}
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSubjekt() {
		return subjekt;
	}
	public void setSubjekt(String subjekt) {
		this.subjekt = subjekt;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public boolean isRead() {
		return isRead;
	}
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	
	
}
