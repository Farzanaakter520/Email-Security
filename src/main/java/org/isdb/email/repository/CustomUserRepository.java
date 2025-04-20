package org.isdb.email.repository;

import org.isdb.email.model.CustomUser;

public interface CustomUserRepository {
	CustomUser findCustomUserByEmail(String email);
}
