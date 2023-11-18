package chapter7.exam5;

public class ChildExample extends Parent {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 * parent.feild2 = "data2"; 
		 * parent.method3();
		 */

		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();

	}
}
