/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import net.java.games.input.bc;
import net.java.games.input.bf;
import net.java.games.input.bg;
import net.java.games.input.t;

final class bp
extends Thread {
    private final bf a;

    private bp(bf bf2) {
        this.a = bf2;
    }

    public final void run() {
        for (int i2 = 0; i2 < bf.a(this.a).size(); ++i2) {
            try {
                bc bc2 = (bc)bf.a(this.a).get(i2);
                bc2.a();
                continue;
            }
            catch (IOException iOException) {
                t.a("Failed to close device: " + iOException.getMessage());
            }
        }
    }

    bp(bf bf2, bg bg2) {
        this(bf2);
    }
}

