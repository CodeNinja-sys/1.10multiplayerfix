/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import com.a.a.d.jl;
import java.util.List;
import net.minecraft.a.c;
import net.minecraft.d.j;
import net.minecraft.u.bp;
import net.minecraft.u.c.d;

public class b {
    private static final bp b = new bp("water");
    public static final d a = new d(b);
    private static int c;
    private final String d;
    private final jl e;

    public static b a(int n2) {
        return (b)a.a(n2);
    }

    public static int a(b b2) {
        return a.d(b2);
    }

    public static b a(String string) {
        return (b)a.a(new bp(string));
    }

    public b(j ... arrj) {
        this((String)null, arrj);
    }

    public b(String string, j ... arrj) {
        this.d = string;
        this.e = jl.a(arrj);
    }

    public String b(String string) {
        return this.d == null ? String.valueOf(string) + ((bp)a.b(this)).b() : String.valueOf(string) + this.d;
    }

    public List a() {
        return this.e;
    }

    public static void b() {
        net.minecraft.d.b.a("empty", new b(new j[0]));
        net.minecraft.d.b.a("water", new b(new j[0]));
        net.minecraft.d.b.a("mundane", new b(new j[0]));
        net.minecraft.d.b.a("thick", new b(new j[0]));
        net.minecraft.d.b.a("awkward", new b(new j[0]));
        net.minecraft.d.b.a("night_vision", new b(new j(net.minecraft.a.c.p, 3600)));
        net.minecraft.d.b.a("long_night_vision", new b("night_vision", new j(net.minecraft.a.c.p, 9600)));
        net.minecraft.d.b.a("invisibility", new b(new j(net.minecraft.a.c.n, 3600)));
        net.minecraft.d.b.a("long_invisibility", new b("invisibility", new j(net.minecraft.a.c.n, 9600)));
        net.minecraft.d.b.a("leaping", new b(new j(net.minecraft.a.c.h, 3600)));
        net.minecraft.d.b.a("long_leaping", new b("leaping", new j(net.minecraft.a.c.h, 9600)));
        net.minecraft.d.b.a("strong_leaping", new b("leaping", new j(net.minecraft.a.c.h, 1800, 1)));
        net.minecraft.d.b.a("fire_resistance", new b(new j(net.minecraft.a.c.l, 3600)));
        net.minecraft.d.b.a("long_fire_resistance", new b("fire_resistance", new j(net.minecraft.a.c.l, 9600)));
        net.minecraft.d.b.a("swiftness", new b(new j(net.minecraft.a.c.a, 3600)));
        net.minecraft.d.b.a("long_swiftness", new b("swiftness", new j(net.minecraft.a.c.a, 9600)));
        net.minecraft.d.b.a("strong_swiftness", new b("swiftness", new j(net.minecraft.a.c.a, 1800, 1)));
        net.minecraft.d.b.a("slowness", new b(new j(net.minecraft.a.c.b, 1800)));
        net.minecraft.d.b.a("long_slowness", new b("slowness", new j(net.minecraft.a.c.b, 4800)));
        net.minecraft.d.b.a("water_breathing", new b(new j(net.minecraft.a.c.m, 3600)));
        net.minecraft.d.b.a("long_water_breathing", new b("water_breathing", new j(net.minecraft.a.c.m, 9600)));
        net.minecraft.d.b.a("healing", new b(new j(net.minecraft.a.c.f, 1)));
        net.minecraft.d.b.a("strong_healing", new b("healing", new j(net.minecraft.a.c.f, 1, 1)));
        net.minecraft.d.b.a("harming", new b(new j(net.minecraft.a.c.g, 1)));
        net.minecraft.d.b.a("strong_harming", new b("harming", new j(net.minecraft.a.c.g, 1, 1)));
        net.minecraft.d.b.a("poison", new b(new j(net.minecraft.a.c.s, 900)));
        net.minecraft.d.b.a("long_poison", new b("poison", new j(net.minecraft.a.c.s, 1800)));
        net.minecraft.d.b.a("strong_poison", new b("poison", new j(net.minecraft.a.c.s, 432, 1)));
        net.minecraft.d.b.a("regeneration", new b(new j(net.minecraft.a.c.j, 900)));
        net.minecraft.d.b.a("long_regeneration", new b("regeneration", new j(net.minecraft.a.c.j, 1800)));
        net.minecraft.d.b.a("strong_regeneration", new b("regeneration", new j(net.minecraft.a.c.j, 450, 1)));
        net.minecraft.d.b.a("strength", new b(new j(net.minecraft.a.c.e, 3600)));
        net.minecraft.d.b.a("long_strength", new b("strength", new j(net.minecraft.a.c.e, 9600)));
        net.minecraft.d.b.a("strong_strength", new b("strength", new j(net.minecraft.a.c.e, 1800, 1)));
        net.minecraft.d.b.a("weakness", new b(new j(net.minecraft.a.c.r, 1800)));
        net.minecraft.d.b.a("long_weakness", new b("weakness", new j(net.minecraft.a.c.r, 4800)));
        net.minecraft.d.b.a("luck", new b("luck", new j(net.minecraft.a.c.z, 6000)));
        a.b();
    }

    protected static void a(String string, b b2) {
        a.a(c++, new bp(string), b2);
    }

    public boolean c() {
        if (!this.e.isEmpty()) {
            for (j j2 : this.e) {
                if (!j2.a().a()) continue;
                return true;
            }
        }
        return false;
    }
}

