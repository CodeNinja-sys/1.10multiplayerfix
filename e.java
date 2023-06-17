/*
 * Decompiled with CFR 0.150.
 */
public class e {
    private byte a;
    private byte b;
    private byte c;
    private byte d;

    public e(byte by2, byte by3, byte by4, byte by5) {
        this.a = by2;
        this.b = by3;
        this.c = by4;
        this.d = by5;
    }

    public e(e e2) {
        this.a = e2.a;
        this.b = e2.b;
        this.c = e2.c;
        this.d = e2.d;
    }

    public byte a() {
        return this.a;
    }

    public byte b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public byte d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        e e2 = (e)object;
        if (this.a != e2.a) {
            return false;
        }
        if (this.d != e2.d) {
            return false;
        }
        if (this.b != e2.b) {
            return false;
        }
        return this.c == e2.c;
    }

    public int hashCode() {
        int n2 = this.a;
        n2 = 31 * n2 + this.b;
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.d;
        return n2;
    }
}

