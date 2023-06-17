/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.f.b;

import com.a.b.k;
import java.lang.reflect.Type;
import net.minecraft.u.ak;
import net.minecraft.u.bc;
import net.minecraft.u.d.c;
import net.minecraft.u.d.e;
import net.minecraft.x.a;
import net.minecraft.x.aa;
import net.minecraft.x.aj;
import net.minecraft.x.aw;
import net.minecraft.x.p;
import net.minecraft.x.r;
import net.minecraft.x.v;
import net.minecraft.x.x;

public class b
implements p {
    private static final k a = new com.a.b.r().a((Type)((Object)aa.class), (Object)new aj()).a((Type)((Object)r.class), (Object)new x()).a((Type)((Object)v.class), (Object)new aw()).a(net.minecraft.u.d.a.class, (Object)new net.minecraft.u.d.b()).a(c.class, (Object)new e()).a(new ak()).i();
    private v b;

    public b() {
    }

    public b(v v2) {
        this.b = v2;
    }

    @Override
    public void a(a a2) {
        this.b = (v)bc.a(a, a2.e(32767), v.class);
    }

    @Override
    public void b(a a2) {
        a2.a(a.b(this.b));
    }

    public void a(net.minecraft.x.f.a a2) {
        a2.a(this);
    }

    public v a() {
        return this.b;
    }
}

