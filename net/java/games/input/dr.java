/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.WinTabContext;
import net.java.games.input.WinTabPacket;
import net.java.games.input.ar;
import net.java.games.input.dq;
import net.java.games.input.l;

public class dr
extends dq {
    private int j;

    protected dr(WinTabContext winTabContext, int n2, String string, l l2, int n3) {
        super(winTabContext, n2, string, l2);
        this.j = n3;
    }

    public ar a(WinTabPacket winTabPacket) {
        ar ar2 = null;
        if (winTabPacket.h == this.j && this.h == 0.0f) {
            this.h = 1.0f;
            ar2 = new ar();
            ar2.a(this, this.h, winTabPacket.a * 1000L);
        } else if (winTabPacket.h != this.j && this.h == 1.0f) {
            this.h = 0.0f;
            ar2 = new ar();
            ar2.a(this, this.h, winTabPacket.a * 1000L);
        }
        return ar2;
    }
}

