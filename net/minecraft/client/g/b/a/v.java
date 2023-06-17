/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.g.b.a.aw;
import net.minecraft.client.g.b.a.b;
import net.minecraft.u.ad;
import net.minecraft.u.bc;

class v
implements com.a.b.v {
    v() {
    }

    public b a(w w2, Type type, u u2) {
        z z2 = w2.t();
        ad ad2 = this.c(z2);
        int n2 = this.a(z2);
        String string = this.b(z2);
        aw aw2 = (aw)u2.a(z2, (Type)((Object)aw.class));
        return new b(ad2, n2, string, aw2);
    }

    protected int a(z z2) {
        return bc.a(z2, "tintindex", -1);
    }

    private String b(z z2) {
        return bc.f(z2, "texture");
    }

    private ad c(z z2) {
        String string = bc.a(z2, "cullface", "");
        return ad.a(string);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

