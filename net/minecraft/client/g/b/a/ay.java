/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.sz;
import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.client.g.b.a.ac;
import net.minecraft.client.g.b.a.ak;
import net.minecraft.client.g.b.a.b;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.b.n;
import net.minecraft.u.bc;
import org.lwjgl.util.e.l;

class ay
implements v {
    ay() {
    }

    public ak a(w w2, Type type, u u2) {
        z z2 = w2.t();
        l l2 = this.e(z2);
        l l3 = this.d(z2);
        ac ac2 = this.a(z2);
        Map map = this.a(u2, z2);
        if (z2.b("shade") && !bc.b(z2, "shade")) {
            throw new aa("Expected shade to be a Boolean");
        }
        boolean bl2 = bc.a(z2, "shade", true);
        return new ak(l2, l3, map, ac2, bl2);
    }

    private ac a(z z2) {
        ac ac2 = null;
        if (z2.b("rotation")) {
            z z3 = bc.k(z2, "rotation");
            l l2 = this.a(z3, "origin");
            l2.a(0.0625f);
            ae ae2 = this.c(z3);
            float f2 = this.b(z3);
            boolean bl2 = bc.a(z3, "rescale", false);
            ac2 = new ac(l2, ae2, f2, bl2);
        }
        return ac2;
    }

    private float b(z z2) {
        float f2 = bc.i(z2, "angle");
        if (f2 != 0.0f && n.e(f2) != 22.5f && n.e(f2) != 45.0f) {
            throw new aa("Invalid rotation " + f2 + " found, only -45/-22.5/0/22.5/45 allowed");
        }
        return f2;
    }

    private ae c(z z2) {
        String string = bc.f(z2, "axis");
        ae ae2 = ae.a(string.toLowerCase());
        if (ae2 == null) {
            throw new aa("Invalid rotation axis: " + string);
        }
        return ae2;
    }

    private Map a(u u2, z z2) {
        Map map = this.b(u2, z2);
        if (map.isEmpty()) {
            throw new aa("Expected between 1 and 6 unique faces, got 0");
        }
        return map;
    }

    private Map b(u u2, z z2) {
        EnumMap enumMap = sz.a(ad.class);
        z z3 = bc.k(z2, "faces");
        for (Map.Entry entry : z3.b()) {
            ad ad2 = this.a((String)entry.getKey());
            enumMap.put(ad2, (b)u2.a((w)entry.getValue(), (Type)((Object)b.class)));
        }
        return enumMap;
    }

    private ad a(String string) {
        ad ad2 = ad.a(string);
        if (ad2 == null) {
            throw new aa("Unknown facing: " + string);
        }
        return ad2;
    }

    private l d(z z2) {
        l l2 = this.a(z2, "to");
        if (l2.a >= -16.0f && l2.b >= -16.0f && l2.c >= -16.0f && l2.a <= 32.0f && l2.b <= 32.0f && l2.c <= 32.0f) {
            return l2;
        }
        throw new aa("'to' specifier exceeds the allowed boundaries: " + l2);
    }

    private l e(z z2) {
        l l2 = this.a(z2, "from");
        if (l2.a >= -16.0f && l2.b >= -16.0f && l2.c >= -16.0f && l2.a <= 32.0f && l2.b <= 32.0f && l2.c <= 32.0f) {
            return l2;
        }
        throw new aa("'from' specifier exceeds the allowed boundaries: " + l2);
    }

    private l a(z z2, String string) {
        t t2 = bc.l(z2, string);
        if (t2.b() != 3) {
            throw new aa("Expected 3 " + string + " values, found: " + t2.b());
        }
        float[] arrf = new float[3];
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrf[i2] = bc.d(t2.a(i2), String.valueOf(string) + "[" + i2 + "]");
        }
        return new l(arrf[0], arrf[1], arrf[2]);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

