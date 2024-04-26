package lv.venta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.model.Product;
import lv.venta.repo.IProductRepo;
import lv.venta.service.IProductFilteringService;

@SpringBootApplication
public class Seminar5Application {

	public static void main(String[] args) {
		SpringApplication.run(Seminar5Application.class, args);
	}
	@Bean
	public CommandLineRunner testDatabase(IProductRepo productRepo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				Product p1 = new Product("apple", "Red", 0.99f, 5);
				Product p2 = new Product("Tomatoes", "Red", 1.50f, 10);
				Product p3 = new Product("Watermelon", "Green", 2.99f, 5);
				productRepo.save(p1);
				productRepo.save(p2);
				productRepo.save(p3);
				
				
				// TODO Auto-generated method stub
				
				
			}
		};
		
	}
}
