package by.epam.les07.main;

import java.util.Scanner;

public class Schetchik { 
	/*
	 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
	 */
	public  int begin; 
	public  int end; 
	public  int now; 
	
	
	public Schetchik ( int begin, int end ) 
	{ 
    this . begin  = begin ; 
    this . end  = end ; 
	} 
	
	public  void Icrease ( ) 
	{

    if  ( this . begin  <  this . end ) 
    { 
        this . begin ++; 
        now =  this . begin ; 
    } 
    //if ( this . now > this . end ) 
    //	System.out.println( "Counter value is out of range" ) ;
        
	} 
	public  void Decrease ( ) 
	{ 
    if  ( this . end  >  this . now ) 
    { 
        this . now --; 
    } 
   // if ( this . now < this . begin )
    	//System.out.println( "Counter value is out of range" ) ;
    
	} 
	public  void Sostoyanie ( ) 
	{ 
		System.out.println(String.valueOf( now ) ) ; 
	}
 

	

    public static void main(String [ ] args ) 
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println( "Enter the beginning of the range of the counter" ) ; 
    	int b =  sc.nextInt(); 
    	System.out.println( "Enter the end of the counter range" ) ; 
    	int e = sc.nextInt() ;

    Schetchik time =  new Schetchik ( b, e ) ; 
    time . Icrease ( ) ; 
    time . Icrease ( ) ; 
    System.out.println("State after increasing counter = ");
    time . Sostoyanie ( ) ; 
    time . Decrease ( ) ; 
    System.out.println("State after decreasing counter = ");
    time . Sostoyanie ( ) ;


  ; 
} 

}
