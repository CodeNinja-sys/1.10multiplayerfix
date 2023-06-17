/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.cc;
import net.java.games.input.r;

final class LinuxInputID {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public LinuxInputID(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    public final r a() {
        return cc.b(this.a);
    }

    public final String toString() {
        return "LinuxInputID: bustype = 0x" + Integer.toHexString(this.a) + " | vendor = 0x" + Integer.toHexString(this.b) + " | product = 0x" + Integer.toHexString(this.c) + " | version = 0x" + Integer.toHexString(this.d);
    }
}

