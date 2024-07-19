public class Contact {
    long id;
    String name;
    String nickname;
    String phonenumber;
    String email;
    public Contact(String name, String nickname, String phonenumber, String email) {
        this.name = name;
        this.nickname = nickname;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phonenumber=" + phonenumber + '\'' +
                ", email='" + email +
                '}';
    }

    public long getId() {
        return id;
    }
}
