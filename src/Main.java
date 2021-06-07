public class Main {
    public static void main(String[] args) {
        Gun gun=new Gun();
        gun.fire();
        System.out.println(Bullet.count);
        gun.fireInPool();
        System.out.println(Bullet.count);
    }
}
