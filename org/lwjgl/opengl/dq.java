/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.util.Arrays;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.dt;

class dq {
    int a;
    int b;
    final Buffer[] c;
    final Buffer[] d;
    int e;
    int f;
    int g;
    int h;
    int i;

    dq(dt dt2) {
        int n2 = dt2.ex || dt2.cI ? GL11.r(34921) : 0;
        this.c = new Buffer[n2];
        int n3 = dt2.ex ? GL11.r(34930) : (dt2.eu || dt2.ba ? GL11.r(34018) : 1);
        this.d = new Buffer[n3];
    }

    void a() {
        this.a = 0;
        this.b = 0;
        this.e = 0;
        Arrays.fill(this.c, null);
        Arrays.fill(this.d, null);
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    void a(dq dq2, int n2) {
        if ((n2 & 2) != 0) {
            this.a = dq2.a;
            this.b = dq2.b;
            this.e = dq2.e;
            System.arraycopy(dq2.c, 0, this.c, 0, this.c.length);
            System.arraycopy(dq2.d, 0, this.d, 0, this.d.length);
            this.f = dq2.f;
            this.i = dq2.i;
        }
        if ((n2 & 1) != 0) {
            this.g = dq2.g;
            this.h = dq2.h;
        }
    }
}

