package Assignment_8;

class InvalidCredentials extends Exception {
    InvalidCredentials(String string) {
        super(string);
    }
}

class InvalidName extends InvalidCredentials {
    InvalidName(String string) {
        super(string);
    }
}

class InvalidPassword extends InvalidCredentials {
    InvalidPassword(String string) {
        super(string);
    }
}

class InvalidAge extends InvalidCredentials {
    InvalidAge(String string) {
        super(string);
    }
}

public class Assignment8 {
    public static void validateCredentials(String name, String password, int age) {
        try {
            if (name == null || name.length() < 2 || name.length() > 80) {
                throw new InvalidName("Invalid Name");
            }
            if (password == null || password.length() < 4 || password.length() > 80){
                throw new InvalidPassword("Invalid Password");
            }
            if(age < 18 || age > 110) {
                throw new InvalidAge("Invalid age");
            }
        }
        catch (InvalidCredentials  | NullPointerException exception) {
            exception.printStackTrace();
        }
    }
    public static void main(String[] args){
        try {
          validateCredentials("John", "abc123", 18);
          //  throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("It is Finally block");
        }
    }
}
