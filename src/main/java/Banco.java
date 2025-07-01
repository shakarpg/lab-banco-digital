import lombok.Data;
import java.util.List;

@Data // Anotação do Lombok para gerar getters, setters, etc.
public class Banco {

    private String nome;
    private List<Conta> contas;

}