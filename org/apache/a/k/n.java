/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.io.Serializable;
import org.apache.a.ag;
import org.apache.a.o.a;
import org.apache.a.o.i;

public class n
implements Serializable,
Cloneable,
ag {
    private static final long a = -6437800749411518984L;
    private final String b;
    private final String c;

    public n(String string, String string2) {
        this.b = (String)org.apache.a.o.a.a((Object)string, "Name");
        this.c = string2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String toString() {
        if (this.c == null) {
            return this.b;
        }
        int n2 = this.b.length() + 1 + this.c.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        stringBuilder.append(this.b);
        stringBuilder.append("=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ag) {
            n n2 = (n)object;
            return this.b.equals(n2.b) && i.a(this.c, (Object)n2.c);
        }
        return false;
    }

    public int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.b);
        n2 = i.a(n2, (Object)this.c);
        return n2;
    }

    public Object clone() {
        return super.clone();
    }
}

