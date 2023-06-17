/*
 * Decompiled with CFR 0.150.
 */
public final class tg
implements Comparable {
    public double a;
    public double b;
    public String c;

    public tg(String string, double d2, double d3) {
        this.c = string;
        this.a = d2;
        this.b = d3;
    }

    public int a(tg tg2) {
        if (tg2.a < this.a) {
            return -1;
        }
        if (tg2.a > this.a) {
            return 1;
        }
        return tg2.c.compareTo(this.c);
    }

    public int a() {
        return (this.c.hashCode() & 0xAAAAAA) + 0x444444;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((tg)object);
    }
}

