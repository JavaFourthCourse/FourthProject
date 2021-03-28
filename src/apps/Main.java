package apps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main
{
	public static void main(String[] args) throws IOException
	{
	
	}
	
	private static void firstMethod(File file) throws IOException
	{
		FileReader in = new FileReader(file);
		BufferedReader reader = new BufferedReader(in);
		List<String> list = new ArrayList<>();
		
		while (true)
		{
			String line = reader.readLine();
			
			if (line == null)
			{
				break;
			}
			
			list.add(line);
		}
		
		in.close();
		
		ListIterator<String> iterator = list.listIterator(list.size());
		FileWriter writer = new FileWriter(file);
		
		while (iterator.hasPrevious())
		{
			writer.write(iterator.previous());
			
			writer.write('\n');
		}
		
		writer.close();
	}
}
