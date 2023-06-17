/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.f;
import net.minecraft.u.bv;
import net.minecraft.u.d.l;

public enum af {
    a("Zombie", false),
    b("Zombie", true),
    c("Zombie", true),
    d("Zombie", true),
    e("Zombie", true),
    f("Zombie", true),
    g("Husk", false);

    private boolean h;
    private final l i;

    /*
     * WARNING - void declaration
     */
    private af() {
        void var3_1;
        void var4_2;
        this.h = var4_2;
        this.i = new l("entity." + (String)var3_1 + ".name", new Object[0]);
    }

    public int a() {
        return this.ordinal();
    }

    public boolean b() {
        return this.h;
    }

    public int c() {
        return this.h ? this.a() - 1 : 0;
    }

    public static af a(int n2) {
        return af.values()[n2];
    }

    public static af b(int n2) {
        return n2 >= 0 && n2 < 5 ? af.a(n2 + 1) : b;
    }

    public l d() {
        return this.i;
    }

    public boolean e() {
        return this != g;
    }

    public bv f() {
        switch (this) {
            case g: {
                return net.minecraft.a.f.cI;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: {
                return net.minecraft.a.f.hP;
            }
        }
        return net.minecraft.a.f.hA;
    }

    public bv g() {
        switch (this) {
            case g: {
                return net.minecraft.a.f.cK;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: {
                return net.minecraft.a.f.hT;
            }
        }
        return net.minecraft.a.f.hI;
    }

    public bv h() {
        switch (this) {
            case g: {
                return net.minecraft.a.f.cJ;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: {
                return net.minecraft.a.f.hS;
            }
        }
        return net.minecraft.a.f.hE;
    }

    public bv i() {
        switch (this) {
            case g: {
                return net.minecraft.a.f.cL;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: {
                return net.minecraft.a.f.hU;
            }
        }
        return net.minecraft.a.f.hO;
    }
}

