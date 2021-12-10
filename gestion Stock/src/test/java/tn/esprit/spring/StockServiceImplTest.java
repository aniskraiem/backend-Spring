package tn.esprit.spring;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entity.Stock;

import tn.esprit.spring.service.StockService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceImplTest {
	@Autowired
	StockService stockService;
	@Test
	public void testAddStock() {
		List<Stock> stocks = stockService.retrieveAllStocks();
		int expected=stocks.size()+1;
		Stock s = new Stock(10,100,"stock test");
		Stock savedStock= stockService.addStock(s);
		int realValue=stockService.retrieveAllStocks().size();
		assertEquals(expected,realValue);
		assertNotNull(savedStock.getLibelleStock());
		stockService.deleteStock(savedStock.getIdIdStock());
	}
	@Test
	public void testDeleteStck(){
		List<Stock> stocks = stockService.retrieveAllStocks();
		int expected=stocks.size();
		Long idtodelete = stocks.get(1).getIdIdStock();
		stockService.deleteStock(idtodelete);
		assertEquals(expected-1, stockService.retrieveAllStocks().size());
		
		
	}
}
