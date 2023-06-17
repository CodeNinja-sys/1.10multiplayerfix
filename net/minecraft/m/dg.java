/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.m.az;
import net.minecraft.m.cu;

public enum dg {
    a(0, "cod", 2, 0.1f, 5, 0.6f),
    b(1, "salmon", 2, 0.1f, 6, 0.8f),
    c(2, "clownfish", 1, 0.1f),
    d(3, "pufferfish", 1, 0.1f);

    private static final Map e;
    private final int f;
    private final String g;
    private final int h;
    private final float i;
    private final int j;
    private final float k;
    private boolean l;

    static {
        e = sz.c();
        for (dg dg2 : dg.values()) {
            e.put(dg2.a(), dg2);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dg(int n3, float f2, int n4, float f3) {
        void var8_6;
        void var7_5;
        this.f = n3;
        this.g = (String)f2;
        this.h = n4;
        this.i = f3;
        this.j = var7_5;
        this.k = var8_6;
        this.l = true;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dg(int n3, float f2) {
        void var6_4;
        void var5_3;
        this.f = n3;
        this.g = (String)f2;
        this.h = var5_3;
        this.i = var6_4;
        this.j = 0;
        this.k = 0.0f;
        this.l = false;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }

    public int e() {
        return this.j;
    }

    public float f() {
        return this.k;
    }

    public boolean g() {
        return this.l;
    }

    public static dg a(int n2) {
        dg dg2 = (dg)((Object)e.get(n2));
        return dg2 == null ? a : dg2;
    }

    public static dg a(cu cu2) {
        return cu2.a() instanceof az ? dg.a(cu2.h()) : a;
    }
}

