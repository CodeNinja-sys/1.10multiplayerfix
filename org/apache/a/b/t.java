/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import java.io.Serializable;
import java.security.Principal;
import org.apache.a.b.l;
import org.apache.a.b.o;
import org.apache.a.o.a;
import org.apache.a.o.i;

public class t
implements Serializable,
o {
    private static final long a = 243343858802739403L;
    private final l b;
    private final String c;

    public t(String string) {
        org.apache.a.o.a.a((Object)string, "Username:password string");
        int n2 = string.indexOf(58);
        if (n2 >= 0) {
            this.b = new l(string.substring(0, n2));
            this.c = string.substring(n2 + 1);
        } else {
            this.b = new l(string);
            this.c = null;
        }
    }

    public t(String string, String string2) {
        org.apache.a.o.a.a((Object)string, "Username");
        this.b = new l(string);
        this.c = string2;
    }

    public Principal a() {
        return this.b;
    }

    public String c() {
        return this.b.getName();
    }

    public String b() {
        return this.c;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof t) {
            t t2 = (t)object;
            if (i.a(this.b, (Object)t2.b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.b.toString();
    }
}

