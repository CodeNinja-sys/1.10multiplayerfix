/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.c.g;
import org.apache.commons.c.h;

class i
implements Iterator {
    private char a;
    private final g b;
    private boolean c;

    private i(g g2) {
        this.b = g2;
        this.c = true;
        if (g.b(this.b)) {
            if (g.c(this.b) == '\u0000') {
                if (g.d(this.b) == '\uffff') {
                    this.c = false;
                } else {
                    this.a = (char)(g.d(this.b) + '\u0001');
                }
            } else {
                this.a = '\u0000';
            }
        } else {
            this.a = g.c(this.b);
        }
    }

    private void b() {
        if (g.b(this.b)) {
            if (this.a == '\uffff') {
                this.c = false;
            } else if (this.a + '\u0001' == g.c(this.b)) {
                if (g.d(this.b) == '\uffff') {
                    this.c = false;
                } else {
                    this.a = (char)(g.d(this.b) + '\u0001');
                }
            } else {
                this.a = (char)(this.a + '\u0001');
            }
        } else if (this.a < g.d(this.b)) {
            this.a = (char)(this.a + '\u0001');
        } else {
            this.c = false;
        }
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }

    public Character a() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
        char c2 = this.a;
        this.b();
        return Character.valueOf(c2);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ i(g g2, h h2) {
        this(g2);
    }
}

