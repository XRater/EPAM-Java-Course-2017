package chat;

abstract class Message {

    private final ChatSession session;
    private final String message;

    public Message(ChatSession session, String message) {
        this.session = session;
        this.message = message;
    }

    public ChatSession getSession() {
        return session;
    }

    public String getMessage() {
        return message;
    }

}
