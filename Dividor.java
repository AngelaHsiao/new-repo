package com.revature.doNotDivideBy42;

public class Dividor {
public int divide(int x, int y) throws DivideBy42Exception {
	
	if (y==42) {
		throw new DivideBy42Exception();
	}
	return x/y;
}

}
