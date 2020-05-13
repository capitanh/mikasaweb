package net.mikasa.mikasaweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
  
  //Get config from application.properties
  @Value("${ldap.url}")
  private String ldapUrl;
  
  @Value("${ldap.basedn}")
  private String ldapBaseDn;
  
  @Value("${ldap.username}")
  private String ldapUserName;
  
  @Value("${ldap.password}")
  private String ldapPassword;
  
  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    
    auth.ldapAuthentication()
      .contextSource().url(ldapUrl + ldapBaseDn)
      .managerDn(ldapUserName)
      .managerPassword(ldapPassword)
      .and()
      .userSearchBase("ou=people")
      .userSearchFilter("(uid={0})");
  }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
				.antMatchers("/resources/**","/webjars/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll();
	}
	
}
