/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

class ir {
    private int[] a = new int[1];
    private int b = 0;

    public int a() {
        return this.a[this.b];
    }

    public void a(int n2) {
        int n3;
        if ((n3 = ++this.b) == this.a.length) {
            this.c();
        }
        this.a[n3] = n2;
    }

    public int b() {
        return this.a[this.b--];
    }

    public void c() {
        int[] arrn = new int[this.a.length + 1];
        System.arraycopy(this.a, 0, arrn, 0, this.a.length);
        this.a = arrn;
    }

    ir(int n2) {
        this.a[this.b] = n2;
    }
}

