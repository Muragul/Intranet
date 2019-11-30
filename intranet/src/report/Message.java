package report;
import java.util.Date;

import enums.*;

public class Message extends Report {
    public CheckStatus checkStatus;

    public Message() {}
	public Message(String text, String title, Date time, CheckStatus checkStatus) {
		super(text, title, time);
		this.checkStatus = checkStatus;
	}
	@Override
	public String toString() {
		return "Message [checkStatus=" + checkStatus + ", Text=" + getText() + ", Title=" + getTitle()
				+ ", Time=" + getTime() + "]";
	}
	
	   
    
}

