package devbuy_web;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dev4free.devbuy.devbuyWeb.poCustom.OrderStatusCustom;
import com.dev4free.devbuy.devbuyWeb.poCustom.OrdersCustom;
import com.dev4free.devbuy.devbuyWeb.service.OrderStatusService;
import com.dev4free.devbuy.devbuyWeb.service.OrdersService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(
		locations = { 
		"classpath:/spring/applicationContext-dao.xml",  
		"classpath:/spring/applicationContext-service.xml", 
		"classpath:/spring/applicationContext-transaction.xml",
		"classpath:/spring/springmvc.xml"
		}
		)

public class TestOrderStatusService {

	
	
	@Autowired
	OrdersService ordersService;
    private static final Logger LOGGER = Logger.getLogger(TestOrderStatusService.class);  
	
	
	
	
	@Test
	public void queryAllOrderStatus(){
		
		
	List<OrdersCustom> ordersCustoms1 = ordersService.queryAllOrders();
	System.out.println("ordersCustoms1=" + ordersCustoms1);
	System.out.println("ordersCustoms1=" + ordersCustoms1);
		
	}
	
	
}
