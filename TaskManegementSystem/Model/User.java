package TaskManegementSystem.Model;

public class User 
{
    //attributes of an user 

    public int id;
    public String workEmail;
    public String name;

    public User(Integer id, String workEmail, String name)
    {
        if(id==null || name.isEmpty() || workEmail.isBlank())
        {
            throw new IllegalArgumentException("User Id , Email and User Name cannot be null");
        }

        this.id=id;
        this.name=name;
        this.workEmail=workEmail;
    }

        public int getUserId()
        {
            return this.id;
        }
        public String getUserName()
        {
            return this.name;
        }
}
