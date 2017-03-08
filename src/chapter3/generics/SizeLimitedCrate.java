package chapter3.generics;

public class SizeLimitedCrate<T,U> {
	
	private T contents;
	private U sizeLimit;
	
	public SizeLimitedCrate(T contents, U sizeLimit) {
		super();
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}

	public T getContents() {
		return contents;
	}

	public U getSizeLimit() {
		return sizeLimit;
	}
	
}
