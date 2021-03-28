package apps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import apps.utility.CaseInsensitiveString;

public class Main
{
	public static void main(String[] args) throws IOException
	{
	
	}
	
	private static void firstMethod(File file) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(file));
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
		
		reader.close();
		
		ListIterator<String> iterator = list.listIterator(list.size());
		FileWriter writer = new FileWriter(file);
		
		while (iterator.hasPrevious())
		{
			writer.write(iterator.previous());
			
			writer.write('\n');
		}
		
		writer.close();
	}
	
	private static int thirdMethod(File file) throws IOException
	{
		Scanner scanner = new Scanner(new FileInputStream(file));
		HashSet<CaseInsensitiveString> words = new HashSet<>();
		
		while (scanner.hasNext())
		{
			CaseInsensitiveString word = new CaseInsensitiveString(scanner.next());
			
			words.add(word.replaceAll("[.!?,]", ""));
		}
		
		return words.size();
	}
	
	private static void fourthMethod(List<Integer> list)
	{
		list.sort((first, second) ->
		{
			if (first >= 0)
			{
				return -1;
			}
			
			if (second > 0)
			{
				return 1;
			}
			
			return 0;
		});
	}
}
