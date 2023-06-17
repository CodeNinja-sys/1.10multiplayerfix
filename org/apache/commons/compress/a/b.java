/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.a;

import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.compress.a.a;

public final class b {
    private final Set a = new LinkedHashSet();

    public void a(String string) {
        this.b(new a(string, 1));
    }

    public void b(String string) {
        this.b(new a(string, 4));
    }

    public void a(org.apache.commons.compress.archivers.a a2, InputStream inputStream) {
        this.a(a2, inputStream, true);
    }

    public void a(org.apache.commons.compress.archivers.a a2, InputStream inputStream, boolean bl2) {
        this.a(new a(a2, inputStream, bl2));
    }

    private void a(a a2) {
        if (2 != a2.d() || a2.b() == null) {
            return;
        }
        if (!this.a.isEmpty()) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                org.apache.commons.compress.archivers.a a3;
                a a4 = (a)iterator.next();
                if (a4.d() != 2 || a4.a() == null || !(a3 = a4.a()).equals(a2.a())) continue;
                if (a2.e()) {
                    iterator.remove();
                    this.a.add(a2);
                    return;
                }
                return;
            }
        }
        this.a.add(a2);
    }

    private void b(a a2) {
        if (1 != a2.d() && 4 != a2.d() || a2.c() == null) {
            return;
        }
        String string = a2.c();
        if (string != null && !this.a.isEmpty()) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                String string2;
                a a3 = (a)iterator.next();
                if (a3.d() != 2 || a3.a() == null || (string2 = a3.a().getName()) == null) continue;
                if (1 == a2.d() && string.equals(string2)) {
                    iterator.remove();
                    continue;
                }
                if (4 != a2.d() || !string2.matches(string + "/.*")) continue;
                iterator.remove();
            }
        }
        this.a.add(a2);
    }

    Set a() {
        return new LinkedHashSet(this.a);
    }
}

