package com.zzx.activemq;

import com.zzx.activemq.activemq_initial.PTPReceive;
import com.zzx.activemq.activemq_initial.PTPSend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		PTPSend send = new PTPSend();
		send.start();
		PTPReceive receive = new PTPReceive();
		receive.start();



		SpringApplication.run(CustomerApplication.class, args);
	}
}
