class figuras {

    public double perimetroCirculo(double radio) {
        double pi=3.1416;
        double perimetro = 2 * pi * radio;
        return perimetro;
    }

    public double areaCirculo(double radio) {
        double pi=3.1416;
        double area = pi * (radio*radio);
        return area;
    }

    public double perimetroRectangulo(double base, double altura) {
        double perimetro = 2 * (altura + base);
        return perimetro;
    }
    
    public double areaRectangulo(double base, double altura) {
        double area = base* altura;
        return area;
    }

    public double perimetroCuadrado(double longitud) {
        double perimetro=longitud+longitud+longitud+longitud;
        return perimetro;
    }

    public double areaCuadrado(double longitud) {
        double area=longitud*longitud;
        return area;
    }

    public double calculoHipotenusa(double base, double altura) {
        return Math.sqrt(altura*altura + base * base);
       
    }

    public String tiposTriangulosRectangulos(double lado1, double lado2, double hipotenusa) {
        if (lado1 == lado2 && lado2 == hipotenusa) {
            return "Equilátero"; 
        } else if (lado1 == lado2 || lado1 == hipotenusa || lado2 == hipotenusa) {
            return "Isósceles"; 
        } else {
            return "Escaleno"; 
        }
    }

        public static void main(String[] args) {
            figuras fig = new figuras();
    
        
            System.out.println("Círculo:");
            System.out.println("Área: " + fig.areaCirculo(5));
            System.out.println("Perímetro: " + fig.perimetroCirculo(5));
    
            System.out.println("Rectángulo:");
            System.out.println("Área: " + fig.areaRectangulo(4, 6));
            System.out.println("Perímetro: " + fig.perimetroRectangulo(4, 6));
    
            
            System.out.println("Cuadrado:");
            System.out.println("Área: " + fig.areaCuadrado(4));
            System.out.println("Perímetro: " + fig.perimetroCuadrado(4));
    
            System.out.println("Triángulo rectángulo:");
            double hipotenusa = fig.calculoHipotenusa(3, 4);
            System.out.println("Hipotenusa: " + hipotenusa);
            System.out.println("Tipo de triángulo: " + fig.tiposTriangulosRectangulos(3, 4, hipotenusa));
        }
    }
    
    


    