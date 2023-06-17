/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.cm;
import java.net.IDN;
import net.minecraft.client.k.ax;
import net.minecraft.u.bw;

class ad
implements cm {
    final /* synthetic */ ax a;

    ad(ax ax2) {
        this.a = ax2;
    }

    public boolean a(String string) {
        if (bw.b(string)) {
            return true;
        }
        String[] arrstring = string.split(":");
        if (arrstring.length == 0) {
            return true;
        }
        try {
            String string2 = IDN.toASCII(arrstring[0]);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((String)object);
    }
}

