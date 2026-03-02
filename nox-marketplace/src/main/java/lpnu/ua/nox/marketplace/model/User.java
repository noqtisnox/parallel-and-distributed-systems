package lpnu.ua.nox.marketplace.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lpnu.ua.nox.marketplace.model.enums.UserRole;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String email;
    private UserRole role;
}
