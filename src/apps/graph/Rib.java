package apps.graph;

public class Rib
{
	private final int start;
	private final int end;
	
	public Rib(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	
	public int getEnd()
	{
		return end;
	}
	
	public int getStart()
	{
		return start;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		
		Rib rib = (Rib) o;
		
		if (start != rib.start)
		{
			return false;
		}
		return end == rib.end;
	}
	
	@Override
	public int hashCode()
	{
		int result = start;
		result = 31 * result + end;
		return result;
	}
}
