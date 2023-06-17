/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.e;

final class o
extends ThreadLocal {
    o() {
    }

    protected char[] a() {
        return new char[1024];
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

