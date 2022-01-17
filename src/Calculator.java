public class Calculator {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
        Validation validation = new Validation(5);
        validation.validation();
        switch (validation.validation()) {
            case 1:

        }
    }
}
