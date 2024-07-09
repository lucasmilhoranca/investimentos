package tech.run.investimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.run.investimentos.entity.BillingAddress;

import java.util.UUID;

public interface BillingAddressRepository extends JpaRepository<BillingAddress, UUID> {
}
