/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.a.c.c.a;
import org.apache.a.c.c.c;
import org.apache.a.c.c.d;
import org.apache.a.c.c.i;
import org.apache.a.f.f;
import org.apache.a.k.s;
import org.apache.a.l.j;
import org.apache.a.u;

public abstract class b
extends org.apache.a.k.a
implements Cloneable,
a,
i,
u {
    private Lock a = new ReentrantLock();
    private volatile boolean d;
    private volatile org.apache.a.d.b e;

    protected b() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(f f2) {
        if (this.d) {
            return;
        }
        this.a.lock();
        try {
            this.e = new c(this, f2);
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(org.apache.a.f.j j2) {
        if (this.d) {
            return;
        }
        this.a.lock();
        try {
            this.e = new d(this, j2);
        }
        finally {
            this.a.unlock();
        }
    }

    private void l() {
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cK_() {
        if (this.d) {
            return;
        }
        this.a.lock();
        try {
            this.d = true;
            this.l();
        }
        finally {
            this.a.unlock();
        }
    }

    public boolean h() {
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(org.apache.a.d.b b2) {
        if (this.d) {
            return;
        }
        this.a.lock();
        try {
            this.e = b2;
        }
        finally {
            this.a.unlock();
        }
    }

    public Object clone() {
        b b2 = (b)super.clone();
        b2.b = (s)org.apache.a.c.f.a.a(this.b);
        b2.c = (j)org.apache.a.c.f.a.a(this.c);
        b2.a = new ReentrantLock();
        b2.e = null;
        b2.d = false;
        return b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        this.a.lock();
        try {
            this.e = null;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j() {
        this.a.lock();
        try {
            this.l();
            this.d = false;
        }
        finally {
            this.a.unlock();
        }
    }
}

