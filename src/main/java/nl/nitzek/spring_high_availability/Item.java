package nl.nitzek.spring_high_availability;

import java.io.Serializable;

public class Item implements Serializable
{
	private String referenceId;
	private String name;
	private String price;

	public String getReferenceId()
	{
		return referenceId;
	}

	public void setReferenceId(String referenceId)
	{
		this.referenceId = referenceId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPrice()
	{
		return price;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}
}
