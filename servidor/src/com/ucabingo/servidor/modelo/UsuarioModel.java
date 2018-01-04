package com.ucabingo.servidor.modelo;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import com.ucabingo.servidor.dto.Usuario;

public class UsuarioModel {
	
	private SessionManager sessionManager;

	public UsuarioModel() {
		sessionManager = new SessionManager();
	}
	
	public void createUser(Usuario user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		sessionManager.getSession().persist(user);
		sessionManager.getSession().getTransaction().commit();
	}
	
	public boolean logInUser(String username, String password) {
		
		Usuario usuario = this.findUserByName(username);
		if (usuario != null) {
			System.out.println(usuario.toString());
			return BCrypt.checkpw(password, usuario.getPassword());
		} else {
			return false;
		}
		
	}
	
	public Usuario findUserById(Long id) {
		
		return (Usuario) sessionManager.getSession().createQuery("from Usuario where id = :id")
				.setParameter("id", id).getSingleResult();
	}
	
	public Usuario findUserByName(String username) {
		
		return (Usuario) sessionManager.getSession().createQuery("from Usuario where username = :username")
				.setParameter("username", username).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> findAllUsers() {
		
		return sessionManager.getSession().createQuery("from Usuario").getResultList();
	}

}
