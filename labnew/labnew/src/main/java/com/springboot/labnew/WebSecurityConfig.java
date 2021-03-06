package com.springboot.labnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Qualifier("userDetailsServiceImpl")
	
	@Autowired
	UserDetailsService userDetailsService;
	
    
	@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/resources/**", "/static/**", "/styles/**", "/scripts/**", "/css/**", "/js/**",
//				"/images/**");
//	}
	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	http.authorizeRequests()
	            .antMatchers("/register", "/").permitAll()
	            .antMatchers("/resources/**", "/static/**", "/styles/**", "/scripts/**", "/css/**", "/js/**",
				"/images/**").permitAll()
	            .antMatchers("/customer/edit", "/customer/delete", "/customer/new", "/customer/search","/customer/assign/**","/testing/**").hasRole("ADMIN")
	            .antMatchers("/customer/search/**", "/customer/search/edit/**", "/testing/**").hasRole("USER")
	 	        .anyRequest().authenticated()
	            .and()
	            .formLogin()
	            .loginPage("/login")
	            .loginProcessingUrl("/login")
	            .defaultSuccessUrl("/",true)
	            .permitAll()
	        	.and()
	            .logout()
	            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//	            .logoutSuccessUrl("/")
	            .permitAll();
	            
//	    	http.csrf().disable().authorizeRequests().anyRequest().permitAll();
	}
	 
		
	@Bean
	   public AuthenticationManager customAuthenticationManager() throws Exception {
	   return authenticationManager();
	    }
		
	
	 @Autowired
		public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
			auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());

		}
			


	

}
