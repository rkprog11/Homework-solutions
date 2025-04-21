package exercise3;

public class E3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inbox myInbox = new Inbox();
		Mail mail1 = new Mail("Person 1", "Betreff 1", "Message 1", "21.04.2025");
		Mail mail2 = new Mail("Person 2", "Betreff 2", "Message 2", "21.04.2025");
		myInbox.addEmail(mail1);
		myInbox.addEmail(mail2);
		System.out.println(myInbox.listEmails());
		System.out.println(myInbox.countUnread());
		System.out.println(myInbox.open(1));
		mail1.markAsRead();
		System.out.println(myInbox.listEmails());
		System.out.println(myInbox.countUnread());
	}

}
