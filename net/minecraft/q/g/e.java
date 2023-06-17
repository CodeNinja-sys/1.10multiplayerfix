/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.u.bp;

public class e {
    private final int a;
    private b b;
    private int c = 1;
    private int d;

    public e(int n2, cn cn2) {
        this(3, n2, cn2);
    }

    public e(int n2, int n3, cn cn2) {
        this.a = n2;
        this.c = n3;
        this.b = cn2.v();
    }

    public e(int n2, int n3, cn cn2, int n4) {
        this(n2, n3, cn2);
        this.b = cn2.a(n4);
    }

    public int a() {
        return this.c;
    }

    public b b() {
        return this.b;
    }

    private cn d() {
        return this.b.c();
    }

    private int e() {
        return this.b.c().b(this.b);
    }

    public int c() {
        return this.d;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public String toString() {
        int n2;
        String string;
        if (this.a >= 3) {
            bp bp2 = (bp)cn.v.b(this.d());
            String string2 = string = bp2 == null ? "null" : bp2.toString();
            if (this.c > 1) {
                string = String.valueOf(this.c) + "*" + string;
            }
        } else {
            string = Integer.toString(cn.c(this.d()));
            if (this.c > 1) {
                string = String.valueOf(this.c) + "x" + string;
            }
        }
        if ((n2 = this.e()) > 0) {
            string = String.valueOf(string) + ":" + n2;
        }
        return string;
    }
}

