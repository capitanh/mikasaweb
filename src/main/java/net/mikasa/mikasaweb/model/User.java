package net.mikasa.mikasaweb.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable {

	private static final long serialVersionUID = -7865444145987849091L;
	private String username;
	private String password;
	private BigDecimal enabled;
	private Set<Authority> authorities = new HashSet<Authority>(0);

    public User() {
    }
	
    public User(String username, String password, BigDecimal enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }
    public User(String username, String password, BigDecimal enabled, Set<Authority> authorities) {
       this.username = username;
       this.password = password;
       this.enabled = enabled;
       this.authorities = authorities;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public BigDecimal getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
    }
    
    public Set<Authority> getAuthorities() {
        return this.authorities;
    }
    
    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }




}


