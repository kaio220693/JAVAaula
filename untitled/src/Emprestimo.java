public class Emprestimo {
    private int data_emprestimo;
    private int data_devolucao;

    public int getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(int data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public int getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(int data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Emprestimo(int data_emprestimo, int data_devolucao) {
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }
}
