/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.a.m;
import com.c.c.c.c;
import com.c.c.d.d;
import com.c.c.e.f;

public class n
extends d {
    private final long b;
    private final int c;
    private final net.minecraft.s.n d;
    private final int e;

    public n(long l2, int n2, net.minecraft.s.n n3, int n4) {
        this.b = l2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
    }

    @Override
    public void run() {
        m m2 = m.a();
        String string = net.minecraft.s.n.f("mco.minigame.world.slot.screen.title");
        this.b(string);
        for (int i2 = 0; i2 < 25; ++i2) {
            try {
                if (this.b()) {
                    return;
                }
                if (!m2.a(this.b, this.c)) continue;
                this.d.a(true, this.e);
                break;
            }
            catch (c c2) {
                if (this.b()) {
                    return;
                }
                f.a(c2.f);
                continue;
            }
            catch (Exception exception) {
                if (this.b()) {
                    return;
                }
                f.a().b("Couldn't switch world!");
                this.a(exception.toString());
            }
        }
    }
}

