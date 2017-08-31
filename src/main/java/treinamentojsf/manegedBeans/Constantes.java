package treinamentojsf.manegedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "constantes")
public class Constantes {
    private final String titulo        = "GerBib";
    private final String h1            = "Sistema de Gerenciamento de Biblioteca - GerenBib";
    private final String cadClientes   = "Cadastrar Clientes";
    private final String delClientes   = "Apagar Clientes";
    private final String ediClientes   = "Editar Clientes";
    private final String psqClientes   = "Pesquisar Clientes";
    private final String cadLivros     = "Cadastrar Livros";
    private final String delLivros     = "Apagar Livros";
    private final String ediLivros     = "Editar Livros";
    private final String psqLivros     = "Pesquisar Livros";
    private final String cadEmprest    = "Cadastrar Empréstimos";
    private final String delEmprest    = "Apagar Empréstimos";
    private final String ediEmprest    = "Editar Empréstimos";
    private final String psqEmprest    = "Pesquisar Empréstimos";
    private final String devolucao     = "Devolução de Livro";
    private final String msgBoasVindas = "Bem-vindos ao GerBib - Sistema de Gerenciamento de Biblioteca!";
    private final String historia      = "Histórico do sistema";

    public String getTitulo() {
        return titulo;
    }
    public String getH1() {
        return h1;
    }
    public String getCadClientes() {
        return cadClientes;
    }
    public String getDelClientes() {
        return delClientes;
    }
    public String getEdiClientes() {
        return ediClientes;
    }
    public String getPsqClientes() {
        return psqClientes;
    }
    public String getCadLivros() {
        return cadLivros;
    }
    public String getDelLivros() {
        return delLivros;
    }
    public String getEdiLivros() {
        return ediLivros;
    }
    public String getPsqLivros() {
        return psqLivros;
    }
    public String getCadEmprest() {
        return cadEmprest;
    }
    public String getDelEmprest() {
        return delEmprest;
    }
    public String getEdiEmprest() {
        return ediEmprest;
    }
    public String getPsqEmprest() {
        return psqEmprest;
    }
    public String getDevolucao() {
        return devolucao;
    }
    public String getMsgBoasVindas() {
        return msgBoasVindas;
    }
    public String getHistoria() {
        return historia;
    }
}
