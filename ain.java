/*
 * Decompiled with CFR 0.150.
 */
public class ain {
    private final String a;
    private float b = 0.1f;
    private float c = 0.2f;
    private float d = 0.5f;
    private float e = 0.5f;
    private int f = 0xFFFFFF;
    private boolean g;
    private boolean h = true;
    private String i;

    public ain(String string) {
        this.a = string;
    }

    protected ain a(float f2) {
        if (f2 > 0.1f && f2 < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.d = f2;
        return this;
    }

    protected ain b(float f2) {
        this.e = f2;
        return this;
    }

    protected ain c(float f2) {
        this.b = f2;
        return this;
    }

    protected ain d(float f2) {
        this.c = f2;
        return this;
    }

    protected ain a() {
        this.h = false;
        return this;
    }

    protected ain b() {
        this.g = true;
        return this;
    }

    protected ain a(int n2) {
        this.f = n2;
        return this;
    }

    protected ain a(String string) {
        this.i = string;
        return this;
    }

    static /* synthetic */ String a(ain ain2) {
        return ain2.a;
    }

    static /* synthetic */ float b(ain ain2) {
        return ain2.b;
    }

    static /* synthetic */ float c(ain ain2) {
        return ain2.c;
    }

    static /* synthetic */ float d(ain ain2) {
        return ain2.d;
    }

    static /* synthetic */ float e(ain ain2) {
        return ain2.e;
    }

    static /* synthetic */ int f(ain ain2) {
        return ain2.f;
    }

    static /* synthetic */ boolean g(ain ain2) {
        return ain2.g;
    }

    static /* synthetic */ boolean h(ain ain2) {
        return ain2.h;
    }

    static /* synthetic */ String i(ain ain2) {
        return ain2.i;
    }
}

