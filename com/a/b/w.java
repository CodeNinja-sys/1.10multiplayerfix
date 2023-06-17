/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ac;
import com.a.b.b.ag;
import com.a.b.d.e;
import com.a.b.t;
import com.a.b.y;
import com.a.b.z;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class w {
    abstract w o();

    public boolean p() {
        return this instanceof t;
    }

    public boolean q() {
        return this instanceof z;
    }

    public boolean r() {
        return this instanceof ac;
    }

    public boolean s() {
        return this instanceof y;
    }

    public z t() {
        if (this.q()) {
            return (z)this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public t u() {
        if (this.p()) {
            return (t)this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    public ac v() {
        if (this.r()) {
            return (ac)this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    public y w() {
        if (this.s()) {
            return (y)this;
        }
        throw new IllegalStateException("This is not a JSON Null.");
    }

    public boolean n() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    Boolean x() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public Number c() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String d() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public double e() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public float h() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public long i() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public int j() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public byte k() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public char l() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public BigDecimal f() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public BigInteger g() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public short m() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            e e2 = new e(stringWriter);
            e2.b(true);
            ag.a(this, e2);
            return stringWriter.toString();
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }
}

