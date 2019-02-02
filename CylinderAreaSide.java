/**
 * Inheritance is the linking of two classes. 
 * Advantages:
 * 1. It provides reusability of data members.
 * 2. Saves memory.
 * 
 * There are 5 types of inheritance in Java: single, multilevel, multiple, hierarchical, hybrid.
 * 
 * This is a simple program where CylinderArea is the superclass/parent/base class
 * and CylinderAreaSide inherits CylinderArea using extends keyword. CylinderAreaSide
 * is called the subclass/child/derived class. It inherits pi and radius datamembers
 * from CylinderArea.
 */



package Inheritance;

class CylinderAreaSide extends CylinderArea
{
    double h;double areaside;
    
    CylinderAreaSide(double r,double ht)
    {
        super(r);
        h=ht;
    }
    
    void area()
    {
        areaside=2*pi*radius*h;
    }
    
    void show()
    {
        super.show();
        System.out.println(" Height of the cylinder= "+h);
        System.out.println(" Area of the side= "+areaside);
    }
    
    static void main()
    {
        CylinderAreaSide ob=new CylinderAreaSide(3.0,5.0);
        ob.area();
        ob.show();
    }
}