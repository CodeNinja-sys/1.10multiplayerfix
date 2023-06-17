/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.OSXEvent;
import net.java.games.input.OSXHIDDevice;
import net.java.games.input.aq;
import net.java.games.input.at;
import net.java.games.input.av;
import net.java.games.input.dm;
import net.java.games.input.dn;
import net.java.games.input.j;
import net.java.games.input.l;
import net.java.games.input.m;

final class co {
    private final OSXHIDDevice a;
    private final dn b;
    private final long c;
    private final aq d;
    private final int e;
    private final int f;
    private final l g;
    private final boolean h;

    public co(OSXHIDDevice oSXHIDDevice, dn dn2, long l2, aq aq2, int n2, int n3, boolean bl2) {
        this.a = oSXHIDDevice;
        this.b = dn2;
        this.c = l2;
        this.d = aq2;
        this.e = n2;
        this.f = n3;
        this.g = this.f();
        this.h = bl2;
    }

    private final l f() {
        if (this.b.a() == dm.b) {
            return ((at)this.b.b()).a();
        }
        if (this.b.a() == dm.i) {
            return ((j)this.b.b()).a();
        }
        if (this.b.a() == dm.g) {
            return ((av)this.b.b()).a();
        }
        return null;
    }

    final l a() {
        return this.g;
    }

    final long b() {
        return this.c;
    }

    final aq c() {
        return this.d;
    }

    final boolean d() {
        return this.h && this.g instanceof m;
    }

    final boolean e() {
        return this.g instanceof m && this.g != m.C;
    }

    private dn g() {
        return this.b;
    }

    final void a(OSXEvent oSXEvent) {
        this.a.a(this.c, oSXEvent);
    }

    final float a(float f2) {
        if (this.g == m.C) {
            switch ((int)f2) {
                case 0: {
                    return 0.25f;
                }
                case 1: {
                    return 0.375f;
                }
                case 2: {
                    return 0.5f;
                }
                case 3: {
                    return 0.625f;
                }
                case 4: {
                    return 0.75f;
                }
                case 5: {
                    return 0.875f;
                }
                case 6: {
                    return 1.0f;
                }
                case 7: {
                    return 0.125f;
                }
                case 8: {
                    return 0.0f;
                }
            }
            return 0.0f;
        }
        if (this.g instanceof m && !this.h) {
            if (this.e == this.f) {
                return 0.0f;
            }
            if (f2 > (float)this.f) {
                f2 = this.f;
            } else if (f2 < (float)this.e) {
                f2 = this.e;
            }
            return 2.0f * (f2 - (float)this.e) / (float)(this.f - this.e) - 1.0f;
        }
        return f2;
    }
}

