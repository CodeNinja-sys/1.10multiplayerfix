/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;

public class e {
    private static final b a = p.a.v();
    private final char[] b = new char[65536];

    public b a(int n2, int n3, int n4) {
        b b2 = (b)cn.w.a(this.b[e.b(n2, n3, n4)]);
        return b2 == null ? a : b2;
    }

    public void a(int n2, int n3, int n4, b b2) {
        this.b[e.b((int)n2, (int)n3, (int)n4)] = (char)cn.w.a(b2);
    }

    private static int b(int n2, int n3, int n4) {
        return n2 << 12 | n4 << 8 | n3;
    }

    public int a(int n2, int n3) {
        int n4 = (n2 << 12 | n3 << 8) + 256 - 1;
        for (int i2 = 255; i2 >= 0; --i2) {
            b b2 = (b)cn.w.a(this.b[n4 + i2]);
            if (b2 == null || b2 == a) continue;
            return i2;
        }
        return 0;
    }
}

