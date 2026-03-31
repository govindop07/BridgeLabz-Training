package Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AdminService {

    @RoleAllowed("ADMIN")
    void deleteUser(String role) {
        if (!role.equals("ADMIN")) {
            System.out.println("Access Denied!");
            return;
        }
        System.out.println("User deleted");
    }
}

public class RoleAllowedAnnotation {
    public static void main(String[] args) {
        AdminService service = new AdminService();
        service.deleteUser("USER");
        service.deleteUser("ADMIN");
    }
}
