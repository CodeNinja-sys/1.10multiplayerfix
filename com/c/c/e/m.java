/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.b.ac;
import com.c.c.c.c;
import com.c.c.d.a.s;
import com.c.c.d.d;
import com.c.c.e.f;
import net.minecraft.s.b;
import net.minecraft.s.n;

public class m
extends d {
    private final long b;
    private final ac c;
    private final s d;

    public m(long l2, ac ac2, s s2) {
        this.b = l2;
        this.c = ac2;
        this.d = s2;
    }

    @Override
    public void run() {
        com.c.c.a.m m2 = com.c.c.a.m.a();
        String string = n.f("mco.minigame.world.starting.screen.title");
        this.b(string);
        for (int i2 = 0; i2 < 25; ++i2) {
            try {
                if (this.b()) {
                    return;
                }
                if (!m2.d(this.b, this.c.a).booleanValue()) continue;
                net.minecraft.s.b.a(this.d);
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
                f.a().b("Couldn't start mini game!");
                this.a(exception.toString());
            }
        }
    }
}

