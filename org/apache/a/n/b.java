/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.a.n.g;
import org.apache.a.n.k;
import org.apache.a.n.r;
import org.apache.a.n.s;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.w;
import org.apache.a.x;
import org.apache.a.z;

public final class b
implements Cloneable,
k,
r,
s {
    protected final List a = new ArrayList();
    protected final List b = new ArrayList();

    public void a(w w2) {
        if (w2 == null) {
            return;
        }
        this.a.add(w2);
    }

    public void a(w w2, int n2) {
        if (w2 == null) {
            return;
        }
        this.a.add(n2, w2);
    }

    public void a(z z2, int n2) {
        if (z2 == null) {
            return;
        }
        this.b.add(n2, z2);
    }

    public void a(Class class_) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!e2.getClass().equals(class_)) continue;
            iterator.remove();
        }
    }

    public void b(Class class_) {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            if (!e2.getClass().equals(class_)) continue;
            iterator.remove();
        }
    }

    public final void b(w w2) {
        this.a(w2);
    }

    public final void b(w w2, int n2) {
        this.a(w2, n2);
    }

    public int a() {
        return this.a.size();
    }

    public w a(int n2) {
        if (n2 < 0 || n2 >= this.a.size()) {
            return null;
        }
        return (w)this.a.get(n2);
    }

    public void b() {
        this.a.clear();
    }

    public void a(z z2) {
        if (z2 == null) {
            return;
        }
        this.b.add(z2);
    }

    public final void b(z z2) {
        this.a(z2);
    }

    public final void b(z z2, int n2) {
        this.a(z2, n2);
    }

    public int c() {
        return this.b.size();
    }

    public z b(int n2) {
        if (n2 < 0 || n2 >= this.b.size()) {
            return null;
        }
        return (z)this.b.get(n2);
    }

    public void d() {
        this.b.clear();
    }

    public void a(List list) {
        org.apache.a.o.a.a((Object)list, "Inteceptor list");
        this.a.clear();
        this.b.clear();
        for (Object e2 : list) {
            if (e2 instanceof w) {
                this.b((w)e2);
            }
            if (!(e2 instanceof z)) continue;
            this.b((z)e2);
        }
    }

    public void e() {
        this.b();
        this.d();
    }

    public void a(u u2, g g2) {
        for (w w2 : this.a) {
            w2.a(u2, g2);
        }
    }

    public void a(x x2, g g2) {
        for (z z2 : this.b) {
            z2.a(x2, g2);
        }
    }

    protected void a(b b2) {
        b2.a.clear();
        b2.a.addAll(this.a);
        b2.b.clear();
        b2.b.addAll(this.b);
    }

    public b f() {
        b b2 = new b();
        this.a(b2);
        return b2;
    }

    public Object clone() {
        b b2 = (b)super.clone();
        this.a(b2);
        return b2;
    }
}

