package HomeWorkUserV1;

public class UserValidationDemo {

    public static void main(String[] args) {
        User validUser = new User("Ivan","Ivanov",30);
        User invalidUser = new User("Iv","Ivanov",13);
        User invalidUser2 = new User("Ivan","I",40);
        User invalidUser3 = new User("Ivan","Ivanov",-2);
        UserValidationService validationService = new UserValidationService();
        System.out.println("validUser: ");
        validationService.validate(validUser);
        System.out.println("-------------------------------------------------------");
        System.out.println("invalidUser: ");
        validationService.validate(invalidUser);
        System.out.println("-------------------------------------------------------");
        System.out.println("invalidUser2: ");
        validationService.validate(invalidUser2);
        System.out.println("-------------------------------------------------------");
        System.out.println("invalidUser3: ");
        validationService.validate(invalidUser3);
        System.out.println("-------------------------------------------------------");
        System.out.println("Test results, case1: ");
        UserValidationServiceTest.shortFirstNameTest();
        System.out.println("-------------------------------------------------------");
        System.out.println("Test results, case2: ");
        UserValidationServiceTest.shortLastNameTest();
        System.out.println("-------------------------------------------------------");
        System.out.println("Test results, case3: ");
        UserValidationServiceTest.wrongAgeTest();




    }
}
