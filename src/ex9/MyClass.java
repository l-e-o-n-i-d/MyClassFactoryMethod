package ex9;

public class MyClass<T> {
    private T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public static <T> MyClass<T> factoryMethod(){
        return new MyClass<>();
    }
}
class Main{
    public static void main(String[] args) {
        MyClass<String> stringMyClass = MyClass.factoryMethod();
        stringMyClass.setValue("String value");
        System.out.println(stringMyClass.getValue());
    }
}
