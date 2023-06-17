/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import java.io.Serializable;
import org.apache.commons.c.f.a;

public class b
implements Serializable,
Comparable,
a {
    private static final long a = -4830728138360036487L;
    private boolean b;

    public b() {
    }

    public b(boolean bl2) {
        this.b = bl2;
    }

    public b(Boolean bl2) {
        this.b = bl2;
    }

    public Boolean b() {
        return this.b;
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }

    public void c() {
        this.b = false;
    }

    public void d() {
        this.b = true;
    }

    public void a(Boolean bl2) {
        this.b = bl2;
    }

    public boolean e() {
        return this.b;
    }

    public boolean f() {
        return !this.b;
    }

    public boolean g() {
        return this.b;
    }

    public Boolean h() {
        return this.g();
    }

    public boolean equals(Object object) {
        if (object instanceof b) {
            return this.b == ((b)object).g();
        }
        return false;
    }

    public int hashCode() {
        return this.b ? Boolean.TRUE.hashCode() : Boolean.FALSE.hashCode();
    }

    public int a(b b2) {
        boolean bl2 = b2.b;
        return this.b == bl2 ? 0 : (this.b ? 1 : -1);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((b)object);
    }
}

