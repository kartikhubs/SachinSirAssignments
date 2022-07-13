package linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Linked {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer>list=new LinkedList<Integer>();          
		Iterator<Integer>it=list.iterator();

		System.out.println("Enter elements in the list:");
		for(int i=0;i<10;i++) {
			list.add(sc.nextInt());                //add() method
		}
		
		System.out.println("CUrrent list is :"+list);
		System.out.println("---------------------------------------------------");
		
		System.out.println("Removing first and last element");
		list.pollFirst();
		list.pollLast();
		
		System.out.println("Enter the position you want to insert:");
		int pos=sc.nextInt();
		list.add(pos,78);            //ad(index,element) method
		
		System.out.println("Now the list is :"+list);
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("Adding at first and last position of list using inbuilt method:");
		list.addFirst(100);            //addFirst()
		                                 
		list.addLast(890);             //addLast()*/
		
		System.out.println("Now the list is :"+list);
		
		System.out.println("----------------------------------------------");
		
		
		System.out.println("Now the list is:"+list);
		

		
		System.out.println("The size of linkedlist is:");
		System.out.println(list.size());
		
		System.out.println("--------------------------------------------");
		System.out.println("Cloning starts");
		LinkedList list2=new LinkedList();
		list2=(LinkedList)list.clone();          //clone()
		
		
		System.out.println("Cloned lit is :"+list2);
		
		System.out.println("----------------------------------------------");
		System.out.println("set() method works like:");
		list.set(2,30000);                                                 //set<index,element>
		System.out.println("Replaced value in linked list:"+list);
		
		//finding first and last element of the list
		System.out.println("FIrst element is:"+list.getFirst());
		System.out.println("Last element is:"+list.getLast());
		System.out.println("Sublisting from index 3 to 7");
		System.out.println("The sublist is:"+list.subList(3, 6));
		
		
		//iterating in reverse order
		ListIterator listIterator = list.listIterator(list.size());
		System.out.println("Reversed list is:");
		while (listIterator.hasPrevious()) {
		    System.out.print(listIterator.previous()+" ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("check if 67 is there in list or not:");
		System.out.println(list.contains(67));                 //contains()
		
		
		System.out.println("--------------------------------------------------");
		int element_search=890;
		for(int i=0;i<list.size();i++) {
			int x=list.get(i);
			if(x==element_search) {
				System.out.println("ELEMENT IS PRESENT");
				break;
			}
			else if(i==list.size()) {
				System.out.println("Not present");
			}
			else {
				continue;
			}
		}
		
		sc.close();
	}

}
