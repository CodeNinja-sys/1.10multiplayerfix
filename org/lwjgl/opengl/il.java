/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ik;

class il {
    private ik[] a;
    private int b;

    public ik a() {
        return this.a[this.b];
    }

    public void b() {
        int n2;
        if ((n2 = ++this.b) == this.a.length) {
            this.c();
        }
        this.a[n2].a(this.a[n2 - 1], -1);
    }

    public ik a(int n2) {
        ik ik2 = this.a[this.b--];
        this.a[this.b].a(ik2, ~n2);
        ik2.a();
        return ik2;
    }

    private void c() {
        ik[] arrik = new ik[this.a.length + 1];
        System.arraycopy(this.a, 0, arrik, 0, this.a.length);
        this.a = arrik;
        this.a[this.a.length - 1] = new ik(GLContext.a());
    }

    il() {
        dt dt2 = GLContext.a();
        this.a = new ik[1];
        this.b = 0;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new ik(dt2);
        }
    }
}

