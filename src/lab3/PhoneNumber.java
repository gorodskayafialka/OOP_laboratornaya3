package lab3;

enum Type
{
    mobile,
    office,
    home
}


//Класс PhoneNumber хранит информацию о телефонном номере: сам номер и его тип

public class PhoneNumber {
    private String Number;
    private Type type;
    PhoneNumber(String Number, Type type)
    {
        this.Number = Number;
        this.type = type;
    }
    public String getNumber() {
        return Number;
    }
    public Type getType() {
        return type;
    }
}
