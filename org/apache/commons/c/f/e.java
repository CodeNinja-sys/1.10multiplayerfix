/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import org.apache.commons.c.f.a;

public class e
extends Number
implements Comparable,
a {
    private static final long a = 5787169186L;
    private float b;

    public e() {
    }

    public e(float f2) {
        this.b = f2;
    }

    public e(Number number) {
        this.b = number.floatValue();
    }

    public e(String string) {
        this.b = Float.parseFloat(string);
    }

    public Float b() {
        return Float.valueOf(this.b);
    }

    public void a(float f2) {
        this.b = f2;
    }

    public void a(Number number) {
        this.b = number.floatValue();
    }

    public boolean c() {
        return Float.isNaN(this.b);
    }

    public boolean d() {
        return Float.isInfinite(this.b);
    }

    public void e() {
        this.b += 1.0f;
    }

    public void f() {
        this.b -= 1.0f;
    }

    public void b(float f2) {
        this.b += f2;
    }

    public void b(Number number) {
        this.b += number.floatValue();
    }

    public void c(float f2) {
        this.b -= f2;
    }

    public void c(Number number) {
        this.b -= number.floatValue();
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
        return this.b;
    }

    @Override
    public double doubleValue() {
        return this.b;
    }

    public Float g() {
        return Float.valueOf(this.floatValue());
    }

    public boolean equals(Object object) {
        return object instanceof e && Float.floatToIntBits(((e)object).b) == Float.floatToIntBits(this.b);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    public int a(e e2) {
        float f2 = e2.b;
        return Float.compare(this.b, f2);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((e)object);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

