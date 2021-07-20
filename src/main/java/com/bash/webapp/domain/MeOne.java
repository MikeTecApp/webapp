package com.bash.webapp.domain;

@Entity
public class MeOne {
    private int id;
    private String Name;
    private String family;

    public MeOne() {
    }

    public MeOne(String name, String family) {
        Name = name;
        this.family = family;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
