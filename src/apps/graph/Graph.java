package apps.graph;


import java.util.HashSet;
import java.util.Set;

public class Graph
{
	private final Set<Rib> listOfRibs;
	private final int vertices;
	
	public Graph(int vertices)
	{
		listOfRibs = new HashSet<>();
		
		this.vertices = vertices;
	}
	
	public boolean addRib(int first, int second)
	{
		if (first > vertices || second > vertices)
		{
			return false;
		}
		
		return listOfRibs.add(new Rib(first, second));
	}
	
	public boolean removeRib(int first, int second)
	{
		return listOfRibs.remove(new Rib(first, second));
	}
	
	public boolean removeRib(Rib rib)
	{
		return listOfRibs.remove(rib);
	}
	
	public Set<Rib> getListOfRibs()
	{
		return listOfRibs;
	}
	
	public int getVertices()
	{
		return vertices;
	}
}
