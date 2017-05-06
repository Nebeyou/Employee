package com.interview;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.ExtendedSSLSession;

import org.omg.Messaging.SyncScopeHelper;

public class Employee  {
		String name;
		int salary;
		public Employee(String name, int salary) {
			super();
			this.name = name;
			this.salary = salary;
		}
//		
//		public static void main(String[] args) {
//			//create a hashmap 
//			Hashtable<String, Employee> ht=new Hashtable<>();
//			ht.put(null, null);
//			HashMap hm=new HashMap();
//			//put elements ot hashmap
//			
//			hm.put("zar", new Double(35.65));
//			hm.put(null, null);
//			hm.put(null, null);
//			hm.put(null, null);
//			hm.put("Nebeyou", new Double(125.89));
//			
//			//get a set of entries
//			Set set=ht.entrySet();
//			
//			//get a iterator o
//			Iterator i=set.iterator();
//			
//			while(i.hasNext()){
//				Map.Entry me=(Map.Entry)i.next();
//				System.out.println(me.getKey()+":");
//				System.out.println(me.getValue());
//			}
//			
//			/*class MyComparator implements Comparator<Employee>{
//
//				public int compare(Employee o1, Employee o2) {
//					// TODO Auto-generated method stub
//					return o1.name.compareTo(o2.name);
//				}
//				
//			}
//			Comparator<Employee> empcomp=(Employee e1,Employee e2)->{
//				return e1.name.compareTo(e2.name);
//			};
//			*/
//			/*List<Employee> emp=new ArrayList<>();
//			Employee e=new Employee("Nebeyou", 56);
//			Employee e2=new Employee("Dave", 60);
//			emp.add(e);
//			emp.add(e2);
//			System.out.println(emp);
//			Collections.sort(emp, empcomp);
//			System.out.println(emp);
//			System.out.println(Singlton.getSinglton());
//			System.out.println(Singlton.getSinglton());*/
//			
//			Calendar now=Calendar.getInstance();
//			//print current date
//			System.out.println("The current date is :"+now.getTime());
//			//sdd 20 days to calander
//			now.add(Calendar.DATE, 20);
//			
//			System.out.println("The current date is :"+now.getTime());;
//			//substract 2 month from the calander
//				now.add(Calendar.MONTH, -2);
//				System.out.println("2 months ago"+now.getTime());
//				
//		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}
		
		
}
class Singlton{
	private static Singlton singlton=null;
	private Singlton(){}
	public static  Singlton getSinglton(){
		if(singlton==null){
			synchronized (Singlton.class) {
				if(singlton==null){
					singlton=new Singlton();
				}
			}
		}
		return singlton;
	}
}
