/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.a.c.f.h;
import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.o;

public class ab
implements c {
    private final c a;
    private Set b;
    private Set c;

    public ab(c c2) {
        this.a = c2;
    }

    public void a(Collection collection) {
        this.c = new HashSet(collection);
    }

    public void b(Collection collection) {
        this.b = new HashSet(collection);
    }

    public boolean b(b b2, e e2) {
        if (this.a(b2)) {
            return false;
        }
        return this.a.b(b2, e2);
    }

    public void a(o o2, String string) {
        this.a.a(o2, string);
    }

    public void a(b b2, e e2) {
        this.a.a(b2, e2);
    }

    private boolean a(b b2) {
        int n2;
        String string = b2.g();
        if (string.startsWith(".")) {
            string = string.substring(1);
        }
        string = h.a(string);
        if (this.b != null && this.b.contains(string)) {
            return false;
        }
        if (this.c == null) {
            return false;
        }
        do {
            if (this.c.contains(string)) {
                return true;
            }
            if (!string.startsWith("*.")) continue;
            string = string.substring(2);
        } while ((n2 = string.indexOf(46)) != -1 && (string = "*" + string.substring(n2)).length() > 0);
        return false;
    }
}

