package BuilderPattern;

public class User {
    private String username;
    private String email;
    private int age;

    private User(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private String username;
        private String email;
        private int age;

        public Builder(String username) {
            this.username = username;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}