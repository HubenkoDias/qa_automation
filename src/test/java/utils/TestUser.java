package utils;

public enum TestUser {
    QA("HHUB_QA_EMAIL", "HHUB_QA_PASSWORD"),
    COMPANY("HHUB_COMPANY_EMAIL", "HHUB_COMPANY_PASSWORD"),
    ADMIN("HHUB_ADMIN_EMAIL", "HHUB_ADMIN_PASSWORD"),
    WRONG_CREDS ("HHUB_WRONG_EMAIL", "HHUB_WRONG_PASWWORD");


    private final String emailVar;
    private final String passwordVar;

    TestUser(String emailVar, String passwordVar) {
        this.emailVar = emailVar;
        this.passwordVar = passwordVar;
    }
    public String email() {
        return TestConfig.requireEnv(emailVar);
    }

    public String password() {
        return TestConfig.requireEnv(passwordVar);
    }
}
