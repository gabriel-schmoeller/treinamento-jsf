package treinamentojsf.manegedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "constantes")
public class Constantes {
    private final String titulo = "GerBib";
    private final String h1 = "Sistema de Gerenciamento de Biblioteca - GerenBib";
    private final String cadastrar = "Cadastrar";
    private final String apagar = "Apagar";
    private final String editar = "Editar";
    private final String msgBoasVindas = "Bem-vindos ao GerBib - Sistema de Gerenciamento de Biblioteca!";

    public String getH1() {
        return h1;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getCadastrar() {
        return cadastrar;
    }
    public String getApagar() {
        return apagar;
    }
    public String getEditar() {
        return editar;
    }
    public String getMsgBoasVindas() {
        return msgBoasVindas;
    }
}
