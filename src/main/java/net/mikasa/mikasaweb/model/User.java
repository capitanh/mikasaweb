package net.mikasa.mikasaweb.model;
// Generated 05-nov-2013 12:29:25 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="users")
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
   
    @Id 
    @Column(name="username", unique=true, nullable=false, length=10)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="password", nullable=false, length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="enabled", nullable=false, precision=22, scale=0)
    public BigDecimal getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")
    public Set<Authority> getAuthorities() {
        return this.authorities;
    }
    
    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }




}


