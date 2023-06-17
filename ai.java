/*
 * Decompiled with CFR 0.150.
 */
class ai {
    final int a;
    Object b;
    ai c;
    final int d;

    ai(int n2, int n3, Object object, ai ai2) {
        this.b = object;
        this.c = ai2;
        this.a = n3;
        this.d = n2;
    }

    public final int a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        if (!(object instanceof ai)) {
            return false;
        }
        ai ai2 = (ai)object;
        return this.a == ai2.a && ((object3 = this.b()) == (object2 = ai2.b()) || object3 != null && object3.equals(object2));
    }

    public final int hashCode() {
        return cyn.f(this.a);
    }

    public final String toString() {
        return this.a() + "=" + this.b();
    }
}

