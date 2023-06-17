/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.z;
import net.minecraft.o.j;
import net.minecraft.u.bp;

public class aa {
    public static final j a = aa.a("protection");
    public static final j b = aa.a("fire_protection");
    public static final j c = aa.a("feather_falling");
    public static final j d = aa.a("blast_protection");
    public static final j e = aa.a("projectile_protection");
    public static final j f = aa.a("respiration");
    public static final j g = aa.a("aqua_affinity");
    public static final j h = aa.a("thorns");
    public static final j i = aa.a("depth_strider");
    public static final j j = aa.a("frost_walker");
    public static final j k = aa.a("sharpness");
    public static final j l = aa.a("smite");
    public static final j m = aa.a("bane_of_arthropods");
    public static final j n = aa.a("knockback");
    public static final j o = aa.a("fire_aspect");
    public static final j p = aa.a("looting");
    public static final j q = aa.a("efficiency");
    public static final j r = aa.a("silk_touch");
    public static final j s = aa.a("unbreaking");
    public static final j t = aa.a("fortune");
    public static final j u = aa.a("power");
    public static final j v = aa.a("punch");
    public static final j w = aa.a("flame");
    public static final j x = aa.a("infinity");
    public static final j y = aa.a("luck_of_the_sea");
    public static final j z = aa.a("lure");
    public static final j A = aa.a("mending");

    static {
        if (!net.minecraft.a.z.a()) {
            throw new RuntimeException("Accessed MobEffects before Bootstrap!");
        }
    }

    private static j a(String string) {
        j j2 = (j)net.minecraft.o.j.b.a(new bp(string));
        if (j2 == null) {
            throw new IllegalStateException("Invalid Enchantment requested: " + string);
        }
        return j2;
    }
}

