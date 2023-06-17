/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.f;

import org.apache.commons.c.f.a;

public class c
extends Number
implements Comparable,
a {
    private static final long a = -1585823265L;
    private byte b;

    public c() {
    }

    public c(byte by2) {
        this.b = by2;
    }

    public c(Number number) {
        this.b = number.byteValue();
    }

    public c(String string) {
        this.b = Byte.parseByte(string);
    }

    public Byte b() {
        return this.b;
    }

    public void a(byte by2) {
        this.b = by2;
    }

    public void a(Number number) {
        this.b = number.byteValue();
    }

    public void c() {
        this.b = (byte)(this.b + 1);
    }

    public void d() {
        this.b = (byte)(this.b - 1);
    }

    public void b(byte by2) {
        this.b = (byte)(this.b + by2);
    }

    public void b(Number number) {
        this.b = (byte)(this.b + number.byteValue());
    }

    public void c(byte by2) {
        this.b = (byte)(this.b - by2);
    }

    public void c(Number number) {
        this.b = (byte)(this.b - number.byteValue());
    }

    @Override
    public byte byteValue() {
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

    public Byte e() {
        return this.byteValue();
    }

    public boolean equals(Object object) {
        if (object instanceof c) {
            return this.b == ((c)object).byteValue();
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }

    public int a(c c2) {
        byte by2 = c2.b;
        return this.b < by2 ? -1 : (this.b == by2 ? 0 : 1);
    }

    public String toString() {
        return String.valueOf(this.b);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((c)object);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

