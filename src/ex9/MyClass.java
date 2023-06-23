package ex9;

public class MyClass<T> {
    private T value;
    private MyClass(T val){
        this.value =val;
    }
    private MyClass(){
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> MyClass<T> factoryMethod(){
        return new MyClass<>();
    }

    public static <T> MyClass<T> factoryMethod(T value){
        return new MyClass<>(value);
    }
}

class Main{
    public static void main(String[] args) {
        MyClass<String> stringMyClass = MyClass.factoryMethod();
        stringMyClass.setValue("String value");
        System.out.println(stringMyClass.getValue());
        MyClass<Integer> integerMyClass = MyClass.factoryMethod(12);
        System.out.println(integerMyClass.getValue());
    }
}
