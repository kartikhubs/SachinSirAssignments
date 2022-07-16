package newspring;
import java.util.*;
public class Boot {
  private String name;
  private List<String> phonesl;
  private Set<String>address;
  private Map<String,String>courses;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhonesl() {
	return phonesl;
}
public void setPhonesl(List<String> phonesl) {
	this.phonesl = phonesl;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public Boot(String name, List<String> phonesl, Set<String> address, Map<String, String> courses) {
	super();
	this.name = name;
	this.phonesl = phonesl;
	this.address = address;
	this.courses = courses;
}

public Boot() {
	super();
}
@Override
public String toString() {
	return "Boot [name=" + name + ", phonesl=" + phonesl + ", address=" + address + ", courses=" + courses + "]";
}
  
  
}
