package org.isdb.email.model;

import java.util.Collection;
import java.util.Collections;

import org.isdb.email.constants.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public record CustomUserDetails(User user) implements UserDetails {

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	public Long getId() {
		return user.getId();
	}

	public String getEmail() {
		return user.getEmail();
	}

	public Role getRole() {
		return user.getRole();
	}
}
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class CustomUserDetails extends CustomUser implements UserDetails {
//
//	private static final List<GrantedAuthority> ROLE_USER = Collections
//			.unmodifiableList(AuthorityUtils.createAuthorityList("ROLE_USER"));
//
//	public CustomUserDetails(CustomUser customUser) {
//		super(customUser.getId(), customUser.getEmail(), customUser.getPassword());
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return ROLE_USER;
//	}
//
//	@Override
//	public String getUsername() {
//		return getEmail();
//	}
//
//}
