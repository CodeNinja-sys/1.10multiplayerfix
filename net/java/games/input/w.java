/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.IDirectInputDevice;
import net.java.games.input.ar;
import net.java.games.input.dj;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.s;
import net.java.games.input.y;

final class w
extends i {
    private final IDirectInputDevice a;
    private final s c;

    protected w(IDirectInputDevice iDirectInputDevice, k[] arrk, q[] arrq, dj[] arrdj, s s2) {
        super(iDirectInputDevice.d(), arrk, arrq, arrdj);
        this.a = iDirectInputDevice;
        this.c = s2;
    }

    public final void a() {
        this.a.c();
    }

    protected final boolean a(ar ar2) {
        return y.a(ar2, this.a);
    }

    protected final void a(int n2) {
        this.a.c(n2);
    }

    public final s h() {
        return this.c;
    }
}

