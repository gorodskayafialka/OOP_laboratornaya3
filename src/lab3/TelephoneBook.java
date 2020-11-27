package lab3;

import java.util.ArrayList;

/*
Класс TelephoneBook хранит список контактов и позволяет добавлять, удалять и редактировать контакты,
а также реализует поиск по подстроке
*/

public class TelephoneBook {
    private ArrayList <Contact> contacts;
    //Конструктор
    TelephoneBook()
    {
        contacts = new ArrayList<>();
    }
    //Добавление контакта
    void AddContact(Contact contact)
    {
        contacts.add(contact);
    }
    //Удаление контакта по индексу (Здесь и далее предполагается, что пользователь номерует
    //контакты и номера с 1, а не с 0)
    void DeleteContact(int index) throws IndexOutOfBoundsException //("Impossible to")
    {
            contacts.remove(index-1);
    }
    //Редактирование имени контакта по индексу
    void RedactContactName(int index, String Name, String Surname) throws IndexOutOfBoundsException
    {
            Contact contact = contacts.get(index - 1);
            if ((Name != "") || (Surname != ""))
                contact.setName(Name);
            else
                contact.setName("No Name");
            contact.setSurname(Surname);
    }
    //Добавление номера к контакту по индексу
    void AddNumber(int index, String number, Type type) throws IndexOutOfBoundsException
    {
            Contact contact = contacts.get(index - 1);
            contact.AddNumber(number, type);
    }
    //Удаление номера из контакта по индексам
    void DeleteNumber(int contactIndex, int numberIndex) throws IndexOutOfBoundsException
    {
            Contact contact = contacts.get(contactIndex - 1);
            contact.DeleteNumber(numberIndex - 1);
    }
    //Поиск во всех контактах по подстроке
    ArrayList<Contact> Search(String substring)
    {
        ArrayList<Contact> result = new ArrayList<>();
        for (Contact current:contacts)
        {
            if (current.toString().toLowerCase().contains(substring.toLowerCase()))
            result.add(CopyContact(current));
        }
        return result;
    }
    //Копирование контакта (чтобы не возвращать в поиске непосредственно хранимые в книге контакты)
    private Contact CopyContact (Contact contact)
    {
        Contact copycontact = new Contact(contact.getName(), contact.getSurname());
        for (PhoneNumber number: contact.getPhoneNumbers()) {
            copycontact.AddNumber(number.getNumber(),number.getType());
        }
        return copycontact;
    }
    //toString
    public String toString()
    {
        String result = "";
        for (Contact current:contacts)
        {
            result += (contacts.indexOf(current)+1) + ": " + current.toString() + '\n';
        }
        return result;
    }
}
