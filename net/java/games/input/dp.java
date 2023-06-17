/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.WinTabContext;
import net.java.games.input.WinTabPacket;
import net.java.games.input.ar;
import net.java.games.input.dq;
import net.java.games.input.l;

public class dp
extends dq {
    private int j;

    protected dp(WinTabContext winTabContext, int n2, String string, l l2, int n3) {
        super(winTabContext, n2, string, l2);
        this.j = n3;
    }

    public ar a(WinTabPacket winTabPacket) {
        float f2;
        ar ar2 = null;
        float f3 = f2 = (winTabPacket.e & (int)Math.pow(2.0, this.j)) > 0 ? 1.0f : 0.0f;
        if (f2 != this.f()) {
            this.h = f2;
            ar2 = new ar();
            ar2.a(this, f2, winTabPacket.a * 1000L);
            return ar2;
        }
        return ar2;
    }
}

