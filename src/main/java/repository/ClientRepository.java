package repository;

import model.Client;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientRepository {
    Client save(Client client);
    Optional<Client> findByUser(UUID userId);
    Client findById(UUID id);
    List<Client> findAll();
    void delete(UUID id);
}
