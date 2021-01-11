package HomeWorkUserV1;

public class UserValidationService {

    public  String validate(User user) {

        String firstName = user.getFirstName();
        int nameLength = firstName.length();
        if (nameLength > 3 && nameLength < 15) {
            System.out.println("Имя введено правильно");

        } else {
            System.out.println(UserValidationException.INVALID_NAME_ERROR);
            return UserValidationException.INVALID_NAME_ERROR;
        }

        String lastName = user.getLastName();
        int lastLength = lastName.length();
        if (lastLength > 3 && lastLength < 15) {
            System.out.println("Фамилия введена правильно");

        } else {
            System.out.println(UserValidationException.INVALID_LASTNAME_ERROR);
            return UserValidationException.INVALID_LASTNAME_ERROR;
        }

        int Age = user.getAge();
        if(Age > 0 && Age <= 120) {
            System.out.println("Возраст введен правильно");

        } else {
            System.out.println(UserValidationException.INVALID_AGE_ERROR);
            return UserValidationException.INVALID_AGE_ERROR;
        }

        return "User is valid";


    }
}
