public class PersonService {


    public String getNameUpperCase(Person person) {
        return person.getNameUpperCase();
    }

//    public Person findPersonInDatabase(String name) throws Exception {
//        //if(can connect to DB) {
//        // code to connect to DB
//        //} else {
//        // throw new Exception("Nu aveti drepturi sa va conectati la DB");
//        //  }
//    }

    public Person findPersonInDatabase(String name) throws PersonDbAccessException {
        if (true) {
            throw new PersonDbAccessException("Nu aveti acces la baza de date");
        }

        return new Person();
    }

    public int getMonthlySalary(Person person) {
        if(person.getSalariuAnual() != 0) {
           return  12 / person.getSalariuAnual();
        }
        return 0; // ArithmeticException -> RuntimeException
    }

}
