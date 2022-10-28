package plugin.mefroggy;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

public class ChickenSpawn {
    public static boolean spawn;
    private static void chickenRain(){
        int first = (int) (Math.random()*25);
        int second = (int) (Math.random()*25);
        int third = (int) (Math.random()*25);
        int fourth = (int) (Math.random()*25);
        int fifth = (int) (Math.random()*10);
        int sixth = (int) (Math.random()*10);
        int seventh = (int) (Math.random()*10);
        int eighth = (int) (Math.random()*10);
        int ninth = (int) (Math.random()*5);
        int tenth = (int) (Math.random()*5);

        for(Player p : Bukkit.getOnlinePlayers()){
            Location one = new Location(p.getWorld(),p.getLocation().getX()+first,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()-fifth);
            Location two = new Location(p.getWorld(),p.getLocation().getX()-second,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()+sixth);
            Location three = new Location(p.getWorld(),p.getLocation().getX()-seventh,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()+third);
            Location four = new Location(p.getWorld(),p.getLocation().getX()+eighth,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()-fourth);
            Location five = new Location(p.getWorld(),p.getLocation().getX()+fifth,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()+eighth);
            Location six = new Location(p.getWorld(),p.getLocation().getX()-sixth,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()-seventh);
            Location seven = new Location(p.getWorld(),p.getLocation().getX()+sixth,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()+seventh);
            Location eight = new Location(p.getWorld(),p.getLocation().getX()-fifth,p.getLocation().getY()+((int) (Math.random()*15)+1),p.getLocation().getZ()-eighth);
            Location nine = new Location(p.getWorld(),p.getLocation().getX()-ninth,p.getLocation().getY()+tenth,p.getLocation().getZ()-tenth);
            Location ten = new Location(p.getWorld(),p.getLocation().getX(),p.getLocation().getY()+((int) (Math.random()*4)+1),p.getLocation().getZ());

            p.getWorld().spawnEntity(one, EntityType.CHICKEN);
            p.getWorld().spawnEntity(two, EntityType.CHICKEN);
            p.getWorld().spawnEntity(three, EntityType.CHICKEN);
            p.getWorld().spawnEntity(four, EntityType.CHICKEN);
            p.getWorld().spawnEntity(five, EntityType.CHICKEN);
            p.getWorld().spawnEntity(six, EntityType.CHICKEN);
            p.getWorld().spawnEntity(seven, EntityType.CHICKEN);
            p.getWorld().spawnEntity(eight, EntityType.CHICKEN);
            p.getWorld().spawnEntity(nine, EntityType.CHICKEN);
            p.getWorld().spawnEntity(ten, EntityType.CHICKEN);
        }
    }

    public static void start(){
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.scheduleSyncDelayedTask(chickenrain.plugin, new Runnable() {
            @Override
            public void run() {
                if(spawn){
                    chickenRain();
                }
                start();
            }
        }, 10);
    }
}
