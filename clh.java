/*
 * Decompiled with CFR 0.150.
 */
public class clh
extends bsq {
    public Class a;
    public int b;
    public int d;

    public clh(Class class_, int n2, int n3, int n4) {
        super(n2);
        this.a = class_;
        this.b = n3;
        this.d = n4;
    }

    public String toString() {
        return this.a.getSimpleName() + "*(" + this.b + "-" + this.d + "):" + this.c;
    }
}

