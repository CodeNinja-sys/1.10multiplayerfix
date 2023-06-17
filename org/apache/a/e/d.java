/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import org.apache.a.e.e;
import org.apache.a.o.a;

public class d
implements Cloneable {
    public static final d a = new e().a();
    private final int b;
    private final int c;

    d(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    protected d c() {
        return (d)super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[maxLineLength=").append(this.b).append(", maxHeaderCount=").append(this.c).append("]");
        return stringBuilder.toString();
    }

    public static d a(int n2) {
        return new d(org.apache.a.o.a.b(n2, "Max line length"), -1);
    }

    public static e d() {
        return new e();
    }

    public static e a(d d2) {
        org.apache.a.o.a.a(d2, "Message constraints");
        return new e().b(d2.b()).a(d2.a());
    }

    protected /* synthetic */ Object clone() {
        return this.c();
    }
}

