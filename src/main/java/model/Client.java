package model;
import  java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Client  extends  User{
    public Client(){
        super();
    }
    public Client(UUID id, String fullName, String email, String phone, String passwordHash, String salt, LocalDateTime createdAt) {
        super(id,fullName,email,phone,passwordHash,salt,createdAt);
    }
public void reserbation(){
    System.out.println("client reservation");
}

}
