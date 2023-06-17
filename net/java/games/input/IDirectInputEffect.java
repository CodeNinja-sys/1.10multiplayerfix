/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import net.java.games.input.aa;
import net.java.games.input.ak;
import net.java.games.input.dj;
import net.java.games.input.l;

final class IDirectInputEffect
implements dj {
    private final long a;
    private final aa b;
    private boolean c;

    public IDirectInputEffect(long l2, aa aa2) {
        this.a = l2;
        this.b = aa2;
    }

    public final synchronized void a(float f2) {
        try {
            this.d();
            if (f2 > 0.0f) {
                int n2 = Math.round(f2 * 10000.0f);
                this.a(n2);
                this.a(1, 0);
            } else {
                this.e();
            }
        }
        catch (IOException iOException) {
            ak.a("Failed to set rumbler gain: " + iOException.getMessage());
        }
    }

    public final l a() {
        return null;
    }

    public final String b() {
        return null;
    }

    public final synchronized void c() {
        if (!this.c) {
            this.c = true;
            IDirectInputEffect.nRelease(this.a);
        }
    }

    private static final native void nRelease(long var0);

    private final void d() {
        if (this.c) {
            throw new IOException();
        }
    }

    private final void a(int n2) {
        int n3 = IDirectInputEffect.nSetGain(this.a, n2);
        if (n3 != 3 && n3 != 4 && n3 != 0 && n3 != 8 && n3 != 12) {
            throw new IOException("Failed to set effect gain (0x" + Integer.toHexString(n3) + ")");
        }
    }

    private static final native int nSetGain(long var0, int var2);

    private final void a(int n2, int n3) {
        int n4 = IDirectInputEffect.nStart(this.a, n2, n3);
        if (n4 != 0) {
            throw new IOException("Failed to start effect (0x" + Integer.toHexString(n4) + ")");
        }
    }

    private static final native int nStart(long var0, int var2, int var3);

    private final void e() {
        int n2 = IDirectInputEffect.nStop(this.a);
        if (n2 != 0) {
            throw new IOException("Failed to stop effect (0x" + Integer.toHexString(n2) + ")");
        }
    }

    private static final native int nStop(long var0);

    protected void finalize() {
        this.c();
    }
}

