package oop.Adult;

public class Adult {
    private String name;
    private int height;
    private String profession;

    public Adult(String name, int height, String profession){
        this.setName(name);
        this.setHeight(height);
        this.setProfession(profession);
    }

    public Adult(String name, int height){
        this.setName(name);
        this.setHeight(height);
    }

    public Adult(Adult other){
        this.setName(other.getName());
        this.setHeight(other.getHeight());
        this.setProfession(other.getProfession());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String print() {
        if (this.profession != null) {
            return "Name:" + this.name + " Height:" + this.height + " Profession:" + this.profession;
        }else return "Name:" + this.name + " Height:" + this.height;
    }


}
