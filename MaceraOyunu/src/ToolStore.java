public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("-------------Mağazaya Hoşgeldiniz.--------------------");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçimiz : ");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase > 3){
                System.out.print("Geçerli bir değer giriniz :");
                selectCase = input.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz !");
                    showMenu = false;

            }
        }
            return true;
    }



    public  void printWeapon(){
        System.out.println("------------ Silahlar ---------------");

        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId()  + "-" + w.getName() + " <Para : " + w.getPrice() + " , Hasar : " + w.getDamage() + " >");
        }
        System.out.println("0 - Çıkış Yap.");
    }

    public void buyWeapon(){
        System.out.print("Bir silah seçiniz : ");

        int selectWeaponId = input.nextInt();
        while (selectWeaponId < 0 || selectWeaponId > Weapon.weapons().length){
            System.out.print("Geçerli bir değer giriniz :");
            selectWeaponId = input.nextInt();
        }

        if (selectWeaponId != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponId);
            if (selectedWeapon != null){
                if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktardır !");
                    System.out.println();
                }else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                    System.out.println("Önceki silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }

    }

    public void printArmor(){
        System.out.println("--------Zırhlar----------");
        for (Armor a: Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName() +
                    " <Para : " + a.getPrice() +
                    " , Zırh : " + a.getBlock() + " >");
        }
        System.out.println("0 - Çıkış Yap.");
    }
    private void buyArmor() {
        System.out.print("Bir zırh seçiniz : ");

        int selectArmorId = input.nextInt();
        while (selectArmorId < 0 || selectArmorId > Armor.armors().length){
            System.out.print("Geçer değer tekrar giriniz :");
            selectArmorId = input.nextInt();
        }

        if (selectArmorId != 0){
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);

            if (selectedArmor != null){
                if (selectedArmor.getPrice() >this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                    System.out.println();
                }else{
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                }
            }
        }
    }
}
