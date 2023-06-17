/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import org.lwjgl.a.j;
import org.lwjgl.opengl.dx;

public class bk {
    public int a;
    public int b;

    public void a() {
        j.b(true);
        this.a = 0;
        this.b = 0;
    }

    public void b() {
        j.a(dx.C() / 2, dx.D() / 2);
        j.b(false);
    }

    public void c() {
        this.a = j.s();
        this.b = j.t();
    }
}

