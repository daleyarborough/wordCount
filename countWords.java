package count;

import java.io.*;
import java.util.*;

public class CountWords {
	public static void main(String[] args) throws IOException {
		Scanner words = null;
		HashMap<String,Integer> counter = new HashMap<>();
		
		try {
			String fname = "your/file/here"; // TODO: add file path
			words = new Scanner(new BufferedReader(new FileReader(fname)));
			String w;
			int count;
			while (words.hasNext()) {
				w = words.next();
				if (counter.containsKey(w)) {
					count = counter.get(w) + 1;
					counter.put(w,count);
				} else {
					counter.put(w,1);
				}
			}
		} finally {
			if (words != null) {
				words.close();
			}
		}
		
		for (Map.Entry<String, Integer> entry : counter.entrySet()) {
			System.out.println(entry);
		}
	}
}
