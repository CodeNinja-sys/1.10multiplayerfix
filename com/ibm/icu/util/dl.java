/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import java.io.Serializable;
import java.util.Date;

public abstract class dl
implements Serializable {
    private static final long a = 6374143828553768100L;
    private final String b;
    private final int c;
    private final int d;

    public dl(String string, int n2, int n3) {
        this.b = string;
        this.c = n2;
        this.d = n3;
    }

    public String e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public boolean a(dl dl2) {
        return this.c == dl2.c && this.d == dl2.d;
    }

    public abstract Date a(int var1, int var2);

    public abstract Date b(int var1, int var2);

    public abstract Date a(long var1, int var3, int var4, boolean var5);

    public abstract Date b(long var1, int var3, int var4, boolean var5);

    public abstract boolean d();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name=" + this.b);
        stringBuilder.append(", stdOffset=" + this.c);
        stringBuilder.append(", dstSaving=" + this.d);
        return stringBuilder.toString();
    }
}

