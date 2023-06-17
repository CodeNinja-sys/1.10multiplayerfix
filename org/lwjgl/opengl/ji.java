/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.util.List;

public class ji
implements Cloneable {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public int f;

    ji(String string, int n2, int n3, int n4, int n5, int n6) {
        this.a = string;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
    }

    private void a(List list) {
        list.add("--output");
        list.add(this.a);
        list.add("--mode");
        list.add(this.b + "x" + this.c);
        list.add("--rate");
        list.add(Integer.toString(this.d));
        list.add("--pos");
        list.add(this.e + "x" + this.f);
    }

    public String toString() {
        return this.a + " " + this.b + "x" + this.c + " @ " + this.e + "x" + this.f + " with " + this.d + "Hz";
    }

    static /* synthetic */ void a(ji ji2, List list) {
        ji2.a(list);
    }
}

