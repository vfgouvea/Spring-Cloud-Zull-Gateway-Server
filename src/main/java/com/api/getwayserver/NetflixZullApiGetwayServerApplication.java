package com.api.getwayserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient //ativa para que o eureka consiga descobrir a aplicaçao
@SpringBootApplication
public class NetflixZullApiGetwayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZullApiGetwayServerApplication.class, args);
	}

	//Serve para rastrear a requisiçao, assim , se der pau pelo caminho eu sei onde deu
	//2020-03-20 13:27:05.384  INFO [netflix-zuul-api-getway-server,8cb1b72d5e9fcf99,47c62d573523d2d8,true] id-> 8cb1b72d5e9fcf99
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
