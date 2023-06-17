/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f.a;

import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.f.a.h;
import net.minecraft.client.f.a.n;
import net.minecraft.u.bc;

public class b
extends n {
    public h a(w w2, Type type, u u2) {
        z z2 = w2.t();
        boolean bl2 = bc.a(z2, "blur", false);
        boolean bl3 = bc.a(z2, "clamp", false);
        return new h(bl2, bl3);
    }

    @Override
    public String a() {
        return "texture";
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

