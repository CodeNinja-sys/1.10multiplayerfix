/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.IDirectInputDevice;

final class aa {
    private final IDirectInputDevice a;
    private final byte[] b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;

    public aa(IDirectInputDevice iDirectInputDevice, byte[] arrby, int n2, int n3, int n4, int n5, String string) {
        this.a = iDirectInputDevice;
        this.b = arrby;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = string;
    }

    public final byte[] a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.g;
    }
}

