package com.mycompany.FinalPart2.Section2;

public class MyGenClass<K, V> implements MyGenInterface<K, V> {

	
	private K key;

	private V value;


	public MyGenClass(K K_key,V V_value) {

	key=K_key;

	value=V_value;

	}



	

	public K getKey() {

	return key;

	}



	

	public V getValue() {

	return value;
}





	@Override
	public K getKey1() {
		// TODO Auto-generated method stub
		return null;
	}






}
