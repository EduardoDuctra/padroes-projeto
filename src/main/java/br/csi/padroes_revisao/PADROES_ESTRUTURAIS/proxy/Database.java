package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.proxy;

public interface Database {

    String query(String sql);
    void authenticate(String username, String password);


}
