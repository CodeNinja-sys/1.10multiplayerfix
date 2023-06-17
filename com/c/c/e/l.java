/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.a.m;
import com.c.c.b.ac;
import com.c.c.c.c;
import com.c.c.d.d;
import com.c.c.e.f;
import net.minecraft.s.b;
import net.minecraft.s.n;

public class l
extends d {
    private final String b;
    private final ac c;
    private final int d;
    private final boolean e;
    private final long f;
    private final n g;
    private int h = -1;
    private String i = n.f("mco.reset.world.resetting.screen.title");

    public l(long l2, n n2, ac ac2) {
        this.b = null;
        this.c = ac2;
        this.d = -1;
        this.e = true;
        this.f = l2;
        this.g = n2;
    }

    public l(long l2, n n2, String string, int n3, boolean bl2) {
        this.b = string;
        this.c = null;
        this.d = n3;
        this.e = bl2;
        this.f = l2;
        this.g = n2;
    }

    public void a(int n2) {
        this.h = n2;
    }

    public void c(String string) {
        this.i = string;
    }

    @Override
    public void run() {
        m m2 = m.a();
        this.b(this.i);
        for (int i2 = 0; i2 < 25; ++i2) {
            try {
                if (this.b()) {
                    return;
                }
                if (this.c != null) {
                    m2.g(this.f, this.c.a);
                } else {
                    m2.a(this.f, this.b, this.d, this.e);
                }
                if (this.b()) {
                    return;
                }
                if (this.h != -1) {
                    this.g.a(true, this.h);
                } else {
                    net.minecraft.s.b.a(this.g);
                }
                return;
            }
            catch (c c2) {
                if (this.b()) {
                    return;
                }
                com.c.c.e.f.a(c2.f);
                continue;
            }
            catch (Exception exception) {
                if (this.b()) {
                    return;
                }
                com.c.c.e.f.a().b("Couldn't reset world");
                this.a(exception.toString());
                return;
            }
        }
    }
}

