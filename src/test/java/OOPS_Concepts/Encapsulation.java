package OOPS_Concepts;

class Main
{
    public static void main (String[] args)
    {
      Employee emp = new Employee();
      emp.setName("Faim");
      emp.setID("105");
      
      System.out.println(emp.getName());
      System.out.println(emp.getID());
    }
}

class Employee
{
    private String name;
    private String ID;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return ID;
    }
}

