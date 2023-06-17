/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.z;
import com.c.c.e.a;
import net.minecraft.s.n;

public class s {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public Integer h;
    public Integer i;
    public String j;
    public long k;
    public String l;
    public String m;
    public boolean n;
    public boolean o = false;
    private static boolean p = false;
    private static boolean q = true;
    private static boolean r = true;
    private static boolean s = true;
    private static boolean t = true;
    private static int u = 0;
    private static boolean v = false;
    private static int w = 2;
    private static int x = 0;
    private static String y = null;
    private static long z = -1L;
    private static String A = null;
    private static String B = null;
    private static boolean C = false;

    public s(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Integer n2, Boolean bl6, Integer n3, Integer n4, Boolean bl7, String string) {
        this.a = bl2;
        this.b = bl3;
        this.c = bl4;
        this.d = bl5;
        this.e = n2;
        this.f = bl6;
        this.h = n3;
        this.i = n4;
        this.g = bl7;
        this.j = string;
    }

    public static s a() {
        return new s(q, r, s, t, u, v, w, x, p, y);
    }

    public static s b() {
        s s2 = new s(q, r, s, t, u, v, w, x, p, y);
        s2.a(true);
        return s2;
    }

    public void a(boolean bl2) {
        this.o = bl2;
    }

    public static s a(z z2) {
        s s2 = new s(com.c.c.e.a.a("pvp", z2, q), com.c.c.e.a.a("spawnAnimals", z2, r), com.c.c.e.a.a("spawnMonsters", z2, s), com.c.c.e.a.a("spawnNPCs", z2, t), com.c.c.e.a.a("spawnProtection", z2, u), com.c.c.e.a.a("commandBlocks", z2, v), com.c.c.e.a.a("difficulty", z2, w), com.c.c.e.a.a("gameMode", z2, x), com.c.c.e.a.a("forceGameMode", z2, p), com.c.c.e.a.a("slotName", z2, y));
        s2.k = com.c.c.e.a.a("worldTemplateId", z2, z);
        s2.l = com.c.c.e.a.a("worldTemplateImage", z2, A);
        s2.m = com.c.c.e.a.a("minecraftVersion", z2, B);
        s2.n = com.c.c.e.a.a("adventureMap", z2, C);
        return s2;
    }

    public String a(int n2) {
        if (this.j == null || this.j.equals("")) {
            if (this.o) {
                return net.minecraft.s.n.f("mco.configure.world.slot.empty");
            }
            return net.minecraft.s.n.a("mco.configure.world.slot", n2);
        }
        return this.j;
    }

    public String b(int n2) {
        return net.minecraft.s.n.a("mco.configure.world.slot", n2);
    }

    public String c() {
        z z2 = new z();
        if (this.a != q) {
            z2.a("pvp", this.a);
        }
        if (this.b != r) {
            z2.a("spawnAnimals", this.b);
        }
        if (this.c != s) {
            z2.a("spawnMonsters", this.c);
        }
        if (this.d != t) {
            z2.a("spawnNPCs", this.d);
        }
        if (this.e != u) {
            z2.a("spawnProtection", this.e);
        }
        if (this.f != v) {
            z2.a("commandBlocks", this.f);
        }
        if (this.h != w) {
            z2.a("difficulty", this.h);
        }
        if (this.i != x) {
            z2.a("gameMode", this.i);
        }
        if (this.g != p) {
            z2.a("forceGameMode", this.g);
        }
        if (!this.j.equals(y) && !this.j.equals("")) {
            z2.a("slotName", this.j);
        }
        return z2.toString();
    }

    public s d() {
        return new s(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.g, this.j);
    }

    public /* synthetic */ Object clone() {
        return this.d();
    }
}

