package by.epam.les07.main;
import java.util.Date;
import java.util.Scanner;

public class MyDateTime
{
    int Hour;
    int Minute;
    int Second;
    
    public void SetHour(int hour)
    {
        Hour = hour;
    }

    public void SetMinute(int minute)
    {
        Minute = minute;
    }

    public void SetSecond(int second)
    {
        Second = second;
    }
    
    public String ShowTime()
    {
        return "На моих часах время: " + Hour + ":" + Minute + ":" + Second;
    }

	public void SetTime(int hour, int minute, int second)
    {
        SetHour(hour);
        SetMinute(minute);
        SetSecond(second);
    }


  
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Программа 'Время'");
        System.out.println("1. Вывести текущее время");
        System.out.println("2. Ввод времени");
   	 	System.out.println("3. Показать время");
   	 	System.out.println("0. Выход");
   	 	System.out.println("Введите цифру: ");
   	
        MyDateTime myTime = new MyDateTime();
        int s;
        s = sc.nextInt();
        while (s !=0)
        {	
    
        	 //System.out.println("1. Вывести текущее время");
        	// System.out.println("2. Ввод времени");
        	// System.out.println("3. Показать время");
        	// System.out.println("0. Выход");
        	// System.out.println("Введите цифру: ");
        	
        	s = sc.nextInt();
            if ((s != 1)&&(s != 2) && (s != 3) &&(s != 0))
            {
            	 System.out.println("Неправильный ввод");
                continue;
            }
            
            if (s==0) {
            	System.out.println("Конец программы");
            }
            	
           // int n = Integer.parseInt(s);
            switch (s)
            {
                case 1:
                	Date date = new Date();
                    String current_time_str = date.toString();
                    System.out.println("Текущее время " + current_time_str);
                    break;
                case 2:
                	
                	System.out.println("Введите новое время");
                	System.out.println("Введите новые показания для часов");
                	int hour =sc.nextInt();
                	System.out.println("Введите новые показания для минут");
                	int minute =sc.nextInt();
                	System.out.println("Введите новые показания для секунд");
                	int second =sc.nextInt();
   
                    if ((hour <= 24) && (minute <= 59) && (second <= 59))
                   {
                      myTime.SetTime(hour, minute, second);
                        System.out.println("Показания времени изменены");
                 }
                   else
                   	System.out.println("Такого времени не бывает!");

                    break;
                case 3:
                	System.out.println(myTime.ShowTime());
                    break;
            	}
     
        }
    }
    
    }
   

