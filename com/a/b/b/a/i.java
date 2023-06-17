/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ac;
import com.a.b.b.a.j;
import com.a.b.d.e;
import com.a.b.t;
import com.a.b.w;
import com.a.b.y;
import com.a.b.z;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class i
extends e {
    private static final Writer a = new j();
    private static final ac b = new ac("closed");
    private final List c = new ArrayList();
    private String d;
    private w e = y.a;

    public i() {
        super(a);
    }

    public w a() {
        if (!this.c.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.c);
        }
        return this.e;
    }

    private w j() {
        return (w)this.c.get(this.c.size() - 1);
    }

    private void a(w w2) {
        if (this.d != null) {
            if (!w2.s() || this.i()) {
                z z2 = (z)this.j();
                z2.a(this.d, w2);
            }
            this.d = null;
        } else if (this.c.isEmpty()) {
            this.e = w2;
        } else {
            w w3 = this.j();
            if (w3 instanceof t) {
                ((t)w3).a(w2);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public e b() {
        t t2 = new t();
        this.a(t2);
        this.c.add(t2);
        return this;
    }

    public e c() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        w w2 = this.j();
        if (w2 instanceof t) {
            this.c.remove(this.c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    public e d() {
        z z2 = new z();
        this.a(z2);
        this.c.add(z2);
        return this;
    }

    public e e() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        w w2 = this.j();
        if (w2 instanceof z) {
            this.c.remove(this.c.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    public e a(String string) {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        w w2 = this.j();
        if (w2 instanceof z) {
            this.d = string;
            return this;
        }
        throw new IllegalStateException();
    }

    public e b(String string) {
        if (string == null) {
            return this.f();
        }
        this.a(new ac(string));
        return this;
    }

    public e f() {
        this.a(y.a);
        return this;
    }

    public e a(boolean bl2) {
        this.a(new ac(bl2));
        return this;
    }

    public e a(double d2) {
        if (!this.g() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
        this.a(new ac(d2));
        return this;
    }

    public e a(long l2) {
        this.a(new ac(l2));
        return this;
    }

    public e a(Number number) {
        double d2;
        if (number == null) {
            return this.f();
        }
        if (!this.g() && (Double.isNaN(d2 = number.doubleValue()) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
        }
        this.a(new ac(number));
        return this;
    }

    public void flush() {
    }

    public void close() {
        if (!this.c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.c.add(b);
    }
}

