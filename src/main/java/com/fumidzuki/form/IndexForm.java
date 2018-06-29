package com.fumidzuki.form;

import javax.validation.constraints.NotBlank;

public class IndexForm {

    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
