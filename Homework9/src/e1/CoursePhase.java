package e1;

public enum CoursePhase {
	NOT_STARTED("Course not started yet"),
	ONGOING("Couse is in Progress"),
	FINISHED("Course has ended");

	private String message;
	
	CoursePhase(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
