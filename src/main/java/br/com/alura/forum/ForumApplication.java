package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSpringDataWebSupport //Para ativar a ordenação e paginação no spring http://localhost:8080/topicos/?page=0&size=10&sort=id,desc
@EnableCaching // Habilitar o modulo de cache na aplicação
@EnableSwagger2 // Habilitar o modulo de Swagger
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
