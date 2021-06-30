package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			UserBuilder users = User.withDefaultPasswordEncoder();
			auth.inMemoryAuthentication()
			.withUser(users.username("Harish").password("Hh@123").roles("RECRUITER"))
			.withUser(users.username("Deepak").password("Dd@123").roles("JOBSEEKER"))
			.withUser(users.username("Mukesh").password("Mm@123").roles("ADMIN"));
	}
	
	
}
