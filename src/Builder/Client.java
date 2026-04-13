package Builder;

public class Client {
    void main(){
        User user = new User.Builder()
                .firstName("Balaji")
                .lastName("B")
                .dob("1998")
                .id(101)
                .build();
        System.out.println(user.getDob());
    }
}
