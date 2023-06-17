/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.IDirectInputDevice;
import net.java.games.input.ak;
import net.java.games.input.al;

final class ap
extends Thread {
    private final ak a;

    private ap(ak ak2) {
        this.a = ak2;
    }

    public final void run() {
        for (int i2 = 0; i2 < ak.a(this.a).size(); ++i2) {
            IDirectInputDevice iDirectInputDevice = (IDirectInputDevice)ak.a(this.a).get(i2);
            iDirectInputDevice.g();
        }
    }

    ap(ak ak2, al al2) {
        this(ak2);
    }
}

