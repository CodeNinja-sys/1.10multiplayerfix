/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.t;

public abstract class h
implements k {
    private final String a;
    private final l b;
    private boolean c;
    private float d;
    private float e;

    protected h(String string, l l2) {
        this.a = string;
        this.b = l2;
    }

    public l d() {
        return this.b;
    }

    public boolean b() {
        return false;
    }

    public float e() {
        return 0.0f;
    }

    public final float f() {
        if (!this.c && !this.c()) {
            this.c = true;
            try {
                this.b(this.a());
            }
            catch (IOException iOException) {
                t.b("Failed to poll component: " + iOException);
            }
        }
        return this.d;
    }

    final void g() {
        this.c = false;
    }

    final void b(float f2) {
        this.d = f2;
    }

    final float h() {
        return this.e;
    }

    final void c(float f2) {
        this.e = f2;
    }

    public String i() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    protected abstract float a();
}

