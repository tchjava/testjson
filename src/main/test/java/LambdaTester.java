import org.junit.Test;

public class LambdaTester {
    final static String salutation = "Hello";
    final String key1 = "Hello";
    public static void main(String[] args) {
        GreetingService service=message->
            System.out.println(salutation+message);
        service.sayMessage("shiyanlou");
    }
    interface GreetingService{
        void sayMessage(String message);
    }


    @Test
    public void fun1() {
        String key = "hello";
        GreetingService service=message->
                System.out.println(key1+message);
        service.sayMessage("shiyanlou");
    }

    @Test
    public void fun2() {
        String key = "%sxx%s";
        String str = "HelloWorld";
        String result=String.format(key,str,"你好吗");
        System.out.println(result);
    }

    @Test
    public void fun3() {
        String str = "";
        str = "123";
        System.out.println(str);
    }

}
