import java.io.*;
import java.util.*;

public class Fila {
	public static void main (String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("1");
		pq.add("2");
		pq.add("3");
		pq.add("4");
		pq.add("5");
		
		pq.add("6");
		pq.add("7");
		pq.add("8");
		pq.add("9");
		pq.add("10");
		
		System.out.println(pq);
	}
}
