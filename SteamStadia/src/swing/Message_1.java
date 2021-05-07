package swing;

import java.io.Serializable;

public class Message_1 implements Serializable{
    
    private static final long serialVersionUID = 1L;
    public String type, sender, content, recipient;
    
    public Message_1(String type, String sender, String content, String recipient){
        this.type = type; this.sender = sender; this.content = content; this.recipient = recipient;
    }
    
    @Override
    public String toString(){
        return "{type='"+type+"', sender='"+sender+"', content='"+content+"', recipient='"+recipient+"'}";
    }
}
