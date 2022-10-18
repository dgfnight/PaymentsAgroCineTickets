package Grupo1.PaymentsAgroCineTickets.repository;

import Grupo1.PaymentsAgroCineTickets.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<Transaction, UUID> {
}
