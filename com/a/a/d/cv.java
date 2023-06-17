/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cw;
import com.a.a.d.cx;
import java.util.Comparator;

public abstract class cv {
    private static final cv a = new cw();
    private static final cv b = new cx(-1);
    private static final cv c = new cx(1);

    private cv() {
    }

    public static cv a() {
        return a;
    }

    public abstract cv a(Comparable var1, Comparable var2);

    public abstract cv a(Object var1, Object var2, Comparator var3);

    public abstract cv a(int var1, int var2);

    public abstract cv a(long var1, long var3);

    public abstract cv a(float var1, float var2);

    public abstract cv a(double var1, double var3);

    public abstract cv a(boolean var1, boolean var2);

    public abstract cv b(boolean var1, boolean var2);

    public abstract int b();

    /* synthetic */ cv(cw cw2) {
        this();
    }

    static /* synthetic */ cv c() {
        return b;
    }

    static /* synthetic */ cv d() {
        return c;
    }

    static /* synthetic */ cv e() {
        return a;
    }
}

