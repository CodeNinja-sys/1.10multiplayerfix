/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

final class e
extends ThreadLocal {
    e() {
    }

    protected char[] a() {
        return new char[256];
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

