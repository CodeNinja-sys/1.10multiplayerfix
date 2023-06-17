/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import org.apache.commons.c.f.a;

public class d
extends Number
implements Comparable,
a {
    private static final long a = 1587163916L;
    private double b;

    public d() {
    }

    public d(double d2) {
        this.b = d2;
    }

    public d(Number number) {
        this.b = number.doubleValue();
    }

    public d(String string) {
        this.b = Double.parseDouble(string);
    }

    public Double b() {
        return this.b;
    }

    public void a(double d2) {
        this.b = d2;
    }

    public void a(Number number) {
        this.b = number.doubleValue();
    }

    public boolean c() {
        return Double.isNaN(this.b);
    }

    public boolean d() {
        return Double.isInfinite(this.b);
    }

    public void e() {
        this.b += 1.0;
    }

    public void f() {
        this.b -= 1.0;
    }

    public void b(double d2) {
        this.b += d2;
    }

    public void b(Number number) {
        this.b += number.doubleValue();
    }

    public void c(double d2) {
        this.b -= d2;
    }

    public void c(Number number) {
        this.b -= number.doubleValue();
    }

    @Override
    public int intValue() {
        return (int)this.b;
    }

    @Override
    public long longValue() {
        return (long)this.b;
    }

    @Override
    public float floatValue() {
        return (float)this.b;
    }

    @Override
    public double doubleValue() {
        return this.b;
    }

    public Double g() {
        return this.doubleValue();
    }

    public boolean equals(Object object) {
        return object instanceof d && Double.doubleToLongBits(((d)object).b) == Double.doubleToLongBits(this.b);
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.b);
        return (int)(l2 ^ l2 >>> 32);
    }

    public int a(d d2) {
        double d3 = d2.b;
        return Double.compare(this.b, d3);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((d)object);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

