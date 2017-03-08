package chapter3.collections.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class FilaTest {

	public static void main(String[] args) {
		// Pilha
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		stack.forEach(System.out::println);
	}

	public static void queue() {
		// Fila
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(1994));
		System.out.println(queue.offer(2002));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}

	public static void linkedList() {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Brasil 62");
		list.add("Brasil 70");
		
		String e1 = list.element(); //Retrieve but not remove
		System.out.println(e1);
		
		list.offer("Brasil 18"); // Add tail
		e1 = list.element(); //Retrieve but not remove
		System.out.println(e1);
		String removed = list.remove();
		System.out.println(removed);
		
		list.push("Brasil 58"); // Add to head
		
		String head = list.poll();//
		System.out.println("Head removed ["+head+"]");
		
		String retrieveOnly = list.peek(); // Retrieves but don't remove
		System.out.println("Retrieve ["+retrieveOnly+"]");
		
		String pop = list.pop();// Remove and returns next element
		System.out.println("pop["+pop+"]");
		
		list.forEach(System.out::println);
	}

}
