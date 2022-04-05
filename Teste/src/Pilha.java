import java.io.*;
import java.util.*;

public class Pilha {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		
		System.out.println(stack);
		
		stack.clear();
		
		stack.push("6");
		stack.push("7");
		stack.push("8");
		stack.push("9");
		stack.push("10");
		
		System.out.println();
		
		stack.clear();
	}

}
