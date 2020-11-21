import java.time.LocalDateTime;

public class Message {

    private long id;
    private String msg;
    private LocalDateTime sentDate;
    private LocalDateTime readDate;
    private String sender;
    private String receiver;

    public Message(long id, String msg, String sender, String receiver) {
        this.id = id;
        this.msg = msg;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Message(){

    }

    public long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

}
