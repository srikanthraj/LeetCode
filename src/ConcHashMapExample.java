import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcHashMapExample {

	static Map<String,Long> orders = new ConcurrentHashMap<>();
	
	static void processOrders() {
		
		for(String city:orders.keySet()) {
			for(int i =0;i<50;i++) {
				Long oldOrder = orders.get(city);
				orders.put(city, oldOrder+1);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		orders.put("Delhi", 10l);
		orders.put("Mumbai", 10l);
		orders.put("NY", 10l);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(ConcHashMapExample::processOrders);
		service.submit(ConcHashMapExample::processOrders);
		
		service.awaitTermination(1, TimeUnit.SECONDS);
		
		service.shutdown();
		System.out.println(orders);
	}
}
