public class Weapon {
    private int id;
    private String name;
    private int damage;
    private int price;

    public Weapon(String name, int id, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList = {
                new Weapon("Tabanca",1,2,15),
                new Weapon("Kılıç",2,3,35),
                new Weapon("Tüfek",3,7,45 )
        };
        return weaponList;
    }

    public static Weapon getWeaponObjById(int id){
        for (Weapon w : Weapon.weapons()){
            if(w.getId() == id)
                return w;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
