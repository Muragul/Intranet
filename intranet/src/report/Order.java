package report;
import java.util.Date;

import enums.*;

public class Order extends Report {
    private CheckStatus checkStatus;
    private ConfirmationStatus confirmationStatus;
    
    public Order() {}
	public Order(String text, String title, Date time, CheckStatus checkStatus, ConfirmationStatus confirmationStatus) {
		super(text, title, time);
		this.checkStatus = checkStatus;
		this.confirmationStatus = confirmationStatus;
	}
	@Override
	public String toString() {
		return "Order [checkStatus=" + checkStatus + ", confirmationStatus=" + confirmationStatus + ", Text="
				+ getText() + ", Title=" + getTitle() + ", Time=" + getTime() + "]";
	}
    
}

