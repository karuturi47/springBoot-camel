package com.veera.boot.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouting  extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:C://inputFolder?noop=true").to("file:C://outputFolder");
		
	}

}
