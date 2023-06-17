/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.u.ay;

public class ax {
    private transient ay[] a = new ay[16];
    private transient int b;
    private int c = 12;
    private final float d = 0.75f;

    private static int g(int n2) {
        n2 = n2 ^ n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    private static int a(int n2, int n3) {
        return n2 & n3 - 1;
    }

    public Object a(int n2) {
        int n3 = ax.g(n2);
        ay ay2 = this.a[ax.a(n3, this.a.length)];
        while (ay2 != null) {
            if (ay2.a == n2) {
                return ay2.b;
            }
            ay2 = ay2.c;
        }
        return null;
    }

    public boolean b(int n2) {
        return this.c(n2) != null;
    }

    final ay c(int n2) {
        int n3 = ax.g(n2);
        ay ay2 = this.a[ax.a(n3, this.a.length)];
        while (ay2 != null) {
            if (ay2.a == n2) {
                return ay2;
            }
            ay2 = ay2.c;
        }
        return null;
    }

    public void a(int n2, Object object) {
        int n3 = ax.g(n2);
        int n4 = ax.a(n3, this.a.length);
        ay ay2 = this.a[n4];
        while (ay2 != null) {
            if (ay2.a == n2) {
                ay2.b = object;
                return;
            }
            ay2 = ay2.c;
        }
        this.a(n3, n2, object, n4);
    }

    private void h(int n2) {
        ay[] array = this.a;
        int n3 = array.length;
        if (n3 == 0x40000000) {
            this.c = Integer.MAX_VALUE;
        } else {
            ay[] array2 = new ay[n2];
            this.a(array2);
            this.a = array2;
            this.c = (int)((float)n2 * 0.75f);
        }
    }

    private void a(ay[] array) {
        ay[] array2 = this.a;
        int n2 = array.length;
        for (int i2 = 0; i2 < array2.length; ++i2) {
            ay ay2;
            ay ay3 = array2[i2];
            if (ay3 == null) continue;
            array2[i2] = null;
            do {
                ay2 = ay3.c;
                int n3 = ax.a(ay3.d, n2);
                ay3.c = array[n3];
                array[n3] = ay3;
                ay3 = ay2;
            } while (ay2 != null);
        }
    }

    public Object d(int n2) {
        ay ay2 = this.e(n2);
        return ay2 == null ? null : ay2.b;
    }

    final ay e(int n2) {
        ay ay2;
        int n3 = ax.g(n2);
        int n4 = ax.a(n3, this.a.length);
        ay ay3 = ay2 = this.a[n4];
        while (ay3 != null) {
            ay ay4 = ay3.c;
            if (ay3.a == n2) {
                --this.b;
                if (ay2 == ay3) {
                    this.a[n4] = ay4;
                } else {
                    ay2.c = ay4;
                }
                return ay3;
            }
            ay2 = ay3;
            ay3 = ay4;
        }
        return ay3;
    }

    public void a() {
        ay[] array = this.a;
        for (int i2 = 0; i2 < array.length; ++i2) {
            array[i2] = null;
        }
        this.b = 0;
    }

    private void a(int n2, int n3, Object object, int n4) {
        ay ay2 = this.a[n4];
        this.a[n4] = new ay(n2, n3, object, ay2);
        if (this.b++ >= this.c) {
            this.h(2 * this.a.length);
        }
    }

    static /* synthetic */ int f(int n2) {
        return ax.g(n2);
    }
}

