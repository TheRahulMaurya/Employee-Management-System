/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

public class Address
{
	private String country,state,district,city,houseNumber,street;
	private int pincode;

	public Address(String country,String state,String district,String city,String street,int pincode,String houseNumber)
	{
			this.country=country;
			this.state=state;
			this.district=district;
			this.city=city;
			this.street=street;
			this.pincode=pincode;
			this.houseNumber=houseNumber;
	}

    public Address() {
        
    }

	public String getCountry()
	{
		return this.country;
	}

	public String getState()
	{
		return this.state;
	}

	public String getDistrict()
	{
		return this.district;
	}

	public String getCity()
	{
		return this.city;	
	}

	public String getStreet()
	{
		return this.street;	
	}

	public int getPincode()
	{
		return this.pincode;
	}

	public String getHouseNumber()
	{
		return this.houseNumber;
	}

	public void setCountry(String country)
	{
		this.country=country;
	}

	public void setState(String state)
	{
		this.state=state;
	}

	public void setDistrict(String district)
	{
		this.district=district;
	}

	public void setCity(String city)
	{
		this.city=city;
	}

	public void setStreet(String street)
	{
		this.street=street;
	}

	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}

	public void setHouseNumber(String houseNumber)
	{
		this.houseNumber=houseNumber;
	}

	public void displayAddress()
	{	
		System.out.print(""+this.houseNumber+" "
			+this.street+" "
			+this.city+" "
			+this.pincode);

	}
}
