/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.q.b.am;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.bm;
import net.minecraft.q.g.c.j;
import net.minecraft.w.e.aa;
import net.minecraft.w.e.ao;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.bh;

public class dp
extends at {
    private final List a = ov.a();

    public dp() {
        this.a.add(new am(aa.class, 10, 2, 3));
        this.a.add(new am(ao.class, 5, 4, 4));
        this.a.add(new am(ay.class, 10, 4, 4));
        this.a.add(new am(bh.class, 3, 4, 4));
    }

    @Override
    public String a() {
        return "Fortress";
    }

    public List c() {
        return this.a;
    }

    @Override
    protected boolean a(int n2, int n3) {
        int n4 = n2 >> 4;
        int n5 = n3 >> 4;
        this.f.setSeed((long)(n4 ^ n5 << 4) ^ this.g.A());
        this.f.nextInt();
        return this.f.nextInt(3) != 0 ? false : (n2 != (n4 << 4) + 4 + this.f.nextInt(8) ? false : n3 == (n5 << 4) + 4 + this.f.nextInt(8));
    }

    @Override
    protected j b(int n2, int n3) {
        return new bm(this.g, this.f, n2, n3);
    }
}

