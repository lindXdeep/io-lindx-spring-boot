package io.lindx.boot.service;

import io.lindx.boot.model.User;

public interface UserService {
  User getUser(final Long id);
}
