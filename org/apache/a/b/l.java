/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import java.io.Serializable;
import java.security.Principal;
import org.apache.a.o.a;
import org.apache.a.o.i;

public final class l
implements Serializable,
Principal {
    private static final long a = -2266305184969850467L;
    private final String b;

    public l(String string) {
        org.apache.a.o.a.a((Object)string, "User name");
        this.b = string;
    }

    public String getName() {
        return this.b;
    }

    public int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.b);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof l) {
            l l2 = (l)object;
            if (i.a(this.b, (Object)l2.b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[principal: ");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

