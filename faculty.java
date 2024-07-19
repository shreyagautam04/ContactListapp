public class Faculty extends Contact {
    String subject;
    public Faculty(String name, String nickname, String phonenumber, String subject,String email) {
        super(name, nickname, phonenumber,email);
        this.subject = subject;
    }
}
