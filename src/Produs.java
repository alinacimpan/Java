public class Produs {
    long id;
    String nume;
    String categorie;
    String descriere;
    Double pret;

    public Produs(long id, String nume, String categorie , String descriere, double pret)
    {
        this.id  = id;
        this.nume = nume;
        this.categorie = categorie;
        this.descriere = descriere;
        this.pret = pret;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getnume() {
        return nume;
    }

    public void setnume(String nume) {
        this.nume = nume;
    }

    public String getcategorie() {
        return categorie;
    }

    public void setcategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getdescriere() {
        return descriere;
    }

    public void setdescriere(String descriere) {
        this.descriere = descriere;
    }

    public Double getpret() {
        return pret;
    }

    public void setpret(Double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", categorie='" + categorie + '\'' +
                ", descriere='" + descriere + '\'' +
                ", pret=" + pret +
                '}';
    }


}
