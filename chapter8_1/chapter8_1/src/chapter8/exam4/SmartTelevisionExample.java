package chapter8.exam4;

import chapter8.exam3.RemoteControl;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv; 
	}
}
