package tn.esprit.spring.service;
import java.util.List;

import tn.esprit.spring.entity.Stock;;

public interface StockService {

	Stock addStock(Stock s);

	Stock updateStock(Stock u);
	List<Stock> retrieveAllStocks();

	Stock retrieveStock(Long id);
	void deleteStock(Long id);

}
