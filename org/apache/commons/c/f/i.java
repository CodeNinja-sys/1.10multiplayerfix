/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import org.apache.commons.c.f.a;

public class i
extends Number
implements Comparable,
a {
    private static final long a = -2135791679L;
    private short b;

    public i() {
    }

    public i(short s2) {
        this.b = s2;
    }

    public i(Number number) {
        this.b = number.shortValue();
    }

    public i(String string) {
        this.b = Short.parseShort(string);
    }

    public Short b() {
        return this.b;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public void a(Number number) {
        this.b = number.shortValue();
    }

    public void c() {
        this.b = (short)(this.b + 1);
    }

    public void d() {
        this.b = (short)(this.b - 1);
    }

    public void b(short s2) {
        this.b = (short)(this.b + s2);
    }

    public void b(Number number) {
        this.b = (short)(this.b + number.shortValue());
    }

    public void c(short s2) {
        this.b = (short)(this.b - s2);
    }

    public void c(Number number) {
        this.b = (short)(this.b - number.shortValue());
    }

    @Override
    public short shortValue() {
        return this.b;
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

    public Short e() {
        return this.shortValue();
    }

    public boolean equals(Object object) {
        if (object instanceof i) {
            return this.b == ((i)object).shortValue();
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }

    public int a(i i2) {
        short s2 = i2.b;
        return this.b < s2 ? -1 : (this.b == s2 ? 0 : 1);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((i)object);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

