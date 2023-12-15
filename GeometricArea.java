class GeometricArea {
    void area(float a) {
        System.out.println("Area of Square is: " + Math.pow(a, 2) + "sq units");
    }

    void area(float x, float y) {
        System.out.println("Area of Rectangle is: " + x * y + "sq units");
    }

    void area(double c) {
        double o = 3.14 * Math.pow(c, 2);
        System.out.println("Area of Circle is: " + o + "sq units");
    }

    void area(int h, int b) {
        float t = (1 / 2) * b * h;
        System.out.println("Area of Triangle is: " + t + "sq units");
    }

public static void main(String[]args)
{
	GeometricArea obj = new GeometricArea();
	obj.area(10.4f);
	obj.area(12.0f,6.0f);
	obj.area(12.4);
	obj.area(12.0f,3.0f);
}
}

