/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

import io.netty.util.c.ad;
import io.netty.util.c.b.f;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.io.Serializable;

public abstract class a
implements g,
Serializable {
    private static final long a = -6382972526573193470L;
    private final String b;

    protected a(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        this.b = string;
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public boolean a(f f2) {
        switch (f2) {
            case a: {
                return this.c();
            }
            case b: {
                return this.d();
            }
            case c: {
                return this.e();
            }
            case d: {
                return this.f();
            }
            case e: {
                return this.g();
            }
        }
        throw new Error();
    }

    @Override
    public void a(f f2, String string, Throwable throwable) {
        switch (f2) {
            case a: {
                this.a(string, throwable);
                break;
            }
            case b: {
                this.b(string, throwable);
                break;
            }
            case c: {
                this.c(string, throwable);
                break;
            }
            case d: {
                this.d(string, throwable);
                break;
            }
            case e: {
                this.e(string, throwable);
                break;
            }
            default: {
                throw new Error();
            }
        }
    }

    @Override
    public void a(f f2, String string) {
        switch (f2) {
            case a: {
                this.a(string);
                break;
            }
            case b: {
                this.b(string);
                break;
            }
            case c: {
                this.c(string);
                break;
            }
            case d: {
                this.d(string);
                break;
            }
            case e: {
                this.e(string);
                break;
            }
            default: {
                throw new Error();
            }
        }
    }

    @Override
    public void a(f f2, String string, Object object) {
        switch (f2) {
            case a: {
                this.a(string, object);
                break;
            }
            case b: {
                this.b(string, object);
                break;
            }
            case c: {
                this.c(string, object);
                break;
            }
            case d: {
                this.d(string, object);
                break;
            }
            case e: {
                this.e(string, object);
                break;
            }
            default: {
                throw new Error();
            }
        }
    }

    @Override
    public void a(f f2, String string, Object object, Object object2) {
        switch (f2) {
            case a: {
                this.a(string, object, object2);
                break;
            }
            case b: {
                this.b(string, object, object2);
                break;
            }
            case c: {
                this.c(string, object, object2);
                break;
            }
            case d: {
                this.d(string, object, object2);
                break;
            }
            case e: {
                this.e(string, object, object2);
                break;
            }
            default: {
                throw new Error();
            }
        }
    }

    @Override
    public void a(f f2, String string, Object ... arrobject) {
        switch (f2) {
            case a: {
                this.a(string, arrobject);
                break;
            }
            case b: {
                this.b(string, arrobject);
                break;
            }
            case c: {
                this.c(string, arrobject);
                break;
            }
            case d: {
                this.d(string, arrobject);
                break;
            }
            case e: {
                this.e(string, arrobject);
                break;
            }
            default: {
                throw new Error();
            }
        }
    }

    protected Object b() {
        return h.b(this.a());
    }

    public String toString() {
        return ad.a(this) + '(' + this.a() + ')';
    }
}

