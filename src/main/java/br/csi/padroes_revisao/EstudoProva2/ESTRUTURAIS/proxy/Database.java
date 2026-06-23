package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.proxy;

public interface Database {

    String query(String sql);
    void authenticate(String username, String password);

}
