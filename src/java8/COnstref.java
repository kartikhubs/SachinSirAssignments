package java8;
interface hero{
	Message getMessage(String s);
}
class Message{
	Message(String str){
		System.out.println(str);
	}
}
public class COnstref {
	public static void main(String args[]) {
		hero obj=Message::new;
		obj.getMessage("HELLLLLLLO");
	}

}
