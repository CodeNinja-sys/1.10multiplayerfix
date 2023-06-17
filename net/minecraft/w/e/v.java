/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.f;
import net.minecraft.q.a.a.j;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.u.d.l;

public enum v {
    a("Skeleton", j.al),
    b("WitherSkeleton", j.am),
    c("Stray", j.an);

    private final l d;
    private final bp e;

    /*
     * WARNING - void declaration
     */
    private v() {
        void var4_2;
        void var3_1;
        this.d = new l("entity." + (String)var3_1 + ".name", new Object[0]);
        this.e = var4_2;
    }

    public int a() {
        return this.ordinal();
    }

    public static v a(int n2) {
        return v.values()[n2];
    }

    public bp b() {
        return this.e;
    }

    public bv c() {
        switch (this) {
            case b: {
                return net.minecraft.a.f.ha;
            }
            case c: {
                return net.minecraft.a.f.gu;
            }
        }
        return net.minecraft.a.f.ft;
    }

    public bv d() {
        switch (this) {
            case b: {
                return net.minecraft.a.f.hc;
            }
            case c: {
                return net.minecraft.a.f.gw;
            }
        }
        return net.minecraft.a.f.fy;
    }

    public bv e() {
        switch (this) {
            case b: {
                return net.minecraft.a.f.hb;
            }
            case c: {
                return net.minecraft.a.f.gv;
            }
        }
        return net.minecraft.a.f.fu;
    }

    public bv f() {
        switch (this) {
            case b: {
                return net.minecraft.a.f.hd;
            }
            case c: {
                return net.minecraft.a.f.gx;
            }
        }
        return net.minecraft.a.f.fA;
    }
}

