package org.personal.loginPage.dao;

import org.personal.loginPage.modal.Login;


public interface LoginDao {
    Login findOne(Login login);
}
