package lab3;

public class Main {

    public static void main(String[] args)
	{
	TelephoneBook telephoneBook = new TelephoneBook();
	telephoneBook.AddContact(new Contact("Иван","Иванов"));
	telephoneBook.AddContact(new Contact("Ольга","Иванова"));
	telephoneBook.AddContact(new Contact("",""));
	telephoneBook.AddContact(new Contact("Мама",""));
	telephoneBook.AddContact(new Contact("","Парикмахерская"));
	telephoneBook.AddNumber(1,"+8134313145",Type.мобильный);
	telephoneBook.AddNumber(1,"+7351345113",Type.рабочий);
	telephoneBook.AddNumber(1,"+7433434111",Type.домашний);
	telephoneBook.AddNumber(2,"+7134513536",Type.мобильный);
	telephoneBook.AddNumber(2,"+7351134111",Type.рабочий);
	telephoneBook.AddNumber(4, "+8135134431",Type.мобильный);
	telephoneBook.AddNumber(5 ,"+7453153241",Type.рабочий);
	System.out.println(telephoneBook);
	telephoneBook.DeleteContact(3);
	telephoneBook.DeleteNumber(1, 3);
	telephoneBook.AddNumber(3, "89345234543", Type.рабочий);
	telephoneBook.RedactContactName(4, "", "Салон");
	System.out.println(telephoneBook);
	System.out.println(telephoneBook.Search("н"));
    }
}
