public class UserValidation {

    public static void validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, а также быть не длиннее 20 символов.");
        }

        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, а также быть не длиннее 20 символов.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Введены разные пароли.");
        }
    }
}