package com.devsuperior.movieflix.services;

import javax.validation.Valid;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	private static org.jboss.logging.Logger logger = LoggerFactory.logger(UserService.class);
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	  private AuthService authService;

	  @Transactional(readOnly = true)
		public UserDTO getProfile() {
			return new UserDTO(authService.authenticated());
		}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repository.findByEmail(username);
		if (user == null) {
			logger.error("User not found" + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("User found" + username);
		return user;
	}

	public Page<UserDTO> findAllPaged(Pageable pageable) {
		return null;
	}

	public UserDTO findById(Long id) {
		return null;
	}

	public UserDTO insert(@Valid UserDTO dto) {
		return null;
	}

	public UserDTO update(Long id, @Valid UserDTO dto) {
		return null;
	}
	
}
