package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordUtilTest {
    @Test
    void shouldCheckEncryptPassword() {
        var passwordUtil = new PasswordUtil();
        var password = "Pa$$word";

        String encryptedPassword = "gK5mpD3WnEr9KYh3BLkOb9fpMJvHCrDNCBM5qzpl2iv6wD65UE8MRKUwQXvCNOEf";
        boolean checkPassword = passwordUtil.checkPassword(password, encryptedPassword);

        assertTrue(checkPassword);
    }
}
