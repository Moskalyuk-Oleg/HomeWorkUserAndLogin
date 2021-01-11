package HomeWorkUserV1;

import static HomeWorkUserV1.UserValidationException.*;

public class UserValidationServiceTest {
    public static void shortFirstNameTest() {
        User user = new User("Iv", "Ivanov", 20);
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validate(user);

        if (INVALID_NAME_ERROR.equals(actualValidationMessage)) {
            System.out.println("ShortFirstNameTest Пройден");
        } else {
            System.out.println("ShortFirstNameTest Не пройден");
        }
    }

    public static void shortLastNameTest () {
        User user2 = new User("Ivan", "Iv", 25);
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage2 = validationService.validate(user2);
            if (INVALID_LASTNAME_ERROR.equals(actualValidationMessage2)) {
                System.out.println("shortLastNameTest Пройден");
            } else {
                System.out.println("shortLastNameTest Не пройден");
            }
        }

    public static void wrongAgeTest () {
        User user3 = new User("Ivan", "Ivanov", -1);
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage3 = validationService.validate(user3);
        if (INVALID_AGE_ERROR.equals(actualValidationMessage3)) {
            System.out.println("wrongAgeTest Пройден");
        } else {
            System.out.println("wrongAgeTest Не пройден");
        }
    }

}
