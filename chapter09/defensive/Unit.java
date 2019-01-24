package chapter9.defensive;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Unit
{
    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;
    
    public Unit(int id) {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List getWeapons()
    {
        return weapons;
    }
    
    public int getId() {
        return id;
    }
    
    public void addWeapon(Weapon weapon) {
        if (weapon == null) {
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }
    
    public void setProperty(String property, Object value)
    {
        if (properties == null) {
            properties = new HashMap();
        }
        properties.put(property, value);
    }
    
    public Object getProperty(String property) throws IllegalAccessException {
        if (properties == null) {
            throw new IllegalAccessException("What are you doing?  No properties!");
        }
        Object value = properties.get(property);
        if (value == null) {
            throw new IllegalAccessException("You're screwing up! No property value.");
        }
        else
        {
            return value;
        }
    }
}
