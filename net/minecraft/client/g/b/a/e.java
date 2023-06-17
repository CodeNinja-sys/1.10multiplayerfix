/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.g.b.a.h;
import net.minecraft.client.g.b.a.q;

class e
implements v {
    e() {
    }

    public q a(w w2, Type type, u u2) {
        z z2 = w2.t();
        h h2 = this.a(u2, z2, "thirdperson_righthand");
        h h3 = this.a(u2, z2, "thirdperson_lefthand");
        if (h3 == h.a) {
            h3 = h2;
        }
        h h4 = this.a(u2, z2, "firstperson_righthand");
        h h5 = this.a(u2, z2, "firstperson_lefthand");
        if (h5 == h.a) {
            h5 = h4;
        }
        h h6 = this.a(u2, z2, "head");
        h h7 = this.a(u2, z2, "gui");
        h h8 = this.a(u2, z2, "ground");
        h h9 = this.a(u2, z2, "fixed");
        return new q(h3, h2, h5, h4, h6, h7, h8, h9);
    }

    private h a(u u2, z z2, String string) {
        return z2.b(string) ? (h)u2.a(z2.c(string), (Type)((Object)h.class)) : h.a;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

