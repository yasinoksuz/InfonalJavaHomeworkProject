package main.java.org.yasin.infonal.model;

public class ResponseJson {
	private Status status;
	private Object data;
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus (Status status) {
		this.status = status;
	}
	
	public Object getData(){
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}

}
