/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.dl;

public class dm {
    private final dl a;
    private final dl b;
    private final long c;

    public dm(long l2, dl dl2, dl dl3) {
        this.c = l2;
        this.a = dl2;
        this.b = dl3;
    }

    public long a() {
        return this.c;
    }

    public dl b() {
        return this.b;
    }

    public dl c() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("time=" + this.c);
        stringBuilder.append(", from={" + this.a + "}");
        stringBuilder.append(", to={" + this.b + "}");
        return stringBuilder.toString();
    }
}

