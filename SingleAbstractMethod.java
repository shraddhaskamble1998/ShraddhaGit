package functionalnterface;


@FunctionalInterface  
interface sayablity{  
    void say(String msg);  
}  

public class SingleAbstractMethod implements sayablity{
	 public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	        SingleAbstractMethod fie = new SingleAbstractMethod();  
	        fie.say("Hello there");  
	    }  
}
