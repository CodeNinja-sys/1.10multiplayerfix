/*
 * Decompiled with CFR 0.150.
 */
public class cyn {
    private transient ai[] a = new ai[16];
    private transient int b;
    private int c = 12;
    private final float d;

    public cyn() {
        this.d = 0.75f;
    }

    private static int g(int n2) {
        n2 ^= n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    private static int a(int n2, int n3) {
        return n2 & n3 - 1;
    }

    public Object a(int n2) {
        int n3 = cyn.g(n2);
        ai ai2 = this.a[cyn.a(n3, this.a.length)];
        while (ai2 != null) {
            if (ai2.a == n2) {
                return ai2.b;
            }
            ai2 = ai2.c;
        }
        return null;
    }

    public boolean b(int n2) {
        return this.c(n2) != null;
    }

    final ai c(int n2) {
        int n3 = cyn.g(n2);
        ai ai2 = this.a[cyn.a(n3, this.a.length)];
        while (ai2 != null) {
            if (ai2.a == n2) {
                return ai2;
            }
            ai2 = ai2.c;
        }
        return null;
    }

    public void a(int n2, Object object) {
        int n3 = cyn.g(n2);
        int n4 = cyn.a(n3, this.a.length);
        ai ai2 = this.a[n4];
        while (ai2 != null) {
            if (ai2.a == n2) {
                ai2.b = object;
                return;
            }
            ai2 = ai2.c;
        }
        this.a(n3, n2, object, n4);
    }

    private void h(int n2) {
        ai[] arrai = this.a;
        int n3 = arrai.length;
        if (n3 == 0x40000000) {
            this.c = Integer.MAX_VALUE;
            return;
        }
        ai[] arrai2 = new ai[n2];
        this.a(arrai2);
        this.a = arrai2;
        this.c = (int)((float)n2 * this.d);
    }

    private void a(ai[] arrai) {
        ai[] arrai2 = this.a;
        int n2 = arrai.length;
        for (int i2 = 0; i2 < arrai2.length; ++i2) {
            ai ai2;
            ai ai3 = arrai2[i2];
            if (ai3 == null) continue;
            arrai2[i2] = null;
            do {
                ai2 = ai3.c;
                int n3 = cyn.a(ai3.d, n2);
                ai3.c = arrai[n3];
                arrai[n3] = ai3;
            } while ((ai3 = ai2) != null);
        }
    }

    public Object d(int n2) {
        ai ai2 = this.e(n2);
        return ai2 == null ? null : ai2.b;
    }

    final ai e(int n2) {
        ai ai2;
        int n3 = cyn.g(n2);
        int n4 = cyn.a(n3, this.a.length);
        ai ai3 = ai2 = this.a[n4];
        while (ai3 != null) {
            ai ai4 = ai3.c;
            if (ai3.a == n2) {
                --this.b;
                if (ai2 == ai3) {
                    this.a[n4] = ai4;
                } else {
                    ai2.c = ai4;
                }
                return ai3;
            }
            ai2 = ai3;
            ai3 = ai4;
        }
        return ai3;
    }

    public void a() {
        ai[] arrai = this.a;
        for (int i2 = 0; i2 < arrai.length; ++i2) {
            arrai[i2] = null;
        }
        this.b = 0;
    }

    private void a(int n2, int n3, Object object, int n4) {
        ai ai2 = this.a[n4];
        this.a[n4] = new ai(n2, n3, object, ai2);
        if (this.b++ >= this.c) {
            this.h(2 * this.a.length);
        }
    }

    static /* synthetic */ int f(int n2) {
        return cyn.g(n2);
    }
}

