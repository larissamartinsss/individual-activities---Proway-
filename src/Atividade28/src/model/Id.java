package model;

public class Id {
    public int id;
    public void id(){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Id)) return false;
        Id id1 = (Id) o;
        return id == id1.id;
    }

}
