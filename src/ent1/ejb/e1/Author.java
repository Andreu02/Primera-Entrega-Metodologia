package ent1.ejb.e1;

public class Author {
    //ZONA DE ATRIBUTOS
    private String name;
    private String email;

    //ZONA DE METODOS
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}
