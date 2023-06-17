/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import net.minecraft.q.b.ap;
import net.minecraft.q.b.l;
import net.minecraft.q.b.w;
import net.minecraft.q.b.y;
import net.minecraft.q.n;
import net.minecraft.u.b.b;
import net.minecraft.u.b.g;

public class s {
    private static final ap a = new y();
    private static final ap b = new w();
    private static final ap c = new l();

    private static int a(n n2, b b2, ap ap2) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (g g2 : net.minecraft.u.b.b.b(b2.a(-1, 0, -1), b2.a(1, 0, 1))) {
            int n6 = ap2.a(n2.a(g2), g2);
            n3 += (n6 & 0xFF0000) >> 16;
            n4 += (n6 & 0xFF00) >> 8;
            n5 += n6 & 0xFF;
        }
        return (n3 / 9 & 0xFF) << 16 | (n4 / 9 & 0xFF) << 8 | n5 / 9 & 0xFF;
    }

    public static int a(n n2, b b2) {
        return s.a(n2, b2, a);
    }

    public static int b(n n2, b b2) {
        return s.a(n2, b2, b);
    }

    public static int c(n n2, b b2) {
        return s.a(n2, b2, c);
    }
}

