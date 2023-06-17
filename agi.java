/*
 * Decompiled with CFR 0.150.
 */
class agi {
    private final bpw a;
    private int b;
    private int c;
    private final int d;

    public agi(bpw bpw2, int n2, int n3) {
        this.a = bpw2;
        this.b = n2;
        this.c = n2;
        this.d = n3;
    }

    public void a(int n2) {
        if (n2 < this.b) {
            this.b = n2;
        } else if (n2 > this.c) {
            this.c = n2;
        }
    }

    public bpw a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}

