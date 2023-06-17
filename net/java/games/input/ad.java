/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.IDirectInputDevice;
import net.java.games.input.ar;
import net.java.games.input.cf;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.q;
import net.java.games.input.y;

final class ad
extends cf {
    private final IDirectInputDevice a;

    protected ad(IDirectInputDevice iDirectInputDevice, k[] arrk, q[] arrq, dj[] arrdj) {
        super(iDirectInputDevice.d(), arrk, arrq, arrdj);
        this.a = iDirectInputDevice;
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
}

