/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.q.b.i;
import net.minecraft.q.b.q;
import net.minecraft.u.b.b;

public class x
extends i {
    private final q a;

    public x(q q2) {
        this.a = q2;
    }

    @Override
    public q a(b b2) {
        return this.a;
    }

    @Override
    public q[] a(q[] arrq, int n2, int n3, int n4, int n5) {
        if (arrq == null || arrq.length < n4 * n5) {
            arrq = new q[n4 * n5];
        }
        Arrays.fill(arrq, 0, n4 * n5, this.a);
        return arrq;
    }

    @Override
    public q[] b(q[] arrq, int n2, int n3, int n4, int n5) {
        if (arrq == null || arrq.length < n4 * n5) {
            arrq = new q[n4 * n5];
        }
        Arrays.fill(arrq, 0, n4 * n5, this.a);
        return arrq;
    }

    @Override
    public q[] a(q[] arrq, int n2, int n3, int n4, int n5, boolean bl2) {
        return this.b(arrq, n2, n3, n4, n5);
    }

    @Override
    public b a(int n2, int n3, int n4, List list, Random random) {
        return list.contains(this.a) ? new b(n2 - n4 + random.nextInt(n4 * 2 + 1), 0, n3 - n4 + random.nextInt(n4 * 2 + 1)) : null;
    }

    @Override
    public boolean a(int n2, int n3, int n4, List list) {
        return list.contains(this.a);
    }
}

