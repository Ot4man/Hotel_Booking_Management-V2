package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(UUID id,
                 String fullName,
                 String email,
                 String phone,
                 String passwordHash,
                 String salt,
                 LocalDateTime createdAt) {

        super(
                id,
                fullName,
                email,
                phone,
                passwordHash,
                salt,
                createdAt
        );
    }

    public void manageRooms() {
        System.out.println("Admin can manage room");
    }


}