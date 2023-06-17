/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.a.f.a.g;
import org.apache.a.i.c.a.i;
import org.apache.a.i.c.a.l;
import org.apache.a.i.c.b;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class h {
    private final a g = org.apache.commons.d.c.b(this.getClass());
    protected final org.apache.a.f.b.b a;
    protected final int b;
    protected final g c;
    protected final LinkedList d;
    protected final Queue e;
    protected int f;

    public h(org.apache.a.f.b.b b2, int n2) {
        this.a = b2;
        this.b = n2;
        this.c = new i(this);
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.f = 0;
    }

    public h(org.apache.a.f.b.b b2, g g2) {
        this.a = b2;
        this.c = g2;
        this.b = g2.a(b2);
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.f = 0;
    }

    public final org.apache.a.f.b.b a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean c() {
        return this.f < 1 && this.e.isEmpty();
    }

    public int d() {
        return this.c.a(this.a) - this.f;
    }

    public final int e() {
        return this.f;
    }

    public org.apache.a.i.c.a.b a(Object object) {
        Object object2;
        Object object3;
        if (!this.d.isEmpty()) {
            object3 = this.d.listIterator(this.d.size());
            while (object3.hasPrevious()) {
                object2 = (org.apache.a.i.c.a.b)object3.previous();
                if (((b)object2).a() != null && !org.apache.a.o.i.a(object, ((b)object2).a())) continue;
                object3.remove();
                return object2;
            }
        }
        if (this.d() == 0 && !this.d.isEmpty()) {
            object3 = (org.apache.a.i.c.a.b)this.d.remove();
            ((org.apache.a.i.c.a.b)object3).b();
            object2 = ((org.apache.a.i.c.a.b)object3).c();
            try {
                object2.close();
            }
            catch (IOException iOException) {
                this.g.b("I/O error closing connection", iOException);
            }
            return object3;
        }
        return null;
    }

    public void a(org.apache.a.i.c.a.b b2) {
        if (this.f < 1) {
            throw new IllegalStateException("No entry created for this pool. " + this.a);
        }
        if (this.f <= this.d.size()) {
            throw new IllegalStateException("No entry allocated from this pool. " + this.a);
        }
        this.d.add(b2);
    }

    public void b(org.apache.a.i.c.a.b b2) {
        org.apache.a.o.a.a(this.a.equals(b2.d()), "Entry not planned for this pool");
        ++this.f;
    }

    public boolean c(org.apache.a.i.c.a.b b2) {
        boolean bl2 = this.d.remove(b2);
        if (bl2) {
            --this.f;
        }
        return bl2;
    }

    public void f() {
        org.apache.a.o.b.a(this.f > 0, "There is no entry that could be dropped");
        --this.f;
    }

    public void a(l l2) {
        org.apache.a.o.a.a(l2, "Waiting thread");
        this.e.add(l2);
    }

    public boolean g() {
        return !this.e.isEmpty();
    }

    public l h() {
        return (l)this.e.peek();
    }

    public void b(l l2) {
        if (l2 == null) {
            return;
        }
        this.e.remove(l2);
    }
}

