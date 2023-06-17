/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.DIDeviceObject;
import net.java.games.input.h;
import net.java.games.input.l;
import net.java.games.input.y;

final class x
extends h {
    private final DIDeviceObject a;

    public x(l l2, DIDeviceObject dIDeviceObject) {
        super(dIDeviceObject.f(), l2);
        this.a = dIDeviceObject;
    }

    public final boolean c() {
        return this.a.p();
    }

    public final boolean b() {
        return this.a.q();
    }

    public final float e() {
        return this.a.m();
    }

    public final DIDeviceObject j() {
        return this.a;
    }

    protected final float a() {
        return y.a(this, this.a);
    }
}

