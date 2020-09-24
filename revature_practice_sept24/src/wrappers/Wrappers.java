package wrappers;

public class Wrappers {

	public static void main(String[] args) {
		Integer i1=10;//common pool
		Integer i2=10;//common pool
		Integer i3=new Integer(10); //heap
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		//i1++;
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		System.out.println("i1.equals(i3) : "+i1.equals(i3));
		
		/*
		 * public int obj1.compareTo(obj2) - used for sorting, it is available in all the wrapper classes & String class
		 * if value of obj1 is equals to the value of obj2 it will return 0 
		 * if value of obj1 is greater than value of obj2 it will return positive value
		 * if value of obj1 is smaller than value of obj2 it will return -ve value
		 */
		Integer i4=99;
		System.out.println("i4.compareTo(99) : "+i4.compareTo(99));
		System.out.println("i4.compareTo(9) : "+i4.compareTo(9));
		System.out.println("i4.compareTo(999) : "+i4.compareTo(999));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int x=i4; //Autoboxing
		System.out.println("x : "+x);
		
		x=10000;
		i4=x; //Autoboxing
		System.out.println("i4 : "+i4);
		
		String s="12443";
		
		int a=Integer.parseInt(s);  //Common across all the wrappers except Character
		System.out.println("a = "+a);
		
		a=1919191;
		s=a+"";//anything in java can be converted to the String by just doing this
		System.out.println("s : "+s);
		
		Integer i5=77;
		Float f=i5.floatValue(); //doubleValue() //shortValue() //longValue()
		System.out.println("f = "+f);
		int r=f.intValue();
		System.out.println("r : "+r);
		
		
		//Task here : Imitate the above with Float, Long and Double classes respectively
		
		//float
		Float f1=99.9f;
		System.out.println("f1.compareTo(99.9f) : "+f1.compareTo(99.9f));
		System.out.println("f1.compareTo(9.9f) : "+f1.compareTo(9.9f));
		System.out.println("f1.compareTo(999.9f) : "+f1.compareTo(999.9f));
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		float p = f1; //Autoboxing
		System.out.println("p : "+p);
		
		p = 1000.6f;
		f1=p; //Autoboxing
		System.out.println("f1 : "+f1);
		
		String s1="1101.23f";
		
		float b =Float.parseFloat(s1);  //Common across all the wrappers except Character
		System.out.println("b = "+b);
		
		b =2828282.8f;
		s=b+"";//anything in java can be converted to the String by just doing this
		System.out.println("s1 : "+s1);
		
	
		
		
		//double
		Double d1=99.9;
		System.out.println("d1.compareTo(99.9f) : "+d1.compareTo(99.9));
		System.out.println("d1.compareTo(9.9f) : "+d1.compareTo(9.9));
		System.out.println("d1.compareTo(999.9f) : "+d1.compareTo(999.9));
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		double g = d1; //Autoboxing
		System.out.println("g : "+g);
		
		g = 145.7;
		d1=g; //Autoboxing
		System.out.println("d1 : "+d1);
		
		String s2="124.2";
		
		double c =Double.parseDouble(s2);  //Common across all the wrappers except Character
		System.out.println("c = "+c);
		
		g =373737.3;
		s2=c+"";//anything in java can be converted to the String by just doing this
		System.out.println("s2 : "+s2);
		

		//Long
		Long l1=99l;
		System.out.println("d1.compareTo(99l) : "+l1.compareTo(99l));
		System.out.println("d1.compareTo(9l) : "+l1.compareTo(9l));
		System.out.println("d1.compareTo(999l) : "+l1.compareTo(999l));
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		long h = l1; //Autoboxing
		System.out.println("h : "+h);
		
		h = 111l;
		l1=h; //Autoboxing
		System.out.println("l1 : "+l1);
		
		String s3="1789l";
		
		long d =Long.parseLong(s3);  //Common across all the wrappers except Character
		System.out.println("d = "+d);
		
		d =464646l;
		s3=d+"";//anything in java can be converted to the String by just doing this
		System.out.println("s3 : "+s3);
		
		
		
		

	}
	
	

}