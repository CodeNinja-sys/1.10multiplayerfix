/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import net.minecraft.client.f.j;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.ac;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.l;
import net.minecraft.u.c.a;

public class g
implements j {
    private a a;
    private final f b;
    private final ac c;
    private aq d;

    public g(f f2) {
        this.b = f2;
        this.c = new ac(this);
    }

    @Override
    public void a(s s2) {
        l l2 = new l(s2, this.b, this.c);
        this.a = l2.a();
        this.d = (aq)this.a.a(l.a);
        this.c.c();
    }

    public aq a(ag ag2) {
        if (ag2 == null) {
            return this.d;
        }
        aq aq2 = (aq)this.a.a(ag2);
        return aq2 == null ? this.d : aq2;
    }

    public aq a() {
        return this.d;
    }

    public f b() {
        return this.b;
    }

    public ac c() {
        return this.c;
    }
}

