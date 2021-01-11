package HomeWorkLogin;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        User ivan = new User("medved","12345");


        UserLoginService loginService = new UserLoginService();
        System.out.println(loginService.login(ivan,"12345"));
        System.out.println(loginService.login(ivan,"1"));
        System.out.println(loginService.login(ivan,"1"));
        System.out.println(loginService.login(ivan,"1"));
    }
}
