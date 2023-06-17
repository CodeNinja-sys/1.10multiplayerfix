/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.d;

import java.util.List;
import java.util.Set;
import org.apache.commons.c.d.d;
import org.apache.commons.c.d.e;

public class b
extends Exception
implements e {
    private static final long a = 20110706L;
    private final e b;

    public b() {
        this.b = new d();
    }

    public b(String string) {
        super(string);
        this.b = new d();
    }

    public b(Throwable throwable) {
        super(throwable);
        this.b = new d();
    }

    public b(String string, Throwable throwable) {
        super(string, throwable);
        this.b = new d();
    }

    public b(String string, Throwable throwable, e e2) {
        super(string, throwable);
        if (e2 == null) {
            e2 = new d();
        }
        this.b = e2;
    }

    public b a(String string, Object object) {
        this.b.d(string, object);
        return this;
    }

    public b b(String string, Object object) {
        this.b.c(string, object);
        return this;
    }

    @Override
    public List a(String string) {
        return this.b.a(string);
    }

    @Override
    public Object b(String string) {
        return this.b.b(string);
    }

    @Override
    public List a() {
        return this.b.a();
    }

    @Override
    public Set b() {
        return this.b.b();
    }

    @Override
    public String getMessage() {
        return this.c(super.getMessage());
    }

    public String c() {
        return super.getMessage();
    }

    @Override
    public String c(String string) {
        return this.b.c(string);
    }

    @Override
    public /* synthetic */ e c(String string, Object object) {
        return this.b(string, object);
    }

    @Override
    public /* synthetic */ e d(String string, Object object) {
        return this.a(string, object);
    }
}

