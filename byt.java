/*
 * Decompiled with CFR 0.150.
 */
class byt {
    public Class a;
    public final int b;
    public int c;
    public int d;
    public boolean e;

    public byt(Class class_, int n2, int n3, boolean bl2) {
        this.a = class_;
        this.b = n2;
        this.d = n3;
        this.e = bl2;
    }

    public byt(Class class_, int n2, int n3) {
        this(class_, n2, n3, false);
    }

    public boolean a(int n2) {
        return this.d == 0 || this.c < this.d;
    }

    public boolean a() {
        return this.d == 0 || this.c < this.d;
    }
}

