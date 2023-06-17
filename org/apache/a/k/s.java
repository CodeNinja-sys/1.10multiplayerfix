/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.a.f;
import org.apache.a.i;
import org.apache.a.k.b;
import org.apache.a.k.m;
import org.apache.a.o.d;

public class s
implements Serializable,
Cloneable {
    private static final long a = 2608834160639271617L;
    private final List b = new ArrayList(16);

    public void a() {
        this.b.clear();
    }

    public void a(f f2) {
        if (f2 == null) {
            return;
        }
        this.b.add(f2);
    }

    public void b(f f2) {
        if (f2 == null) {
            return;
        }
        this.b.remove(f2);
    }

    public void c(f f2) {
        if (f2 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            f f3 = (f)this.b.get(i2);
            if (!f3.c().equalsIgnoreCase(f2.c())) continue;
            this.b.set(i2, f2);
            return;
        }
        this.b.add(f2);
    }

    public void a(f[] arrf) {
        this.a();
        if (arrf == null) {
            return;
        }
        Collections.addAll(this.b, arrf);
    }

    public f a(String string) {
        f[] arrf = this.b(string);
        if (arrf.length == 0) {
            return null;
        }
        if (arrf.length == 1) {
            return arrf[0];
        }
        d d2 = new d(128);
        d2.a(arrf[0].d());
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            d2.a(", ");
            d2.a(arrf[i2].d());
        }
        return new b(string.toLowerCase(Locale.ENGLISH), d2.toString());
    }

    public f[] b(String string) {
        ArrayList<f> arrayList = new ArrayList<f>();
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            f f2 = (f)this.b.get(i2);
            if (!f2.c().equalsIgnoreCase(string)) continue;
            arrayList.add(f2);
        }
        return arrayList.toArray(new f[arrayList.size()]);
    }

    public f c(String string) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            f f2 = (f)this.b.get(i2);
            if (!f2.c().equalsIgnoreCase(string)) continue;
            return f2;
        }
        return null;
    }

    public f d(String string) {
        for (int i2 = this.b.size() - 1; i2 >= 0; --i2) {
            f f2 = (f)this.b.get(i2);
            if (!f2.c().equalsIgnoreCase(string)) continue;
            return f2;
        }
        return null;
    }

    public f[] b() {
        return this.b.toArray(new f[this.b.size()]);
    }

    public boolean e(String string) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            f f2 = (f)this.b.get(i2);
            if (!f2.c().equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    public i c() {
        return new m(this.b, null);
    }

    public i f(String string) {
        return new m(this.b, string);
    }

    public s d() {
        s s2 = new s();
        s2.b.addAll(this.b);
        return s2;
    }

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        return this.b.toString();
    }
}

