/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class bti
implements akc {
    private static final Set a = aad.a("ArmorStand", "Bat", "Blaze", "CaveSpider", "Chicken", "Cow", "Creeper", "EnderDragon", "Enderman", "Endermite", "EntityHorse", "Ghast", "Giant", "Guardian", "LavaSlime", "MushroomCow", "Ozelot", "Pig", "PigZombie", "Rabbit", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime", "SnowMan", "Spider", "Squid", "Villager", "VillagerGolem", "Witch", "WitherBoss", "Wolf", "Zombie");

    @Override
    public int a() {
        return 109;
    }

    @Override
    public bvp a(bvp bvp2) {
        if (a.contains(bvp2.l("id"))) {
            float f2;
            if (bvp2.b("HealF", 99)) {
                f2 = bvp2.j("HealF");
                bvp2.q("HealF");
            } else if (bvp2.b("Health", 99)) {
                f2 = bvp2.j("Heath");
            } else {
                return bvp2;
            }
            bvp2.a("Health", f2);
        }
        return bvp2;
    }
}

