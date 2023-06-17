/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import net.java.games.input.LinuxEventDevice;
import net.java.games.input.bf;
import net.java.games.input.bu;
import net.java.games.input.bv;
import net.java.games.input.dj;
import net.java.games.input.l;

abstract class bs
implements dj {
    private final LinuxEventDevice a;
    private final int b;
    private final bv c = new bv(this, null);
    private final bu d = new bu(this, null);

    public bs(LinuxEventDevice linuxEventDevice) {
        this.a = linuxEventDevice;
        this.b = this.d.a(-1, 0.0f);
    }

    protected abstract int a(int var1, float var2);

    protected final LinuxEventDevice c() {
        return this.a;
    }

    public final synchronized void a(float f2) {
        try {
            if (f2 > 0.0f) {
                this.d.a(this.b, f2);
                this.c.a(1);
            } else {
                this.c.a(0);
            }
        }
        catch (IOException iOException) {
            bf.a("Failed to rumble: " + iOException);
        }
    }

    public final String b() {
        return null;
    }

    public final l a() {
        return null;
    }

    static int a(bs bs2) {
        return bs2.b;
    }

    static LinuxEventDevice b(bs bs2) {
        return bs2.a;
    }
}

