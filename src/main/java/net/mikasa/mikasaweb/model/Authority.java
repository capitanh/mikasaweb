package net.mikasa.mikasaweb.model;
// Generated 05-nov-2013 12:29:25 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Authority generated by hbm2java
 */
@Entity
@Table(name="authorities"
    , uniqueConstraints = @UniqueConstraint(columnNames={"username", "authority"}) 
)
public class Authority  implements java.io.Serializable {

	private static final long serialVersionUID = -5062379823861458659L;
	private AuthorityId id;
     private User user;

    public Authority() {
    }

    public Authority(AuthorityId id, User user) {
       this.id = id;
       this.user = user;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="username", column=@Column(name="username", nullable=false, length=10) ), 
        @AttributeOverride(name="authority", column=@Column(name="authority", nullable=false, length=50) ) } )
    public AuthorityId getId() {
        return this.id;
    }
    
    public void setId(AuthorityId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="username", nullable=false, insertable=false, updatable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


