package tech.run.investimentos.client.dto;

import java.util.List;

public record BrapiResponseDto(List<StockDto> results) {
}
