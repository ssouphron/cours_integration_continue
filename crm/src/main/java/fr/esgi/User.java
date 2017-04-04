package fr.esgi;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static org.apache.commons.lang.StringUtils.isNotBlank;

@AllArgsConstructor
@NoArgsConstructor
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
