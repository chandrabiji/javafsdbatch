package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(89);
		pq.add(23);
		pq.add(3);
		pq.add(8);
		pq.add(22);
		System.out.println("PriorityQueue Elements : "+pq);
		pq.poll();
		System.out.println("After poll pq elements : "+pq);
		System.out.println(pq.peek());
		System.out.println("After Peek pq elements : "+pq);

	}

}
