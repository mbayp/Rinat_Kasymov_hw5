class Hero {
    private int health;
    private int damage;
    private String superpower;


    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superpower = "No superpower";
    }


    public int getHealth() {
        return health;
    }


    public int getDamage() {
        return damage;
    }


    public String getSuperpower() {
        return superpower;
    }
}

class Boss {
    private int health;
    private int damage;
    private String defenseType;


    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }


    public int getDamage() {
        return damage;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }


    public String getDefenseType() {
        return defenseType;
    }


    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }



    Hero[] heroes = createHeroes();
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(210, 240, "Super Strength");
        Hero hero2 = new Hero(200, 25);
        Hero hero3 = new Hero(180, 21, "Telekinesis");

        // Создаем массив и помещаем в него героев
        Hero[] heroes = {hero1, hero2, hero3};

        return heroes;
    }
}