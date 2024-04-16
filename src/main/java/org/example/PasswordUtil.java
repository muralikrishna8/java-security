package org.example;

import org.jasypt.util.password.StrongPasswordEncryptor;

class PasswordUtil {
    public String encryptPassword(String password) {
        return new StrongPasswordEncryptor().encryptPassword(password);
    }

    public boolean checkPassword(String password, String encryptedPassword) {
        return new StrongPasswordEncryptor().checkPassword(password, encryptedPassword);
    }
}
