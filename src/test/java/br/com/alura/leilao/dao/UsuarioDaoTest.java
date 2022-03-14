package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.Usuario;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioDaoTest {

    private UsuarioDao dao;

    private EntityManager em;

    @Test
    void testeBuscaDeUsuarioPeloUsername() {
        this.dao = new UsuarioDao(em);
        Usuario usuario = dao.buscarPorUsername("fulano");
        assertNotNull(usuario);
    }

}