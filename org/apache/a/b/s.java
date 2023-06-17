/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.a.o.a;
import org.apache.a.o.i;

public class s
implements Serializable,
Principal {
    private static final long a = -6870169797924406894L;
    private final String b;
    private final String c;
    private final String d;

    public s(String string, String string2) {
        org.apache.a.o.a.a((Object)string2, "User name");
        this.b = string2;
        this.c = string != null ? string.toUpperCase(Locale.ENGLISH) : null;
        if (this.c != null && this.c.length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append('\\');
            stringBuilder.append(this.b);
            this.d = stringBuilder.toString();
        } else {
            this.d = this.b;
        }
    }

    public String getName() {
        return this.d;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.b);
        n2 = i.a(n2, (Object)this.c);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof s) {
            s s2 = (s)object;
            if (i.a(this.b, (Object)s2.b) && i.a(this.c, (Object)s2.c)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.d;
    }
}

