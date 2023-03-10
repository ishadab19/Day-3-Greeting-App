package com.bridgelabz.greetingsapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Data==Getter+Setter
public class User {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        String str = (firstName!= null)? firstName+" ": " ";
        str += (lastName != null) ? lastName:" ";
        return str.trim();
    }
}