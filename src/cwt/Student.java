package cwt;

public class Student {
    private String _name;
    private int _age;
    private String _location;

    Student(String name,int age,String location){
        this._name=name;
        this._age=age;
        this._location=location;
    }
    public String getName(){
        return this._name;
    }
    public int getAge(){
        return this._age;
    }
    public String getLocation(){
        return this._location;
    }
}
