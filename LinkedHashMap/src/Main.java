import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Message firstMsg = new Message(992852001L,"Hi","Tilek","Dastan");
        Message secondMsg = new Message(992852002L,"What's up!","Dastan","Tilek");
        Message thirdMsg = new Message(992852003L,"How re u?", "Tilek","Dastan");
        Message fourthMsg = new Message(992852004L,"Sry, but I'm busy now. I'll call u later.","Dastan","Tilek");
        Message fifthMsg = new Message(992852005L,"Got u.","Tilek","Dastan");
        Message sixthMsg = new Message(992852006L, "Buy milk", "Sam", "Tom");
        Message seventhMsg = new Message(992852007L, "Ok", "Tom", "Sam");
        Message eighthMsg = new Message(992852007L, "See u", "Sam", "Tom");
        LinkedHashMap<Integer, Message> messages = new LinkedHashMap<>();
        messages.put(1,firstMsg);
        messages.put(2,secondMsg);
        messages.put(3,thirdMsg);
        messages.put(4,fourthMsg);
        messages.put(5,fifthMsg);
        messages.put(8,eighthMsg);
        messages.put(6,sixthMsg);
        messages.put(7,seventhMsg);
        System.out.println(messages);

        LinkedHashMap<Integer, Message> msgAccsOrdr = new LinkedHashMap<>(16,0.75f,true);
        msgAccsOrdr.put(35,fifthMsg);
        msgAccsOrdr.put(31,firstMsg);
        msgAccsOrdr.put(33,thirdMsg);
        msgAccsOrdr.put(36,sixthMsg);
        msgAccsOrdr.put(38,eighthMsg);
        msgAccsOrdr.put(37,seventhMsg);
        msgAccsOrdr.put(34,fourthMsg);
        msgAccsOrdr.put(32,secondMsg);
        System.out.println(msgAccsOrdr);
        Message v = msgAccsOrdr.get(33);
        v = msgAccsOrdr.get(35);
        v = msgAccsOrdr.get(37);
        System.out.println(msgAccsOrdr);
    }
}
