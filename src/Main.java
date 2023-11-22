import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PersonDbAccessException {

//        Person person = new Person();
//        person.setAge(-20); // Error

//        System.out.println(person.getAge());

//        PersonService personService = new PersonService();
//        personService.getNameUpperCase(person);

//        person.getNameUpperCase();
//        person.hasSkill("programare");

        // Exception -> Checked(Verificata) Exception
        // RuntimeException -> Unchecked(Ne verificata) Exception
        // Exception de la java
        // Exception care facem throw noi

        // NullPointerException - null.methodCall();
        // ArrayIndexOutOfBounds - list.get(10000000000);
        // ArithmeticException - 5 / 0;


//        personService.getMonthlySalary(person);

//        String[] array = new String[2];
//        String a = array[40];

//        List<String> list = new ArrayList<>();
//        String res = list.get(1000);


//        Person person = new Person();

//        try {
//            person.setAge(-100);
//        } catch (Exception e) {
//            System.out.println("Varsa nu poate fi negativa");
//        }
//
//        System.out.println("Am ajuns aici");

//        try {
//            person.setAge(-100);
//        } catch (Exception e) {
//            System.out.println("Varsa nu poate fi negativa");
//            System.out.println("Am prins un Runtime Exception");
//            // trimite email / sms
//        }

//        System.out.println(person.getAge());
//
//        System.out.println("Am ajuns aici");

        // try / catch ?
//
//        while (1 == 1) { // infinite loop -> StackOverflowError
//           String a = new String("a");
//        } // StackOverflowError
//

//        Person person = new Person();
//        person.setAge(-20);

        PersonService personService = new PersonService();
        try {
            personService.findPersonInDatabase("Ion");
        } catch (PersonDbAccessException e) {
            System.out.println("Am prins exceptia, mergem mai departe :)");
        }

        System.out.println("Am ajuns aici");

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//
//            }
//        }

    }
}