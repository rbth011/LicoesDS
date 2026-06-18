/**
 * Classe ControleDeAumento
 * Requisitos:
 * - Atributo privado totalDeAumento (double) para acumular o valor total
 * - Método registrar(Funcionario funcionario): adiciona ao total o valor
 *   retornado pelo método aumentarSalario() do funcionário
 * - Método getTotalDeAumento(): retorna o total acumulado de aumentos
 */
public class ControleDeAumento {

    private double totalDeAumento;

    public void registrar(Funcionario funcionario) {
        // TODO: implementar
        // dica: use o polimorfismo - chame funcionario.aumentarSalario()
        // e acumule o resultado em totalDeAumento
    }

    public double getTotalDeAumento() {
        // TODO: implementar
        return 0;
    }
}
