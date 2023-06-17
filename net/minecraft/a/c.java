/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.z;
import net.minecraft.u.bp;

public class c {
    public static final net.minecraft.d.c a;
    public static final net.minecraft.d.c b;
    public static final net.minecraft.d.c c;
    public static final net.minecraft.d.c d;
    public static final net.minecraft.d.c e;
    public static final net.minecraft.d.c f;
    public static final net.minecraft.d.c g;
    public static final net.minecraft.d.c h;
    public static final net.minecraft.d.c i;
    public static final net.minecraft.d.c j;
    public static final net.minecraft.d.c k;
    public static final net.minecraft.d.c l;
    public static final net.minecraft.d.c m;
    public static final net.minecraft.d.c n;
    public static final net.minecraft.d.c o;
    public static final net.minecraft.d.c p;
    public static final net.minecraft.d.c q;
    public static final net.minecraft.d.c r;
    public static final net.minecraft.d.c s;
    public static final net.minecraft.d.c t;
    public static final net.minecraft.d.c u;
    public static final net.minecraft.d.c v;
    public static final net.minecraft.d.c w;
    public static final net.minecraft.d.c x;
    public static final net.minecraft.d.c y;
    public static final net.minecraft.d.c z;
    public static final net.minecraft.d.c A;

    static {
        if (!net.minecraft.a.z.a()) {
            throw new RuntimeException("Accessed MobEffects before Bootstrap!");
        }
        a = net.minecraft.a.c.a("speed");
        b = net.minecraft.a.c.a("slowness");
        c = net.minecraft.a.c.a("haste");
        d = net.minecraft.a.c.a("mining_fatigue");
        e = net.minecraft.a.c.a("strength");
        f = net.minecraft.a.c.a("instant_health");
        g = net.minecraft.a.c.a("instant_damage");
        h = net.minecraft.a.c.a("jump_boost");
        i = net.minecraft.a.c.a("nausea");
        j = net.minecraft.a.c.a("regeneration");
        k = net.minecraft.a.c.a("resistance");
        l = net.minecraft.a.c.a("fire_resistance");
        m = net.minecraft.a.c.a("water_breathing");
        n = net.minecraft.a.c.a("invisibility");
        o = net.minecraft.a.c.a("blindness");
        p = net.minecraft.a.c.a("night_vision");
        q = net.minecraft.a.c.a("hunger");
        r = net.minecraft.a.c.a("weakness");
        s = net.minecraft.a.c.a("poison");
        t = net.minecraft.a.c.a("wither");
        u = net.minecraft.a.c.a("health_boost");
        v = net.minecraft.a.c.a("absorption");
        w = net.minecraft.a.c.a("saturation");
        x = net.minecraft.a.c.a("glowing");
        y = net.minecraft.a.c.a("levitation");
        z = net.minecraft.a.c.a("luck");
        A = net.minecraft.a.c.a("unluck");
    }

    private static net.minecraft.d.c a(String string) {
        net.minecraft.d.c c2 = (net.minecraft.d.c)net.minecraft.d.c.a.a(new bp(string));
        if (c2 == null) {
            throw new IllegalStateException("Invalid MobEffect requested: " + string);
        }
        return c2;
    }
}

