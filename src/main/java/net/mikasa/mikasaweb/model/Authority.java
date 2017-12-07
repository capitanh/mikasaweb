package net.mikasa.mikasaweb.model;

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
   
    public AuthorityId getId() {
        return this.id;
    }
    
    public void setId(AuthorityId id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }




}


