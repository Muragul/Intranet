package report;

import java.util.Date;

public class News extends Report {
	public News() {}
	
	public News(String text, String title, Date time) {
		super(text, title, time);
	}

	@Override
	public String toString() {
		return "News [getText()=" + getText() + ", getTitle()=" + getTitle() + ", getTime()=" + getTime() + "]";
	}
	
	
}
