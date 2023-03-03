package QQ39;

import QQ39.MyClass;

public class Main {

	public static void main(String[] args) 
	{
		RepositoryCRUD<Integer> repInteger 	= new RepositoryCRUD<Integer>();
		RepositoryCRUD<String>  repString  	= new RepositoryCRUD<String>();
		RepositoryCRUD<MyClass> repClass  	= new RepositoryCRUD<MyClass>();

		repInteger.add(10);
		repInteger.add(20);
		repInteger.add(30);
		repInteger.remove(20);
		repInteger.edit(30, 3000);
		System.out.println( "get: " + repInteger.get(10) );
		System.out.println( "get List: " + repInteger.getList() );
		System.out.println();
		
		repString.add("Bruno");
		repString.add("Jo�o");
		repString.add("Maria");
		repString.remove("Jo�o");
		repString.edit("Maria", "MariaJos�");
		System.out.println( "get: " + repString.get("Bruno") );
		System.out.println( "get List: " + repString.getList() );
		System.out.println();

		repClass.add( new MyClass(1, "um") );
		repClass.add( new MyClass(2, "dois") );
		repClass.add( new MyClass(3, "tres") );
		repClass.remove( new MyClass(2, "qqcoisa") );
		repClass.edit( new MyClass(3, "qqcoisa") , new MyClass(30, "trinta") );
		System.out.println( "get: " + repClass.get( new MyClass(1, "qqcoisa") ) );
		System.out.println( "get List: " + repClass.getList() );
		System.out.println();
	}

}
