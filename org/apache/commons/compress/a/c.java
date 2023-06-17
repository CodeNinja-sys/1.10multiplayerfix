/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.a;

import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.compress.a.b;
import org.apache.commons.compress.a.e;
import org.apache.commons.compress.a.f;
import org.apache.commons.compress.a.g;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.d;
import org.apache.commons.compress.archivers.h.aq;
import org.apache.commons.compress.c.i;

public class c {
    private final Set a;

    public c(b b2) {
        this.a = b2.a();
    }

    public g a(org.apache.commons.compress.archivers.c c2, d d2) {
        return this.a(new e(c2), d2);
    }

    public g a(aq aq2, d d2) {
        return this.a(new f(aq2), d2);
    }

    private g a(org.apache.commons.compress.a.d d2, d d3) {
        g g2 = new g();
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.a);
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            org.apache.commons.compress.a.a a2 = (org.apache.commons.compress.a.a)iterator.next();
            if (a2.d() != 2 || !a2.e()) continue;
            this.a(a2.b(), d3, a2.a());
            iterator.remove();
            g2.c(a2.a().getName());
        }
        while (d2.a()) {
            iterator = d2.b();
            boolean bl2 = true;
            Iterator iterator2 = linkedHashSet.iterator();
            while (iterator2.hasNext()) {
                org.apache.commons.compress.a.a a3 = (org.apache.commons.compress.a.a)iterator2.next();
                int n2 = a3.d();
                String string = iterator.getName();
                if (n2 == 1 && string != null) {
                    if (!string.equals(a3.c())) continue;
                    bl2 = false;
                    iterator2.remove();
                    g2.a(string);
                    break;
                }
                if (n2 != 4 || string == null || !string.startsWith(a3.c() + "/")) continue;
                bl2 = false;
                g2.a(string);
                break;
            }
            if (!bl2 || this.a(linkedHashSet, (a)((Object)iterator)) || g2.d(iterator.getName())) continue;
            this.a(d2.c(), d3, (a)((Object)iterator));
            g2.b(iterator.getName());
        }
        iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            org.apache.commons.compress.a.a a4 = (org.apache.commons.compress.a.a)iterator.next();
            if (a4.d() != 2 || a4.e() || g2.d(a4.a().getName())) continue;
            this.a(a4.b(), d3, a4.a());
            iterator.remove();
            g2.c(a4.a().getName());
        }
        d3.b();
        return g2;
    }

    private boolean a(Set set, a a2) {
        String string = a2.getName();
        if (!set.isEmpty()) {
            for (org.apache.commons.compress.a.a a3 : set) {
                int n2 = a3.d();
                String string2 = a3.c();
                if (n2 == 1 && string.equals(string2)) {
                    return true;
                }
                if (n2 != 4 || !string.startsWith(string2 + "/")) continue;
                return true;
            }
        }
        return false;
    }

    private void a(InputStream inputStream, d d2, a a2) {
        d2.a(a2);
        i.a(inputStream, d2);
        d2.a();
    }
}

