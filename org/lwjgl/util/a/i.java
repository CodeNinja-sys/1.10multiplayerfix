/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.a.n;

class i
extends n {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    i() {
        this.a();
    }

    public void a() {
        this.a = i.d(3314);
        this.b = i.d(3317);
        this.c = i.d(3315);
        this.d = i.d(3316);
        this.e = i.d(3330);
        this.f = i.d(3333);
        this.g = i.d(3331);
        this.h = i.d(3332);
    }

    public void b() {
        GL11.r(3314, this.a);
        GL11.r(3317, this.b);
        GL11.r(3315, this.c);
        GL11.r(3316, this.d);
        GL11.r(3330, this.e);
        GL11.r(3333, this.f);
        GL11.r(3331, this.g);
        GL11.r(3332, this.h);
    }
}

