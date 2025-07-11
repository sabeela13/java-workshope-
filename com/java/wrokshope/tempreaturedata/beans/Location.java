package com.java.wrokshope.tempreaturedata.beans;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    public void setName(String aname){
        name = aname;
    }
    public String getName(){
        return name;
    }
    public void setLatitude(Double aLatitude){
        latitude=aLatitude;
    }
    public Double getLatitude(){
        return latitude;
    }
    public void setLongitude(double aLongitude){
        longitude=aLongitude;
    }
    public double getLongitude(){
        return longitude;
    }
    public void setDescription(String aDescription){
        description=aDescription;
    }
    public void getDescription(){
        return Description;
    }
    public void setCountry(String acountry){
        country=aCountry;
    }
    public void grtCity(String aCity){
        city=aCity;
    }
    public String getCity(){
        return city;
    }
    public void setAddress(String aAddress){
        address=aAddress;
    }
    public String getAddress(){
        return address;
    }     
           public void setPostalcode(String aPostalcode){      
        Postalcode=aPostalcode;
    }
    public String getPostalcode(){
        return Postalcode;
    }
    @Override
public String toString(){
    return"Location{ name:" + name+",Latitude:" +Latitude+",Longitude:"+longitude+",
    Description:"+description+",country:"+country+",city:"+city+",Address:"+addres+",postalcode";}
}
