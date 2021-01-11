package HomeWorkLogin;

public class UserLoginService {

    public  boolean login(User user, String passOfComparison) {
        String dataBasePassword = user.getPassword();
        boolean chekingPassword = dataBasePassword.equals(passOfComparison);

        if ((user.isBlock() == false)&&(chekingPassword==false)) {
            user.setTries(user.getTries() - 1);
            System.out.println("Количество попыток: " + user.getTries());
        }
        if (user.getTries() == 0) {
            user.setBlock(true);
            System.out.println("Количество попыток ввода 0. Пользователь заблокирован!");
        }
        if ((chekingPassword==true) && (user.isBlock() == false)) {
            user.TriesReset(); // tries = 3
            System.out.println("Пароль введен правильно");
        }


        return chekingPassword;
    }




}