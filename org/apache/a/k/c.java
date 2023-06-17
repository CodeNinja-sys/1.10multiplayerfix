/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import org.apache.a.ag;
import org.apache.a.g;
import org.apache.a.o.a;
import org.apache.a.o.i;

public class c
implements Cloneable,
g {
    private final String a;
    private final String b;
    private final ag[] c;

    public c(String string, String string2, ag[] arrag) {
        this.a = (String)org.apache.a.o.a.a((Object)string, "Name");
        this.b = string2;
        this.c = arrag != null ? arrag : new ag[0];
    }

    public c(String string, String string2) {
        this(string, string2, null);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public ag[] c() {
        return (ag[])this.c.clone();
    }

    public int d() {
        return this.c.length;
    }

    public ag a(int n2) {
        return this.c[n2];
    }

    public ag a(String string) {
        org.apache.a.o.a.a((Object)string, "Name");
        ag ag2 = null;
        for (ag ag3 : this.c) {
            if (!ag3.a().equalsIgnoreCase(string)) continue;
            ag2 = ag3;
            break;
        }
        return ag2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof g) {
            c c2 = (c)object;
            return this.a.equals(c2.a) && i.a(this.b, (Object)c2.b) && i.a(this.c, c2.c);
        }
        return false;
    }

    public int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.a);
        n2 = i.a(n2, (Object)this.b);
        for (ag ag2 : this.c) {
            n2 = i.a(n2, (Object)ag2);
        }
        return n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        if (this.b != null) {
            stringBuilder.append("=");
            stringBuilder.append(this.b);
        }
        for (ag ag2 : this.c) {
            stringBuilder.append("; ");
            stringBuilder.append(ag2);
        }
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}

