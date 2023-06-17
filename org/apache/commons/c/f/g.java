/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import org.apache.commons.c.f.a;

public class g
extends Number
implements Comparable,
a {
    private static final long a = 62986528375L;
    private long b;

    public g() {
    }

    public g(long l2) {
        this.b = l2;
    }

    public g(Number number) {
        this.b = number.longValue();
    }

    public g(String string) {
        this.b = Long.parseLong(string);
    }

    public Long b() {
        return this.b;
    }

    public void a(long l2) {
        this.b = l2;
    }

    public void a(Number number) {
        this.b = number.longValue();
    }

    public void c() {
        ++this.b;
    }

    public void d() {
        --this.b;
    }

    public void b(long l2) {
        this.b += l2;
    }

    public void b(Number number) {
        this.b += number.longValue();
    }

    public void c(long l2) {
        this.b -= l2;
    }

    public void c(Number number) {
        this.b -= number.longValue();
    }

    @Override
    public int intValue() {
        return (int)this.b;
    }

    @Override
    public long longValue() {
        return this.b;
    }

    @Override
    public float floatValue() {
        return this.b;
    }

    @Override
    public double doubleValue() {
        return this.b;
    }

    public Long e() {
        return this.longValue();
    }

    public boolean equals(Object object) {
        if (object instanceof g) {
            return this.b == ((g)object).longValue();
        }
        return false;
    }

    public int hashCode() {
        return (int)(this.b ^ this.b >>> 32);
    }

    public int a(g g2) {
        long l2 = g2.b;
        return this.b < l2 ? -1 : (this.b == l2 ? 0 : 1);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((g)object);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

