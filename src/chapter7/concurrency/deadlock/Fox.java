package chapter7.concurrency.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Food{}
class Water{}

// This problem is!
// Foxy and Tails want have lunch, but like some humans the animals like
// the meal and water available, but the foxy likes to eat first and then drink water.
// while tails likes drink water first and then eat.
public class Fox {

	public void eatAndDrink(Food food, Water water){
		synchronized (food) {
			System.out.println("Got food!");
			move();
			synchronized (water) {
				System.out.println("Got water");
				
			}
		}
	}
	
	public void drinkAndEat(Water water, Food food){
		synchronized (water) {
			System.out.println("Got water");
			move();
			synchronized (food) {
				System.out.println("Got food!");
				
			}
		}
	}

	private void move() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		Fox foxy = new Fox();
		Fox tails = new Fox();
		Food food = new Food();
		Water water = new Water();
		
		ExecutorService service = null;
		try {
			service = Executors.newScheduledThreadPool(10);
			service.submit(() -> foxy.eatAndDrink(food, water)); 
			service.submit(() -> tails.drinkAndEat(water, food));
			// This example is considered a deadlock because both participants are
			// permanently blocked, waiting on resources that will never become available.
		} finally {
			service.shutdown();
		}
	}
}
