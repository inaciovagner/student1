
/**
 * Creating a class to model a student
 *
 * @author Vagner de Souza
 * 15/11/24
 */
public class Student
{
    private String name;
    private int age;
    private String id;

    /**
     * Constructor for objects of class Student
     */
    public Student(String aName, int anAge, String anId)
    {
        name = aName;

        if(isValidId(anId))
        {
            id = anId;
        }
        age = anAge;

    }

    public boolean isValidId(String anId)
    {
        return anId.length() == 5;
    }

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        name = "Unknown";
        id = "Unknown";
        age = 0;

    }   

    public void setName(String aName)
    {
        name = aName;
    }

    public void setAge(int anAge)
    {
        age = anAge;
    }

    public void setId(String anId)
    {
        if(isValidId(anId))
        {
            id = anId;
        }
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public int getAge()
    {
        return age;
    }

    public void uncrementAge()
    {
        age++; 
    }

}