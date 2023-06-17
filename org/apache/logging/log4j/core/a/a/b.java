/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a;

import java.util.ArrayList;
import org.apache.logging.log4j.core.a.a.c;
import org.apache.logging.log4j.core.a.x;
import org.apache.logging.log4j.core.h;

public abstract class b
extends org.apache.logging.log4j.core.a.b {
    private final ArrayList c;
    private final int d;
    private boolean e = false;

    protected b(String string, int n2) {
        super(string);
        this.d = n2;
        this.c = new ArrayList(n2 + 1);
    }

    protected abstract void f();

    public final synchronized void g() {
        if (!this.j()) {
            try {
                this.f();
                this.e = true;
            }
            catch (Exception exception) {
                a.b("Could not connect to database using logging manager [{}].", this.d(), exception);
            }
        }
    }

    protected abstract void h();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void i() {
        this.k();
        if (this.j()) {
            try {
                this.h();
            }
            catch (Exception exception) {
                a.f("Error while disconnecting from database using logging manager [{}].", this.d(), exception);
            }
            finally {
                this.e = false;
            }
        }
    }

    public final boolean j() {
        return this.e;
    }

    protected abstract void a(h var1);

    public final synchronized void k() {
        if (this.j() && this.c.size() > 0) {
            for (h h2 : this.c) {
                this.a(h2);
            }
            this.c.clear();
        }
    }

    public final synchronized void b(h h2) {
        if (this.d > 0) {
            this.c.add(h2);
            if (this.c.size() >= this.d || h2.m()) {
                this.k();
            }
        } else {
            this.a(h2);
        }
    }

    @Override
    public final void a() {
        this.i();
    }

    public final String toString() {
        return this.d();
    }

    protected static b a(String string, c c2, x x2) {
        return (b)org.apache.logging.log4j.core.a.b.a(string, x2, c2);
    }
}

