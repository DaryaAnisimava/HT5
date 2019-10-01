package by.epam.les07.main;
import java.util.Scanner;
public class Triangle {
	//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
	
        public double FirstSide;
        public double SecondSide;
        public double ThirdSide;
        public String Style;
      
        public double Area()
        {	
        	Scanner sc = new Scanner(System.in);
            System.out.println("Введите первую сторону треугольника:");
            String st = sc.nextLine();
            FirstSide = Double.parseDouble(st);
            System.out.println("Введите вторую сторону треугольника:");
            String sp = sc.nextLine();
            SecondSide = Double.parseDouble(sp);
            System.out.println("Введите третью сторону треугольника:");
            String sv = sc.nextLine();
            ThirdSide = Double.parseDouble(sv);
            
                double Pperimeter = ((FirstSide + SecondSide + ThirdSide) / 2);
                return Math.sqrt(Pperimeter * (Pperimeter - FirstSide) * (Pperimeter - SecondSide) * (Pperimeter - ThirdSide));
 
        }
        public double Perimeter()
        {
 
            return FirstSide + SecondSide + ThirdSide;
        }
        public double Medians() {
        	
        	return Math.sqrt((2 * SecondSide * SecondSide + 2 * ThirdSide * ThirdSide - FirstSide * FirstSide /4))/3 *2;
        }
        
        static class Shapes
        {
            public static void main(String[] args)
            {
                Triangle t1 = new Triangle();
                System.out.println("Площадь равна " + t1.Area());
                System.out.println("Периметр равен " + t1.Perimeter());
                System.out.println("Точка пересечения медиан от вершины треугольника равна " + t1.Medians());
            }
        }
    }

