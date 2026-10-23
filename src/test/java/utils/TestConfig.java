package utils;

public final class TestConfig {
    public static final String BASE_URL =
            System.getProperty("baseUrl", "https://hhub-mdwm.vercel.app");
    private TestConfig() {

    }
    public static String requireEnv(String name) {
        String value = System.getenv(name);
        if (value == null || value.isBlank()) {
            throw new IllegalStateException("An environment variable is not defined: " + name);
        }
        return value;
    }
}