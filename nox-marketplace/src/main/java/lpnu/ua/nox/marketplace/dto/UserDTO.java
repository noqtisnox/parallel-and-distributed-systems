package lpnu.ua.nox.marketplace.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class UserDTO {
    private Long id;

    @NotBlank(message = "Username should not be empty")
    private String username;

    @NotBlank(message = "Email should not be empty")
    private String email;

    private String role;
}
