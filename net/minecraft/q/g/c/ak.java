/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.q.b.a;
import net.minecraft.q.b.c;
import net.minecraft.q.b.i;
import net.minecraft.q.b.j;
import net.minecraft.q.b.q;
import net.minecraft.q.g.c.cx;
import net.minecraft.q.g.c.m;
import net.minecraft.u.b.b;

public class ak
extends m {
    public i a;
    public int d;
    public cx e;
    public List f;
    public List g = ov.a();
    public List h = ov.a();

    public ak() {
    }

    public ak(i i2, int n2, Random random, int n3, int n4, List list, int n5) {
        super(null, 0, random, n3, n4);
        this.a = i2;
        this.f = list;
        this.d = n5;
        q q2 = i2.a(new b(n3, 0, n4), net.minecraft.a.i.b);
        if (q2 instanceof j) {
            this.j = 1;
        } else if (q2 instanceof c) {
            this.j = 2;
        } else if (q2 instanceof a) {
            this.j = 3;
        }
        this.b(this.j);
        this.k = random.nextInt(50) == 0;
    }
}

