/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import com.a.a.d.ov;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.c.d;
import net.minecraft.client.c.l;
import net.minecraft.client.c.q;
import net.minecraft.u.bc;
import org.apache.commons.c.ao;

public class s
implements v {
    public q a(w w2, Type type, u u2) {
        z z2 = bc.f(w2, "entry");
        boolean bl2 = bc.a(z2, "replace", false);
        String string = bc.a(z2, "subtitle", null);
        List list = this.a(z2);
        return new q(list, bl2, string);
    }

    private List a(z z2) {
        ArrayList arrayList = ov.a();
        if (z2.b("sounds")) {
            t t2 = bc.l(z2, "sounds");
            for (int i2 = 0; i2 < t2.b(); ++i2) {
                w w2 = t2.a(i2);
                if (bc.a(w2)) {
                    String string = bc.a(w2, "sound");
                    arrayList.add(new l(string, 1.0f, 1.0f, 1, d.a, false));
                    continue;
                }
                arrayList.add(this.b(bc.f(w2, "sound")));
            }
        }
        return arrayList;
    }

    private l b(z z2) {
        String string = bc.f(z2, "name");
        d d2 = this.a(z2, d.a);
        float f2 = bc.a(z2, "volume", 1.0f);
        ao.a(f2 > 0.0f, "Invalid volume", new Object[0]);
        float f3 = bc.a(z2, "pitch", 1.0f);
        ao.a(f3 > 0.0f, "Invalid pitch", new Object[0]);
        int n2 = bc.a(z2, "weight", 1);
        ao.a(n2 > 0, "Invalid weight", new Object[0]);
        boolean bl2 = bc.a(z2, "stream", false);
        return new l(string, f2, f3, n2, d2, bl2);
    }

    private d a(z z2, d d2) {
        d d3 = d2;
        if (z2.b("type")) {
            d3 = d.a(bc.f(z2, "type"));
            ao.a((Object)d3, "Invalid type", new Object[0]);
        }
        return d3;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

