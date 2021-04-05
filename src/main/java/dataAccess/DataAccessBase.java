package dataAccess;


public abstract class DataAccessBase<T> {
	//protected final JAXBElement<T> data;
	protected final T element;
	
	public DataAccessBase(final T element) {
		//this.data = data;
		this.element = element;
	}
//	
//	public JAXBElement<T> getJAXBElement() {
//		return data;
//	}
	
	public T getElement() {
		return element;
	}
}
