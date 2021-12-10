package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.StockRepository;
@Service
public class StockServiceImpl implements StockService{
	@Autowired
	StockRepository sr;
	private List<Stock> stocks;
	@Override
	public List<Stock> retrieveAllStocks() {
		stocks = new ArrayList<Stock>();
		sr.findAll().forEach(e->stocks.add(e));
		return stocks;
	}

	@Override
	public Stock addStock(Stock s) {
		System.out.print("amineeeeeeeeeeeee");

		System.out.print(s.getLibelleStock());
		return 		sr.save(s);

	}

	@Override
	public Stock updateStock(Stock u) {
		sr.save(u);
		return null;
	}

	@Override
	public Stock retrieveStock(Long id) {
		Stock s =sr.findById(id).get();
		return s;
	}

	@Override
	public void deleteStock(Long id) {
		Stock s = sr.findById(id).get();
		sr.delete(s);
		
	}

}
