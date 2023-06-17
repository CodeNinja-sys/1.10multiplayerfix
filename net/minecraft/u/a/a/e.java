/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.u.a.g;

public class e
implements g {
    private static final Set a = aad.a("ArmorStand", "Bat", "Blaze", "CaveSpider", "Chicken", "Cow", "Creeper", "EnderDragon", "Enderman", "Endermite", "EntityHorse", "Ghast", "Giant", "Guardian", "LavaSlime", "MushroomCow", "Ozelot", "Pig", "PigZombie", "Rabbit", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime", "SnowMan", "Spider", "Squid", "Villager", "VillagerGolem", "Witch", "WitherBoss", "Wolf", "Zombie");

    @Override
    public int a() {
        return 109;
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        if (a.contains(e2.l("id"))) {
            float f2;
            if (e2.b("HealF", 99)) {
                f2 = e2.j("HealF");
                e2.q("HealF");
            } else {
                if (!e2.b("Health", 99)) {
                    return e2;
                }
                f2 = e2.j("Heath");
            }
            e2.a("Health", f2);
        }
        return e2;
    }
}

