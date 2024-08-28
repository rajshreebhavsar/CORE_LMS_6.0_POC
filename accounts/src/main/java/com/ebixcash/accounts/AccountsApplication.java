package com.ebixcash.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.ebixcash.accounts.controller") })
@EnableJpaRepositories("com.ebixcash.accounts.repository")
@EntityScan("com.ebixcash.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableAspectJAutoProxy
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ebixcash",
						email = "nayan.d@ebixcash.com",
						url = "https://www.ebixcash.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.ebixcash.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Accounts microservice REST API Documentation",
				url = "https://www.ebixcash.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
