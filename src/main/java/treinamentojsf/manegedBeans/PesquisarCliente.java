package treinamentojsf.manegedBeans;

import treinamentojsf.entity.Clientes;

import javax.faces.bean.ManagedBean;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "psqCli")
public class PesquisarCliente {

    ArrayList<Clientes> tabClientes;

    private void atualizarTabela() {
        try {
            tabCli.getDataVector().clear();// limpa a tabela
            List<Clientes> lista_pessoa = new ArrayList();// lista dos objetos
            lista_pessoa = Sessao.getSessao().createQuery(pes).list();// aki é a pesquisa que popula meu list
            if (!lista_pessoa.isEmpty()) {// aki verifica se a list nao esta vazia
                for (Pessoa p : lista_pessoa) {// aki ele percorre minha list
                    dtmcliente.addRow(new Object[]{p.getId(), p.getNome(), p.getTelefone(), p.getEndereco()});// adiciona na jtbale
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela\n" + e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }
}
