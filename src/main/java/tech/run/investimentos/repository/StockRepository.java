package tech.run.investimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.run.investimentos.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
}
