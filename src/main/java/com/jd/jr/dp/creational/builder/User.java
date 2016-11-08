package com.jd.jr.dp.creational.builder;

/**
 * User: 吴海旭
 * Date: 2016-11-08
 * Time: 下午7:06
 */
public class User {
    private final String firstName; // 必须
    private final String lastName;  // 必须
    private final int age;  // 可选
    private final String phone; // 可选
    private final String address;   // 可选

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder implements Builder<User> {
        private final String firstName; // 必须
        private final String lastName;  // 必须
        private int age;  // 可选
        private String phone; // 可选
        private String address;   // 可选

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            // 可以加一些校验
            if (user.getAge() > 120) {
                throw new IllegalArgumentException("非法年龄");
            }
            return user;
        }
    }
}
