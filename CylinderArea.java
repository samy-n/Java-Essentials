

package Inheritance;

class CylinderArea
{
    final float pi=3.14f;double radius;
    
    CylinderArea(double r)
    {
        radius=r;
        
    }
    
    double Calculate()
    {
        double area=2*pi*radius*radius;
        return area;
    }
    
    void show()
    {
        double area=Calculate();
        System.out.println(" Radius of the cylinder= "+radius);
        System.out.println(" Area of the top and bottom= "+area);
    }
    
}