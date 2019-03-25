import java.util.*;
public class PriorityQueueTest{
	public static void main(String[] args){
		PriorityQueue q=new PriorityQueue();

		q.offer(6);
		q.offer(1);
		q.offer(8);
		q.offer(5);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);

	}
}