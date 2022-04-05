import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Lista {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		list.clear();
		
		System.out.println(list.size());
		
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		
		System.out.println(list);
		
		list.clear();
	}

}
