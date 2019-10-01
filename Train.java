package by.epam.les07.main;

import java.util.Arrays;
import java.util.Scanner;


public class Train {
	//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
		private String Destination;
	    private int Number;
	    private String Date;
	       
	    private Train(String _Destination, int _Number, String _Date) {
	        this.Destination = _Destination;
	        this.Number = _Number;
	        this.Date = _Date;
	        
	     
	    }
	 
	    public String getDestination() {
			return Destination;
		}

		public void setDestination(String destination) {
			Destination = destination;
		}

		public int getNumber() {
			return Number;
		}

		public void setNumber(int number) {
			Number = number;
		}

		public String getDate() {
			return Date;
		}

		public void setDate(String date) {
			Date = date;
		}

		public static void main(String[] args) {
	    	Train[] mas = new Train[5];
			
			mas[0] = new Train("Москва", 004, "01/10/2019 07:20");
			mas[1] = new Train("Могилев", 102, "01/10/2019 21:30");
			mas[2] = new Train("Одесса", 104, "05/10/2019 12:40");
			mas[3] = new Train("Адлер", 108, "06/10/2019 16:45");
			mas[4] = new Train("Рига", 820, "03/10/2019 18:20");
			
			
			
			
			getInfo(mas);
			
			findMax(mas);
			
			
			print(mas);
				
			
				
		}	
			
		
		private static void print(Train[] mas) {
			
				System.out.println(Arrays.toString(mas));
			
			
		}

		
		@Override
		public String toString() {
			return "Train [Destination=" + Destination + ", Number=" + Number + ", Date=" + Date + "]";
		}

		private static void findMax(Train[] mas) {
			//Train[] maxTrain = {new Train("Москва", 004, "01/10/2019 07:20"), new Train("Могилев", 620, "01/10/2019 21:30"), new Train("Одесса", 108, "05/10/2019 12:40"), new Train("Адлер", 104, "06/10/2019 16:45"),new Train("Рига", 102, "03/10/2019 18:20")};
			Train maxTrain = null;
	    	int maxTrainIndex = 0;
	    	int i;
			for (i = 0; i<mas.length-1; i++) {
				maxTrain = mas[i];
				maxTrainIndex = i;
			}
			
			for (int j = i+1; j < mas.length; j++) {
				if (maxTrain.getNumber()<mas[i].getNumber()) {
					maxTrain = mas[j];
					maxTrainIndex = j;
				}
			}
			Train temp = mas[i];
			mas[i] = maxTrain;
			mas[maxTrainIndex]= temp;	
			
		
		}
		
		
		

		private static void getInfo(Train[] mas) {
			Scanner sc = new Scanner(System.in);
            System.out.println("Введите номер поезда:");
            int nom = sc.nextInt();
            int count = 0;
                for (int i = 0; i < mas.length; i++)
                {
                	if (mas[i].getNumber() == nom)
                    {
                    	 System.out.println("Поезд №: " + mas[i].getNumber());
                    	 System.out.println("Пункт назначения: " + mas[i].getDestination());
                    	 System.out.println("Время отправления: " + mas[i].getDate());
                    	 count++;
                    } else continue;
                }
                if (count == 0)
                {
                	System.out.println("Поезда с таким номером не существует!");
                }
              
                
		}
			
}
	        
