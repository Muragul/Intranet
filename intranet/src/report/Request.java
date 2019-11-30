package report;
import enums.*;

public class Request {
    private RequestType requestType;
    private CheckStatus checkStatus;
    private ConfirmationStatus confirmationStatus;
    
    public Request() {}
	public Request(RequestType requestType, CheckStatus checkStatus, ConfirmationStatus confirmationStatus) {
		super();
		this.requestType = requestType;
		this.checkStatus = checkStatus;
		this.confirmationStatus = confirmationStatus;
	}
	public RequestType getRequestType() {
		return requestType;
	}
	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}
	public CheckStatus getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(CheckStatus checkStatus) {
		this.checkStatus = checkStatus;
	}
	public ConfirmationStatus getConfirmationStatus() {
		return confirmationStatus;
	}
	public void setConfirmationStatus(ConfirmationStatus confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}
    
	
    
}

