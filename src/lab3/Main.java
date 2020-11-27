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
	telephoneBook.AddNumber(1,"+8134313145",Type.mobile);
	telephoneBook.AddNumber(1,"+7351345113",Type.office);
	telephoneBook.AddNumber(1,"+7433434111",Type.home);
	telephoneBook.AddNumber(2,"+7134513536",Type.mobile);
	telephoneBook.AddNumber(2,"+7351134111",Type.office);
	telephoneBook.AddNumber(4, "+8135134431",Type.mobile);
	telephoneBook.AddNumber(5 ,"+7453153241",Type.office);
	System.out.println(telephoneBook);
	try {
		telephoneBook.DeleteContact(3);
	}
	catch (IndexOutOfBoundsException e)
	{
		System.out.println("Not possible to delete the contact");
	}
	try {
		telephoneBook.DeleteNumber(1, 3);
	}
	catch (IndexOutOfBoundsException e)
	{
		System.out.println("Not possible to delete the number");
	}
	try {
		telephoneBook.AddNumber(3, "89345234543", Type.office);
	}
	catch (IndexOutOfBoundsException e)
	{
		System.out.println("Not possible to add the number");
	}
		try {
			telephoneBook.RedactContactName(4, "", "Салон");
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Not possible to redact the contact's name");
		}
	System.out.println(telephoneBook);
	System.out.println(telephoneBook.Search("н"));
    }
}
