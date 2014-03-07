package com.kovitad.services;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import org.springframework.stereotype.Component;
import com.kovitad.domain.Product;

@WebService(serviceName="SearchProductWs")
@SOAPBinding(style=Style.RPC)
@Component(value="productSearchingService")
public class ProductWebServiceExample {
	com.opensymphony.xwork2.util.logging.Logger logger = com.opensymphony.xwork2.util.logging.LoggerFactory.getLogger(ProductWebServiceExample.class);
	private List<Product> products = new ArrayList<>();
	
	@PostConstruct
	public void init(){
		products.add(new Product("Product A", "http://kovitad.com/A.jgp", null));
		products.add(new Product("Product B", "http://kovitad.com/B.jgp", null));
		products.add(new Product("Product C", "http://kovitad.com/B.jgp", null));
		logger.info("Done !");
	}
	
	public List<Product> listAll(){
		return products;
	}
}
