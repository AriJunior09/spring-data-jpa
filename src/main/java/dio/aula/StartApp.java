package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  // Obrigatorio informar essa anotação para dizer que é um objeto gerenciado pelo Spring
public class StartApp implements CommandLineRunner {
    @Autowired                          // Para criar a injeção
    private UserRepository repository;  // Injetando o repositorio
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Ari");
        user.setUsername("arijunior09");
        user.setPassword("arijr123");

        repository.save(user);

    }
}
