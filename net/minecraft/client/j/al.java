/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;

public class al
extends ap {
    public w a;
    public w b;

    public al() {
        this.t = 64;
        this.u = 64;
        this.a = new w(this, 0, 0);
        this.a.a(-6.0f, -11.0f, -2.0f, 12, 22, 1, 0.0f);
        this.b = new w(this, 26, 0);
        this.b.a(-1.0f, -3.0f, -1.0f, 2, 6, 6, 0.0f);
    }

    public void a() {
        this.a.a(0.0625f);
        this.b.a(0.0625f);
    }
}

