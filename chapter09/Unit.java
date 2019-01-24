package chapter9;
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
    
    public Object getProperty(String property) {
        if (properties == null) {
            return null;
        }
        return properties.get(property);
    }
}
