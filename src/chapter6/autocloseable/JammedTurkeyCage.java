package chapter6.autocloseable;

public class JammedTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new IllegalStateException("Cage doors does not close");
	}
	
	public static void main(String[] args) throws Exception {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			//System.out.println("put turkeys in");
			throw new RuntimeException("Turkeys run off");
		} catch (IllegalStateException e){
			System.out.println("caught: "+e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}
}
