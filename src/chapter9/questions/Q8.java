package chapter9.questions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q8 implements QuestionChapter9 {
	/**
	 * What is the output of the following code?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("/pets/../cat.txt");
		Path path2 = Paths.get("./dog.txt");
		
		// . (point) is the current directory
		// .. (two points) parent directory
		
		// resolve means join two paths
		System.out.println(path1.resolve(path2));
		System.out.println(path2.resolve(path1));
		/**
		 * Resolve the given path against this path.
		 * If the other parameter is an absolute path then this method trivially returns other. 
		 * If other is an empty path then this method trivially returns this path. 
		 * Otherwise this method considers this path to be a directory and resolves 
		 * the given path against this path. In the simplest case, 
		 * the given path does not have a root component, 
		 * in which case this method joins the given path to this path and 
		 * returns a resulting path that ends with the given path.
		 *  Where the given path has a root component then resolution 
		 *  is highly implementation dependent and therefore unspecified.
		 * 
		 */
	}
}
