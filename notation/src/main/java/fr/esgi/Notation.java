package fr.esgi;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Notation {

    private User user;
    private Integer note;

    public boolean canAddNote() {
        return this.user != null
                && this.user.isValid()
                && this.note != null
                && this.note >= 0
                && this.note <= 20;
    }
}
