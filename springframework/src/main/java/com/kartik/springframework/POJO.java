package com.kartik.springframework;

public class POJO {  
	private int stud_id;//getters and setters
  private String stud_name;
  private String stud_address;
  public POJO(int stud_id, String stud_name, String stud_address) {
	super();
	this.stud_id = stud_id;
	this.stud_name = stud_name;
	this.stud_address = stud_address;
  }
   public int getStud_id() {
	return stud_id;
   }
   public void setStud_id(int stud_id) {
	this.stud_id = stud_id;
   }
   public String getStud_name() {
	return stud_name;
   }
    public void setStud_name(String stud_name) {
	this.stud_name = stud_name;
   }
   public String getStud_address() {
   	return stud_address;
   }
   public void setStud_address(String stud_address) {
	this.stud_address = stud_address;
   }
   public POJO() {
	super();
   }
@Override
public String toString() {
	return "POJO [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_address=" + stud_address + "]";
}
  
  
}
