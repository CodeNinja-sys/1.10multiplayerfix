/*
 * Decompiled with CFR 0.150.
 */
class bkd {
    public final ck a;
    public final int b;
    public boolean c;
    final /* synthetic */ ave d;

    public bkd(ave ave2, int n2, ck ck2) {
        this.d = ave2;
        this.b = n2;
        this.a = ck2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return this.a.equals(((bkd)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

