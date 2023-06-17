/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.Iterator;
import org.apache.logging.log4j.core.c.g;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.d;

public abstract class b
implements g {
    protected static final d h = org.apache.logging.log4j.d.d.k();
    private volatile org.apache.logging.log4j.core.d a;

    protected b(org.apache.logging.log4j.core.d d2) {
        this.a = d2;
    }

    protected b() {
    }

    @Override
    public org.apache.logging.log4j.core.d aY_() {
        return this.a;
    }

    @Override
    public synchronized void a(org.apache.logging.log4j.core.d d2) {
        if (this.a == null) {
            this.a = d2;
        } else if (d2 instanceof org.apache.logging.log4j.core.c.e) {
            this.a = ((org.apache.logging.log4j.core.c.e)this.a).a(d2);
        } else {
            org.apache.logging.log4j.core.d[] arrd = new org.apache.logging.log4j.core.d[]{this.a, d2};
            this.a = org.apache.logging.log4j.core.c.e.a(arrd);
        }
    }

    @Override
    public synchronized void b(org.apache.logging.log4j.core.d d2) {
        if (this.a == d2) {
            this.a = null;
        } else if (d2 instanceof org.apache.logging.log4j.core.c.e) {
            org.apache.logging.log4j.core.c.e e2 = (org.apache.logging.log4j.core.c.e)d2;
            if ((e2 = e2.b(d2)).h() > 1) {
                this.a = e2;
            } else if (e2.h() == 1) {
                Iterator iterator = e2.iterator();
                this.a = (org.apache.logging.log4j.core.d)iterator.next();
            } else {
                this.a = null;
            }
        }
    }

    @Override
    public boolean s() {
        return this.a != null;
    }

    public void aZ_() {
        if (this.a != null && this.a instanceof org.apache.logging.log4j.core.g) {
            ((org.apache.logging.log4j.core.g)((Object)this.a)).e();
        }
    }

    public void ba_() {
        if (this.a != null && this.a instanceof org.apache.logging.log4j.core.g) {
            ((org.apache.logging.log4j.core.g)((Object)this.a)).f();
        }
    }

    @Override
    public boolean b(h h2) {
        return this.a != null && this.a.a(h2) == e.c;
    }
}

