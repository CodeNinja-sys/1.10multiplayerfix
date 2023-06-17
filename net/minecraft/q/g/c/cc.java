/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.q.g.c.bu;
import net.minecraft.q.g.c.cu;
import net.minecraft.q.g.c.o;

public class cc
extends cu {
    public o a;
    public List d;
    public List e;
    public List f = ov.a();

    public cc() {
    }

    public cc(Random random, int n2, int n3) {
        super(random, n2, n3);
        this.d = ov.a();
        for (o o2 : bu.b()) {
            o2.c = 0;
            this.d.add(o2);
        }
        this.e = ov.a();
        for (o o2 : bu.c()) {
            o2.c = 0;
            this.e.add(o2);
        }
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
    }
}

