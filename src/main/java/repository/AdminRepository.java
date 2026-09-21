package repository;
import model.Admin;
import model.Client;

import java.util.Optional;
import java.util.UUID;

public interface AdminRepository {
    Admin save(Admin admin);
Optional<Admin> findByUserId(UUID userId);
}
