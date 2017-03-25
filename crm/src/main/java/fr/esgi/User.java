package fr.esgi;

import lombok.AllArgsConstructor;

import static org.apache.commons.lang.StringUtils.isNotBlank;

@AllArgsConstructor
public class User {

    private String firstname;
    private String lastname;
    private Integer age;

    public boolean isValid() {
        return isNotBlank(this.firstname)
                && isNotBlank(this.lastname)
                && this.age != null
                && this.age >= 7
                && this.age <= 77;
    }
}
