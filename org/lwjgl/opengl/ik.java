/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import org.lwjgl.opengl.dq;
import org.lwjgl.opengl.dt;

class ik
extends dq {
    Buffer j;
    Buffer k;
    Buffer l;
    Buffer m;
    Buffer n;
    Buffer o;
    Buffer p;
    Buffer q;
    Buffer r;
    Buffer s;
    Buffer t;

    ik(dt dt2) {
        super(dt2);
    }

    void a(ik ik2, int n2) {
        super.a(ik2, n2);
        if ((n2 & 2) != 0) {
            this.j = ik2.j;
            this.k = ik2.k;
            this.l = ik2.l;
            this.m = ik2.m;
            this.n = ik2.n;
            this.o = ik2.o;
            this.p = ik2.p;
            this.q = ik2.q;
            this.r = ik2.r;
            this.s = ik2.s;
            this.t = ik2.t;
        }
    }

    void a() {
        super.a();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
    }
}

