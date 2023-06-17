/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

public class ab {
    private final String a;
    private float b = 0.1f;
    private float c = 0.2f;
    private float d = 0.5f;
    private float e = 0.5f;
    private int f = 0xFFFFFF;
    private boolean g;
    private boolean h = true;
    private String i;

    public ab(String string) {
        this.a = string;
    }

    protected ab a(float f2) {
        if (f2 > 0.1f && f2 < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.d = f2;
        return this;
    }

    protected ab b(float f2) {
        this.e = f2;
        return this;
    }

    protected ab c(float f2) {
        this.b = f2;
        return this;
    }

    protected ab d(float f2) {
        this.c = f2;
        return this;
    }

    protected ab a() {
        this.h = false;
        return this;
    }

    protected ab b() {
        this.g = true;
        return this;
    }

    protected ab a(int n2) {
        this.f = n2;
        return this;
    }

    protected ab a(String string) {
        this.i = string;
        return this;
    }

    static /* synthetic */ String a(ab ab2) {
        return ab2.a;
    }

    static /* synthetic */ float b(ab ab2) {
        return ab2.b;
    }

    static /* synthetic */ float c(ab ab2) {
        return ab2.c;
    }

    static /* synthetic */ float d(ab ab2) {
        return ab2.d;
    }

    static /* synthetic */ float e(ab ab2) {
        return ab2.e;
    }

    static /* synthetic */ int f(ab ab2) {
        return ab2.f;
    }

    static /* synthetic */ boolean g(ab ab2) {
        return ab2.g;
    }

    static /* synthetic */ boolean h(ab ab2) {
        return ab2.h;
    }

    static /* synthetic */ String i(ab ab2) {
        return ab2.i;
    }
}

