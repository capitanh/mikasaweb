package net.mikasa.mikasaweb.model;

public class AuthorityId  implements java.io.Serializable {

	private static final long serialVersionUID = 1515333905247907245L;
	private String username;
     private String authority;

    public AuthorityId() {
    }

    public AuthorityId(String username, String authority) {
       this.username = username;
       this.authority = authority;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return this.authority;
    }
    
    public void setAuthority(String authority) {
        this.authority = authority;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AuthorityId) ) return false;
		 AuthorityId castOther = ( AuthorityId ) other; 
         
		 return ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
 && ( (this.getAuthority()==castOther.getAuthority()) || ( this.getAuthority()!=null && castOther.getAuthority()!=null && this.getAuthority().equals(castOther.getAuthority()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
         result = 37 * result + ( getAuthority() == null ? 0 : this.getAuthority().hashCode() );
         return result;
   }   


}


