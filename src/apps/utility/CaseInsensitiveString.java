package apps.utility;

public class CaseInsensitiveString
{
	private String data;
	
	public CaseInsensitiveString(String data)
	{
		this.data = data;
	}
	
	public CaseInsensitiveString replaceAll(String regex, String replacement)
	{
		return new CaseInsensitiveString(data.replaceAll(regex, replacement));
	}
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	public String getData()
	{
		return data;
	}
	
	@Override
	public String toString()
	{
		return data;
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
		
		CaseInsensitiveString that = (CaseInsensitiveString) o;
		
		return this.hashCode() == that.hashCode();
	}
	
	@Override
	public int hashCode()
	{
		return data != null ? data.toLowerCase().hashCode() : 0;
	}
}
