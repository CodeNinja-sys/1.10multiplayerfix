/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abb;
import com.a.a.d.abd;
import com.a.a.d.abe;
import com.a.a.d.abf;

public abstract class abc
extends Enum {
    public static final /* enum */ abc a = new abd();
    public static final /* enum */ abc b = new abe();
    public static final /* enum */ abc c = new abf();
    private static final /* synthetic */ abc[] d;

    public static abc[] values() {
        return (abc[])d.clone();
    }

    public static abc valueOf(String string) {
        return Enum.valueOf(abc.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private abc() {
        void var2_-1;
        void var1_-1;
    }

    abstract int a(int var1);

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ abc(abb abb2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        d = new abc[]{a, b, c};
    }
}

