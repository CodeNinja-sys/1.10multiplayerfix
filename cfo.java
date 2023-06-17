/*
 * Decompiled with CFR 0.150.
 */
public class cfo {
    private final int a;
    private final int b;

    public cfo(int n2) {
        this(n2, -1);
    }

    public cfo(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a() {
        return this.b == -1;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }
}

