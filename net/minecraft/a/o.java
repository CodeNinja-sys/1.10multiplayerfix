/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.a.z;
import net.minecraft.d.b;
import net.minecraft.u.bp;

public class o {
    private static final Set K;
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;

    static {
        if (!net.minecraft.a.z.a()) {
            throw new RuntimeException("Accessed Potions before Bootstrap!");
        }
        K = aad.a();
        a = net.minecraft.a.o.a("empty");
        b = net.minecraft.a.o.a("water");
        c = net.minecraft.a.o.a("mundane");
        d = net.minecraft.a.o.a("thick");
        e = net.minecraft.a.o.a("awkward");
        f = net.minecraft.a.o.a("night_vision");
        g = net.minecraft.a.o.a("long_night_vision");
        h = net.minecraft.a.o.a("invisibility");
        i = net.minecraft.a.o.a("long_invisibility");
        j = net.minecraft.a.o.a("leaping");
        k = net.minecraft.a.o.a("long_leaping");
        l = net.minecraft.a.o.a("strong_leaping");
        m = net.minecraft.a.o.a("fire_resistance");
        n = net.minecraft.a.o.a("long_fire_resistance");
        o = net.minecraft.a.o.a("swiftness");
        p = net.minecraft.a.o.a("long_swiftness");
        q = net.minecraft.a.o.a("strong_swiftness");
        r = net.minecraft.a.o.a("slowness");
        s = net.minecraft.a.o.a("long_slowness");
        t = net.minecraft.a.o.a("water_breathing");
        u = net.minecraft.a.o.a("long_water_breathing");
        v = net.minecraft.a.o.a("healing");
        w = net.minecraft.a.o.a("strong_healing");
        x = net.minecraft.a.o.a("harming");
        y = net.minecraft.a.o.a("strong_harming");
        z = net.minecraft.a.o.a("poison");
        A = net.minecraft.a.o.a("long_poison");
        B = net.minecraft.a.o.a("strong_poison");
        C = net.minecraft.a.o.a("regeneration");
        D = net.minecraft.a.o.a("long_regeneration");
        E = net.minecraft.a.o.a("strong_regeneration");
        F = net.minecraft.a.o.a("strength");
        G = net.minecraft.a.o.a("long_strength");
        H = net.minecraft.a.o.a("strong_strength");
        I = net.minecraft.a.o.a("weakness");
        J = net.minecraft.a.o.a("long_weakness");
        K.clear();
    }

    private static b a(String string) {
        b b2 = (b)net.minecraft.d.b.a.a(new bp(string));
        if (!K.add(b2)) {
            throw new IllegalStateException("Invalid Potion requested: " + string);
        }
        return b2;
    }
}

