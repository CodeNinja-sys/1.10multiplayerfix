/*
 * Decompiled with CFR 0.150.
 */
public class cgh {
    private final cmz a;
    private final bfa b;
    private final int c;
    private final int d;

    public cgh(cmz cmz2, bfa bfa2, int n2, int n3) {
        this.a = cmz2;
        this.c = n2;
        this.d = n3;
        this.b = bfa2;
    }

    public cmz a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public bfa d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object instanceof cgh) {
            cgh cgh2 = (cgh)object;
            return this.a.equals(cgh2.a) && this.c == cgh2.c && this.d == cgh2.d && this.b == cgh2.b;
        }
        return false;
    }

    public String toString() {
        return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
    }
}

