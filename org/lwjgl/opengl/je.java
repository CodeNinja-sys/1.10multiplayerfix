/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.jb;

final class je {
    public int a;
    public int b;
    public int c;
    public int d;

    private je() {
    }

    public void a(IntBuffer intBuffer) {
        intBuffer.put(0, this.a).put(1, this.b).put(2, this.c).put(3, this.d);
    }

    public void b(IntBuffer intBuffer) {
        this.a = intBuffer.get(0);
        this.b = intBuffer.get(1);
        this.c = intBuffer.get(2);
        this.d = intBuffer.get(3);
    }

    public void a(int n2, int n3) {
        this.a += n2;
        this.b += n3;
        this.c += n2;
        this.d += n3;
    }

    public static void a(je je2, je je3, je je4) {
        je4.a = Math.max(je2.a, je3.a);
        je4.b = Math.max(je2.b, je3.b);
        je4.c = Math.min(je2.c, je3.c);
        je4.d = Math.min(je2.d, je3.d);
    }

    public String toString() {
        return "Rect: left = " + this.a + " top = " + this.b + " right = " + this.c + " bottom = " + this.d + ", width: " + (this.c - this.a) + ", height: " + (this.d - this.b);
    }

    /* synthetic */ je(jb jb2) {
        this();
    }
}

