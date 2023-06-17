/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.OSXHIDDevice;
import net.java.games.input.OSXHIDQueue;
import net.java.games.input.ar;
import net.java.games.input.cj;
import net.java.games.input.dj;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.r;
import net.java.games.input.s;

final class ch
extends i {
    private final r a;
    private final OSXHIDQueue c;
    private final s d;

    protected ch(OSXHIDDevice oSXHIDDevice, OSXHIDQueue oSXHIDQueue, k[] arrk, q[] arrq, dj[] arrdj, s s2) {
        super(oSXHIDDevice.b(), arrk, arrq, arrdj);
        this.c = oSXHIDQueue;
        this.d = s2;
        this.a = oSXHIDDevice.a();
    }

    protected final boolean a(ar ar2) {
        return cj.a(ar2, this.c);
    }

    protected final void a(int n2) {
        this.c.a(n2);
    }

    public s h() {
        return this.d;
    }

    public final r e() {
        return this.a;
    }
}

