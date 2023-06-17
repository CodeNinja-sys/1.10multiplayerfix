/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.u.a.g;

public class p
implements g {
    private static final String[] a;

    static {
        String[] arrstring = a = new String[256];
        arrstring[1] = "Item";
        arrstring[2] = "XPOrb";
        arrstring[7] = "ThrownEgg";
        arrstring[8] = "LeashKnot";
        arrstring[9] = "Painting";
        arrstring[10] = "Arrow";
        arrstring[11] = "Snowball";
        arrstring[12] = "Fireball";
        arrstring[13] = "SmallFireball";
        arrstring[14] = "ThrownEnderpearl";
        arrstring[15] = "EyeOfEnderSignal";
        arrstring[16] = "ThrownPotion";
        arrstring[17] = "ThrownExpBottle";
        arrstring[18] = "ItemFrame";
        arrstring[19] = "WitherSkull";
        arrstring[20] = "PrimedTnt";
        arrstring[21] = "FallingSand";
        arrstring[22] = "FireworksRocketEntity";
        arrstring[23] = "TippedArrow";
        arrstring[24] = "SpectralArrow";
        arrstring[25] = "ShulkerBullet";
        arrstring[26] = "DragonFireball";
        arrstring[30] = "ArmorStand";
        arrstring[41] = "Boat";
        arrstring[42] = "MinecartRideable";
        arrstring[43] = "MinecartChest";
        arrstring[44] = "MinecartFurnace";
        arrstring[45] = "MinecartTNT";
        arrstring[46] = "MinecartHopper";
        arrstring[47] = "MinecartSpawner";
        arrstring[40] = "MinecartCommandBlock";
        arrstring[48] = "Mob";
        arrstring[49] = "Monster";
        arrstring[50] = "Creeper";
        arrstring[51] = "Skeleton";
        arrstring[52] = "Spider";
        arrstring[53] = "Giant";
        arrstring[54] = "Zombie";
        arrstring[55] = "Slime";
        arrstring[56] = "Ghast";
        arrstring[57] = "PigZombie";
        arrstring[58] = "Enderman";
        arrstring[59] = "CaveSpider";
        arrstring[60] = "Silverfish";
        arrstring[61] = "Blaze";
        arrstring[62] = "LavaSlime";
        arrstring[63] = "EnderDragon";
        arrstring[64] = "WitherBoss";
        arrstring[65] = "Bat";
        arrstring[66] = "Witch";
        arrstring[67] = "Endermite";
        arrstring[68] = "Guardian";
        arrstring[69] = "Shulker";
        arrstring[90] = "Pig";
        arrstring[91] = "Sheep";
        arrstring[92] = "Cow";
        arrstring[93] = "Chicken";
        arrstring[94] = "Squid";
        arrstring[95] = "Wolf";
        arrstring[96] = "MushroomCow";
        arrstring[97] = "SnowMan";
        arrstring[98] = "Ozelot";
        arrstring[99] = "VillagerGolem";
        arrstring[100] = "EntityHorse";
        arrstring[101] = "Rabbit";
        arrstring[120] = "Villager";
        arrstring[200] = "EnderCrystal";
    }

    @Override
    public int a() {
        return 105;
    }

    @Override
    public e a(e e2) {
        if ("minecraft:spawn_egg".equals(e2.l("id"))) {
            String string;
            e e3 = e2.o("tag");
            e e4 = e3.o("EntityTag");
            short s2 = e2.g("Damage");
            if (!e4.b("id", 8) && (string = a[s2 & 0xFF]) != null) {
                e4.a("id", string);
                e3.a("EntityTag", e4);
                e2.a("tag", e3);
            }
            if (s2 != 0) {
                e2.a("Damage", (short)0);
            }
        }
        return e2;
    }
}

