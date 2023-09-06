package com.pluralsight;

public class CellPhone
{
    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String number = "";
    private String owner = "";

    public CellPhone()
    {
    }

    public CellPhone(int serialNumber, String model, String carrier, String number, String owner)
    {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.number = number;
        this.owner = owner;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getCarrier()
    {
        return carrier;
    }

    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public void dial(String number)
    {
        System.out.println(owner + "'s phone is dialing " + number + " ...");
    }

    public void dial(CellPhone phone)
    {
        dial(phone.getNumber());
    }
}
