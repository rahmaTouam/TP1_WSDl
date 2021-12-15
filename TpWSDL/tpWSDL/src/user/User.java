package user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	
	@XmlAttribute(name="userName",required = true)
	private String userName;
	@XmlAttribute(name="password",required = true)
	private String password;
public User() {
		
		
	}
	
	public User(String userName;String password) {
		
		userName= userName;
		this.password = password;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUsername(String userName){
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
