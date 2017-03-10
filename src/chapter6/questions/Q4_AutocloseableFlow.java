package chapter6.questions;

import java.io.Closeable;
import java.io.IOException;

public class Q4_AutocloseableFlow {

	static class Door implements AutoCloseable{
		@Override
		public void close() throws Exception {
			System.out.print("D");
		} 
	}
	
	static class Window implements Closeable{
		@Override
		public void close() throws IOException {
			System.out.print("W");
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		try (Door d= new Door(); Window w = new Window()){
			System.out.print("T");
		} catch (Exception e){
			System.out.print("E");
		} finally {
			System.out.print("F");
		}
	}

}
