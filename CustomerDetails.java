import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerDetails implements Serializable {
	private  String name,sex,add, phno,email;
	char[] pass;

	public CustomerDetails(String name, String sex, String add, String phno, String email,char[] pass) {
		super();
		this.name = name;
    this.sex = sex;
		this.add = add;
		this.phno = phno;
		this.email = email;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  
  public String geSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char[]  getPass() {
		return pass;
	}

	public void setPass(char[] pass) {
		this.pass = pass;
	}
	

}
