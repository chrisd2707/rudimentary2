package package2;

import package1.pack1;

public class pack2 {

	public pack2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pack2 p2=new pack2();
		//p2.greetings();
		System.out.println("You are in package 2");
		//pack1 p1=new pack1();
		pack1.greetings();
		System.out.println("You just used static function");
		

	}

}

