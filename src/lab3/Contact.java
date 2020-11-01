package lab3;

import java.util.ArrayList;

/*
Класс Contact хранит информацию о контакте: имя, фамилию и список телефонов и позволяет их редактирование:
изменение имени/фамилии, добавление и удаление номеров
*/

class Contact {
    private String Name;
    private String Surname;
    private ArrayList <PhoneNumber> phoneNumbers;
    //Конструктор
    Contact(String Name, String Surname)
    {
        if ((Name != "")|| (Surname!=""))
            this.Name = Name;
        else
            this.Name = "No Name";
        this.Surname = Surname;
        phoneNumbers = new ArrayList<PhoneNumber>();
    }
    //Добавление номера
    void AddNumber (String number, Type type)
    {
        phoneNumbers.add(new PhoneNumber(number, type));
    }
    //Удаление номера (предполагается, что пользователь номерует номера с 1)
    void DeleteNumber (int index)
    {
        phoneNumbers.remove(index);
    }
    //toString

    public String toString()
    {
        String result = "";
        if ((Name!="") && (Surname!= ""))
            result += Name  + " " + Surname;
        else if (Name!="") result += Name;
        else result += Surname;
        for (PhoneNumber current : phoneNumbers) {
            result += " " + current.getNumber();
            if (current != phoneNumbers.get(phoneNumbers.size() - 1))
                result += ",";
        }
        return result;
    }
    //геттеры и сеттеры
    String getName()
    {
        return Name;
    }
    void setName(String Name)
    {
        this.Name = Name;
    }
    String getSurname()
    {
        return Surname;
    }
    void setSurname(String Surname)
    {
        this.Surname = Surname;
    }

    public ArrayList<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
}
