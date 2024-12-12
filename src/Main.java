public class Main {
    public static void main(String[] args) {
        try {
            UserValidation.validateCredentials("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Есть доступ.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}