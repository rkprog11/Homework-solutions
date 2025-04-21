package exercise3;
import java.util.ArrayList;

public class Inbox {
	private ArrayList<Mail> emails;
	

	public Inbox() {
		super();
		emails = new ArrayList<Mail>();
	}

	
	public String listEmails() {
		String re = "";
		for(int i = 0; i < emails.size(); i++) {
			re += emails.get(i).display();
			re += "\n";
		}
		return re;
	}
	
	public String open(int index) {
		if(index < emails.size()) {
			return emails.get(index - 1).format(); // so that the Index starts at 1 for the user
		} else {
			return "Diese Email wurde nicht gefunden!";
		}
	}
	
	public int countUnread() {
		int re = 0;
		for(int i = 0; i < emails.size(); i++) {
			if(!emails.get(i).isRead()) {
				re++;
			}
		}
		return re;
	}
	
	public void addEmail(Mail email) {
		emails.add(email);
	}

	
	public ArrayList<Mail> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<Mail> emails) {
		this.emails = emails;
	}
	
	
}
