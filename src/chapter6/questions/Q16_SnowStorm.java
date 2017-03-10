package chapter6.questions;

import java.io.IOException;

public class Q16_SnowStorm {

	static class Walk implements AutoCloseable{
		@Override
		public void close() throws IOException {
			throw new RuntimeException("snow");
		}
	}
	
	public static void main(String[] args) {
		try (Walk walk1 = new Walk(); Walk walk2=new Walk();){
			throw new RuntimeException("rain");
		} catch (Exception e){
			System.out.println(e.getMessage()+" "+e.getSuppressed().length);
		}
	}

}
