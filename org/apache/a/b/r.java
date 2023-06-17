/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.a.b.o;
import org.apache.a.b.s;
import org.apache.a.o.a;
import org.apache.a.o.i;

public class r
implements Serializable,
o {
    private static final long a = -7385699315228907265L;
    private final s b;
    private final String c;
    private final String d;

    public r(String string) {
        String string2;
        org.apache.a.o.a.a((Object)string, "Username:password string");
        int n2 = string.indexOf(58);
        if (n2 >= 0) {
            string2 = string.substring(0, n2);
            this.c = string.substring(n2 + 1);
        } else {
            string2 = string;
            this.c = null;
        }
        int n3 = string2.indexOf(47);
        this.b = n3 >= 0 ? new s(string2.substring(0, n3).toUpperCase(Locale.ENGLISH), string2.substring(n3 + 1)) : new s(null, string2.substring(n3 + 1));
        this.d = null;
    }

    public r(String string, String string2, String string3, String string4) {
        org.apache.a.o.a.a((Object)string, "User name");
        this.b = new s(string4, string);
        this.c = string2;
        this.d = string3 != null ? string3.toUpperCase(Locale.ENGLISH) : null;
    }

    public Principal a() {
        return this.b;
    }

    public String c() {
        return this.b.b();
    }

    public String b() {
        return this.c;
    }

    public String d() {
        return this.b.a();
    }

    public String e() {
        return this.d;
    }

    public int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.b);
        n2 = i.a(n2, (Object)this.d);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof r) {
            r r2 = (r)object;
            if (i.a(this.b, (Object)r2.b) && i.a(this.d, (Object)r2.d)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[principal: ");
        stringBuilder.append(this.b);
        stringBuilder.append("][workstation: ");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

