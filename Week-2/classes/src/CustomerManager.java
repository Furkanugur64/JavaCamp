public class CustomerManager {

    private int id;
    private String Name;
    private String Surname;

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

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void Add(){
        System.out.println("Müşteri Eklendi.");
    }

    public void Remove(){
        System.out.println("Müşteri Silindi.");
    }

    public void Update(){
        System.out.println("Müşteri Güncellendi.");
    }
}
