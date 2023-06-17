/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import org.apache.commons.c.f.a;

public class f
extends Number
implements Comparable,
a {
    private static final long a = 512176391864L;
    private int b;

    public f() {
    }

    public f(int n2) {
        this.b = n2;
    }

    public f(Number number) {
        this.b = number.intValue();
    }

    public f(String string) {
        this.b = Integer.parseInt(string);
    }

    public Integer b() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public void a(Number number) {
        this.b = number.intValue();
    }

    public void c() {
        ++this.b;
    }

    public void d() {
        --this.b;
    }

    public void b(int n2) {
        this.b += n2;
    }

    public void b(Number number) {
        this.b += number.intValue();
    }

    public void c(int n2) {
        this.b -= n2;
    }

    public void c(Number number) {
        this.b -= number.intValue();
    }

    @Override
    public int intValue() {
        return this.b;
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

    public Integer e() {
        return this.intValue();
    }

    public boolean equals(Object object) {
        if (object instanceof f) {
            return this.b == ((f)object).intValue();
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }

    public int a(f f2) {
        int n2 = f2.b;
        return this.b < n2 ? -1 : (this.b == n2 ? 0 : 1);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((f)object);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

