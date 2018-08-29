package procancha.app.login.util;

import java.util.ArrayList;
import java.util.List;

public class ResponseMessage {
	
	 private List<String> messages = new ArrayList<>();
	    private int code;
	    private List<Object> objects = new ArrayList<>();

	    public ResponseMessage() {
	        objects = new ArrayList<>();
	    }

	    public List<String> getMessages() {
	        return messages;
	    }

	    public void setMessages(List<String> messages) {
	        this.messages = messages;
	    }

	    public void addMessage(String ... messages) {
	        for (String message : messages){
	            if(message!=null){
	                this.messages.add(message);
	            }
	        }
	    }

	    public int getcode() {
			return code;
		}

		public void setcode(int code) {
			this.code = code;
		}

		public List<Object> getObjects() {
	        return objects;
	    }

	    public void setObjects(List<Object> objects) {
	        this.objects = objects;
	    }

	    public void addObject(Object ... objects) {
	        for (Object object : objects){
	            if(object!=null){
	                this.objects.add(object);
	            }
	        }
	    }    

}
