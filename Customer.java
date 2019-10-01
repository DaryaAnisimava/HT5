package by.epam.les07.main;
import java.util.*;


public class Customer {
	/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/
	  
	  
	    private int id;
	    private String name;
	    private String name2;
	    private String name3;
	    private String address;
	    private int creditCardId;
	    private int bankNumberCard;
	 
	    Customer(int id, String name, String name2, String name3, String address, int creditCardId, int bankNumberCard) {
	    	this.id = id;
	        this.name2 = name2;
	        this.name = name;
	        this.name3 = name3;
	        this.address = address;
	        this.creditCardId = creditCardId;
	        this.bankNumberCard = bankNumberCard;
	    }
	    public int getId() {
	        return id;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public String getName2() {
	        return name2;
	    }
	 
	    public String getName3() {
	        return name3;
	    }
	 
	    public String getAddress() {
	        return address;
	    }
	 
	    public int getCreditCardId() {
	        return creditCardId;
	    }
	 
	    public int getBankNumberCard() {
	        return bankNumberCard;
	    }
	 
	    public String toString() {
	        return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t from: %s\t credit card %d\t bank number %d",
	                id, name2, name, name3, address, creditCardId, bankNumberCard);
	    }
	 
	
	

	    public static void main(String[] args) {
	        Shop market = new Shop("Maxi");
	        market.addCustomerToShopList(new Customer(111, "Дмитрий", "Киреев", "Владимирович", "Беларусь", 11_22_33_44, 12345));
	        market.addCustomerToShopList(new Customer(112, "Тамара", "Губко", "Павловна", "Украина", 22_33_44_55, 23456));
	        market.addCustomerToShopList(new Customer(113, "Борис", "Тишкевич", "Петрович", "Беларусь", 33_44_55_66, 34567));
	        market.addCustomerToShopList(new Customer(114, "Анна", "Рылко", "Викторовна", "Украина", 44_55_66_77, 45678));
	        market.addCustomerToShopList(new Customer(115, "Марк", "Петров", "Александрович", "Россия", 55_66_77_88, 56789));
	        market.addCustomerToShopList(new Customer(116, "Нелли", "Миронова", "Константиновна", "Россия", 66_77_88_99, 67890));
	        market.addCustomerToShopList(new Customer(117, "Алексей", "Михайлов", "Михайлович", "Украина", 77_88_99_00, 78901));
	        market.addCustomerToShopList(new Customer(118, "Стелла", "Джонс", "-        ", "Англия", 88_99_00_11, 89012));
	        market.addCustomerToShopList(new Customer(119, "Джейн", "Дое", "-         ", "США", 99_00_11_22, 90123));
	        market.addCustomerToShopList(new Customer(120, "Алекс", "Смит", "-       ", "Монако", 10_12_23_34, 10234));
	 
	        System.out.println("\nsort by name2:");
	        List<Customer> listSortByName2 = market.getListByName2();
	        for (Customer c : listSortByName2) {
	            System.out.println(c);
	        }
	 
	        
	 
	        System.out.println("\nprint customers by diapazon credit card:");
	        List<Customer> listSortByDiapazonCreditCard = market.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
	        for (Customer c : listSortByDiapazonCreditCard) {
	            System.out.println(c);
	        }
	 
	 
	    }
	}
	 
	class Shop {
	    private String shopName;
	    private ArrayList<Customer> customersList = new ArrayList<>();
	 
	    Shop(String shopName) {
	        this.shopName = shopName;
	    }
	 
	    void addCustomerToShopList(Customer customer) {
	        customersList.add(customer);
	    }
	 
	    List<Customer> getListByName() {
	        List<Customer> list = new ArrayList<>(customersList);
	        Collections.sort(list, new Comparator<Customer>() {
	            @Override
	            public int compare(Customer o1, Customer o2) {
	                return o1.getName().compareToIgnoreCase(o2.getName());
	            }
	        });
	        return list;
	    }
	 
	    List<Customer> getListByName2() {
	        List<Customer> list = new ArrayList<>(customersList);
	        Collections.sort(list, new Comparator<Customer>() {
	            @Override
	            public int compare(Customer o1, Customer o2) {
	                return o1.getName2().compareToIgnoreCase(o2.getName2());
	            }
	        });
	        return list;
	    }
	 
	    List<Customer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
	        List<Customer> list = new ArrayList<>();
	        for (Customer c : customersList) {
	            if (c.getCreditCardId() >= diapazonStart && c.getCreditCardId() <=diapazonEnd) {
	                list.add(c);
	            }
	        }
	 
	        return list;
	    }
	 
	 
	 


	   
	}


