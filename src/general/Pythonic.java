package general;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Pythonic {
	public default Pythonic add(Pythonic other) {
		throw new NotImplementedException();
	}
	
	public default long __len__() {
		throw new NotImplementedException();
	}
}
