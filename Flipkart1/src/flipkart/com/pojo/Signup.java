package flipkart.com.pojo;

/**
 * @author pyadav16
 *
 */
public class Signup 
{
	
	private String email;
	
	private int password;
	private int reppass;
	
	
	public Signup(String email, int password, int reppass) {
		super();
		this.email = email;
		this.password = password;
		this.reppass = reppass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getReppass() {
		return reppass;
	}
	
	public Signup() {
		super();
	}
	public void setReppass(int reppass) {
		this.reppass = reppass;
	}
	@Override
	public String toString() {
		return "Signup [email=" + email + ", password=" + password + ", reppass=" + reppass + "]";
	}
	
	
	
	
	
}