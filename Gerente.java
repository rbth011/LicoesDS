/**
 * Classe Gerente
 * Requisitos:
 * - Deve estender a classe Funcionario
 * - Atributo adicional: matricula (String)
 * - Getter e setter para a matrícula
 * - Sobrescrever aumentarSalario() para retornar 20% do salário
 */
public class Gerente extends Funcionario {

    private String matricula;

    // TODO: criar o construtor (nome, cpf, salario, matricula)
    //       lembre-se de chamar super(nome, cpf, salario)

    public String getMatricula() {
        // TODO: implementar
        return null;
    }

    public void setMatricula(String matricula) {
        // TODO: implementar
    }

    /**
     * Sobrescrever para retornar 20% do salário.
     */
    @Override
    public double aumentarSalario() {
        // TODO: implementar
        return 0;
    }
}
