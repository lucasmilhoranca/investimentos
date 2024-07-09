package tech.run.investimentos.service;

import org.springframework.stereotype.Service;
import tech.run.investimentos.controller.dto.CreateStockDto;
import tech.run.investimentos.entity.Stock;
import tech.run.investimentos.repository.StockRepository;

@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public void createStock(CreateStockDto createStockDto) {

        var stock = new Stock(
                createStockDto.stockId(),
                createStockDto.description()
        );

        stockRepository.save(stock);
    }
}
